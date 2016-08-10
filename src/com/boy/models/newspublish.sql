DROP DATABASE IF EXISTS newspublish;
CREATE DATABASE newspublish;
DROP TABLE IF EXISTS manager;
CREATE TABLE manager(
	aid INT PRIMARY KEY AUTO_INCREMENT,#主键
	account VARCHAR(20) NOT NULL,##登陆账户
	password VARCHAR(20) NOT NULL,#登陆密码
	realname VARCHAR(50),#真实姓名
	logincount INT NOT NULL#登陆次数 
);
DROP TABLE IF EXISTS category;
CREATE TABLE category(#
	cid INT PRIMARY KEY AUTO_INCREMENT,#类型id
	cname VARCHAR(50) NOT NULL,#类型名称
	topid INT
);
DROP TABLE IF EXISTS news;
CREATE TABLE news(
	nid INT PRIMARY KEY AUTO_INCREMENT,#编号
	title VARCHAR(100) NOT NULL,#标题
	content VARCHAR(255) NOT NULL,#内容
	createtime DATETIME,#新闻发布日期
	cid INT,#类别id
	CONSTRAINT C_N_FK FOREIGN KEY(cid) REFERENCES category(cid)
);
DROP TABLE IF EXISTS hotnews;
CREATE TABLE hotnews(
	hid INT PRIMARY KEY AUTO_INCREMENT,#热门新闻id
	title VARCHAR(100) NOT NULL,	#标题
	content VARCHAR(255) NOT NULL,#内容
	createtime DATETIME,#新闻发布日期
	hsign INT NOT NULL #类型表示 1是公告新闻类2焦点新闻类
);


