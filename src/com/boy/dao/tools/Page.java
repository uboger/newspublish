package com.boy.dao.tools;

import java.util.List;

public class Page<T> {
	private int no = 1;// ��ʼҳ��
	private int size = 6;// ÿҳ��ʾ����
	private int count;// ��ҳ��
	private int total;// ������
	private List<T> results;// Ҫ��ʾ������
	public Page(){}
	public Page(int total,int no){
	
		this.total = total;
		this.count = total/size==0 ? total/size : total/size+1;
		if(no<1)no=1;
		if(no>count)no=count;
		this.no=no;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public List<T> getResults() {
		return results;
	}
	public void setResults(List<T> results) {
		this.results = results;
	}
	
}
