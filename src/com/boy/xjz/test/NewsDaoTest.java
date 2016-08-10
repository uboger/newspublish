package com.boy.xjz.test;

import java.util.Date;

import org.junit.Test;

import com.boy.dao.impl.NewsDao;
import com.boy.models.Category;
import com.boy.models.News;

public class NewsDaoTest {
	@Test
	public void newsAdd() {
		News n = new News();
		Category category = new Category();
		category.setCname("娱乐八卦");
		category.setTopid(1);
		n.setCategory(category);
		String title= "武大学生跳楼:或因拿不到学位证，或因找不到工作";
		n.setTitle(title);
		String content = "南昌大学在发布的章程中简称“南大”，引发了诸多争议。就是这个简称“南大”，在该章程发布后的几天里引发了诸多的争议，涉及多家国内高校。其中，南京大学校友的反对意见较为强烈。早在2014年，经教育部核准的《南京大学章程》（高等学校章程核准书第37号）在第一章总则的第二条中写明“学校名称为南京大学，简称南大。”（7月4日澎湃新闻网）";

		n.setContent(content);
		n.setCreatetime(new Date());
	
		NewsDao nd = new NewsDao();
		for(int i=0;i<278;i++)
			nd.save(n);
	}
}
