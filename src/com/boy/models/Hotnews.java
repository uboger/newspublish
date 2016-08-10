package com.boy.models;

import java.io.Serializable;
import java.util.Date;

public class Hotnews implements Serializable {
	private Integer hid;
	private String title;
	private String content;
	private Date createtime;
	private int sign;
	
	
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
}
