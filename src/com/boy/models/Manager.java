package com.boy.models;

import java.io.Serializable;

public class Manager implements Serializable {
	private Integer aid;
	private String account;
	private String password;
	private String realname;
	private Integer logincont = new Integer(0);;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public Integer getLogincont() {
		return logincont;
	}
	public void setLogincont(Integer logincont) {
		this.logincont = logincont;
	}
	
}
