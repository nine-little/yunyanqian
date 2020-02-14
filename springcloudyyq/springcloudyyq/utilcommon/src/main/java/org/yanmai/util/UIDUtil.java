package org.yanmai.util;

import org.springframework.beans.factory.InitializingBean;
import java.util.*;

/**
 * 生成用户UId
 * 
 * @author bert 2016-4-19
 * 
 */
public class UIDUtil implements InitializingBean {

	
	// 加载数据库有的uid
	private static Set<String> uids = Collections
			.synchronizedSet(new HashSet<String>());
	private static Set<String> gids = Collections
			.synchronizedSet(new HashSet<String>());
	//五位用户id 和五位群id
	private static int STR_LENGTH = 5;
	// 过滤字段
	private static String[] FilterStrs = { "686868", "868686" };
    
	private static UIDUtil uidUtil;
	public static UIDUtil getInstance(){
		if(uidUtil==null){
			uidUtil=new UIDUtil();
		}
		return uidUtil;
	}
	private void init() {
		//加载已经注册用户id

	}
	/**
	 * 用户的独立id
	 *Administrator
	 *@return
	 *@throws Exception
	 */
	public String creareUid(){
		String uid;
		int i=0;
		// 循环判断
		do {
			i++;
			uid = randomStr();
			//循环次数大于规定lenth就会越界
			if(String.valueOf(i).length()>STR_LENGTH){				
				try {
					throw new Exception("User length over");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}	
		} while (uids.contains(uid) || isFilter(uid));

		// 添加到缓存中
		uids.add(uid);
		return uid;
	}
	/**
	 * 群id
	 *Administrator 
	 *@return
	 *@throws Exception
	 */
	public String creareGid(){
		String gid;
		int i=0;
		// 循环判断
		do {
			i++;
			gid = randomStr();
			//循环次数大于规定lenth就会越界
			if(String.valueOf(i).length()>STR_LENGTH){				
				try {
					throw new Exception("Group length over");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} while (gids.contains(gid) || isFilter(gid));

		// 添加到缓存中
		gids.add(gid);
		return gid;
	}
	/**
	 * 生成uid Administrator
	 * 
	 * @return
	 */
	private static String randomStr() {

		StringBuffer strBuffer = new StringBuffer();
		Random random = new Random();
		while (true) {
			int ra = random.nextInt(10);
			strBuffer.append("" + ra);
			if (strBuffer.length() == STR_LENGTH) {
				break;
			}
		}
		String uid = strBuffer.toString();
		return uid;
	}

	public static void main(String[] args) {
		UUID s = UUID.randomUUID();
		System.out.println(s);
	}

	/**
	 * 判断吉利数字过滤。有三位相等的 Administrator
	 * 
	 * @param str
	 * @return
	 */
	private boolean isFilter(String str) {
		List<String> list = Arrays.asList(FilterStrs);
		// 顾虑指定字段
		if (list.contains(str))
			return true;
		// 过滤三位相等
		char[] chars = str.toCharArray();
		for (int i = 0; i < STR_LENGTH; i++) {
			if ((i + 2) < STR_LENGTH && (chars[i] == chars[i + 1])
					&& (chars[i + 1]) == chars[i + 2]) {
				return true;
			}
		}
		return false;
	}


	@Override
	public void afterPropertiesSet() throws Exception {

	}
}
