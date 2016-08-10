package com.boy.xjz.test;

import java.util.Random;

import org.junit.Test;

import com.boy.dao.tools.MD5util;

public class Otherstest {
@Test
public void test(){
	char[] chs = new char[62];
	int i=-1;
	for(char ch =48;ch<123;ch++){
		if(ch==58)ch=65;
		if(ch==91)ch=97;
		chs[++i]=ch;
	}
	Random r = new Random();
	String no = new String(chs);
	MD5util.getMessage(new String(chs));
	System.out.println(MD5util.getMessage(new String(chs)));
	}
	
}
