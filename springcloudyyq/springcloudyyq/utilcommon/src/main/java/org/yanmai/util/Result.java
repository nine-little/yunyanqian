package org.yanmai.util;

import com.alibaba.fastjson.JSON;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.List;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Result {
	private int status;
	private Object result;
	private Integer roles;
	private transient boolean isExcute = true;//是否进行字段脱敏处理

	private List<?> rows;
	
	private long total;
	
	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

	public long getTotal() {
		return total;
	}

	public Result(int status, int total, List<?> rows){
		this.status = status;
		this.total = total;
		this.rows = rows;
	}
	
	
	public void setTotal(long total) {
		this.total = total;
	}

	public Integer getRoles() {
		return roles;
	}

	public void setRoles(Integer roles) {
		this.roles = roles;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	private List<?> list;

	public Result(Object result) {
		this.result = result;
	}

	public Result(int code, Object result, Integer roles){
		this.status = code;
		this.result = result;
		this.roles = roles;
	}
	public Result(int code, Object result) {
		this.status = code;
		this.result = result;
	}

	public Result() {
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getResult() {

		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}


	public boolean isExcute() {
		return isExcute;
	}

	public void setExcute(boolean excute) {
		isExcute = excute;
	}


	@Override
	public String toString() {
		
		return JSON.toJSONString(this);
	}
	
	
 
}
