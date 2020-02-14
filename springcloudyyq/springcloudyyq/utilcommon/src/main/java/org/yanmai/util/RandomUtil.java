package org.yanmai.util;

import java.util.Random;
import java.util.UUID;


public class RandomUtil {
	
	private static Random random = new Random();
	
	public static long getNumberBetweenTwoNumber(long minNum,long maxNum){
		long a = (long) (Math.random()*(maxNum-minNum)+minNum);
		if(a>maxNum||a<minNum){
			System.out.println(a);
		}
		return a;
	}
	public static String getNumber(int length){
		StringBuffer buffer=new StringBuffer();
		Random random=new Random();
	    for(int i=0;i<length;i++){
	    	
	    	buffer.append(random.nextInt(10));
	    }
		return buffer.toString();
		
	}
	/**
	 * 生成邀请码。根据玩家角色ID和服务器ID。
	 * @param playerId
	 * @param serverId
	 * @return
	 */
	public static String randomInviteCode(int playerId,int serverId){
		String sid = Integer.toHexString(serverId);
		String pid = Integer.toHexString(playerId);
		return sid+pid;
	}
	
	/**
	 * 根据玩家角色ID和随机数生成邀请码
	 * @param playerId
	 * @return
	 */
	public static String randomInviteCode(int playerId){
		int len = String.valueOf(playerId).length();
		int nlen = 0;
		if(len<8){
			nlen = 8-len;
			String num = getGenNumber().substring(0,nlen);
			if(num.matches("[0-9]+")){
				randomInviteCode(playerId);
			}
			return playerId+num;
		}
		return "";
	}
	
	public static String getGenNumber(){
		String snum = UUID.randomUUID().toString().split("-")[0];
		if(snum.matches("[0-9]+")){
			getGenNumber();
		}
		return snum;
	}
	
	
	public static int getRandomNum(int seed){
		final Random rand = new Random();
		final int ranCount = rand.nextInt(seed)+1;
		return ranCount;
	}
	
	public static boolean getRate(int seed,int radio){
		int seeds = random(1,1000);
		return seeds <= radio*10;
	}
	
	public static boolean getRate(int radio){
		return getRate(100,radio);
	}
	/**
	 * 在min，max中间随机取值
	 * @param min
	 * @param max
	 * @return
	 */
	public static int random(int min,int max){
		int value = random.nextInt() % (max - min + 1);
		if (value < 0) {
			value = -value;
		}
		return min + value;
	}

	
}
