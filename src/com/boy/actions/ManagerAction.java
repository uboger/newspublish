package com.boy.actions;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.boy.dao.impl.ManagerDao;
import com.boy.dao.tools.MD5util;
import com.boy.models.Manager;
import com.opensymphony.xwork2.ActionSupport;

public class ManagerAction extends ActionSupport {
	private Manager manager;
	private ManagerDao md = new ManagerDao();
	private String sign="";
	private List<Manager> managers;
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public List<Manager> getManagers() {
		return managers;
	}
	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}
	@Override
	public String execute() throws Exception {
		this.managers = md.managerList();
		ServletActionContext.getRequest().getSession().setAttribute("managers", managers);
		return SUCCESS;
	}
	public String login(){
		String randomcode = ServletActionContext.getRequest().getParameter("randomcode");
		String no = (String) ServletActionContext.getRequest().getSession().getAttribute("randomcode");
		this.manager = md.login(manager.getAccount(),manager.getPassword());
		if(randomcode.trim().equals("")){
			addFieldError("error", "请输入验证码");
			return "login";
		}
		if(!MD5util.getMessage(randomcode).trim().equals(no.trim())){
			addFieldError("error", "请输正确的验证码");
			return "login";
		}

		if(this.manager==null){
			this.addFieldError("error", "登陆未成功");
			 return "login";
		}else{
			this.manager.setLogincont(manager.getLogincont()+1);
			md.update(this.manager);
			ServletActionContext.getRequest().getSession().setAttribute("manager", this.manager);
			return "main";
		}
	}
	public String pwdModify(){
		return "modify";
	}
	public String pwdUpdate(){
		String pwd = ServletActionContext.getRequest().getParameter("newpwd");
		if(!pwd.equals(manager.getPassword())){
			addFieldError("error", "两次密码不一样");
			return "login";
		}else{
			md.update(manager);
			ServletActionContext.getRequest().getSession().setAttribute("manager", manager);
			return "login";
		}
	}
	public String accountAdd(){
		String pwd = ServletActionContext.getRequest().getParameter("pwd");
		
		if(!pwd.equals(manager.getPassword())){
			addFieldError("error", "两次密码不一样");
			return "login";
		}
		md.save(manager);
		managers = md.managerList();
		ServletActionContext.getRequest().getSession().setAttribute("managers", managers);
		return "save";
	}
	public String managerEdit(){
		this.manager=md.findManagerById(this.manager.getAid());
		return "edit";
	}
	public String managerUpdate(){
		md.update(manager);
		managers = md.managerList();
		ServletActionContext.getRequest().getSession().setAttribute("managers", managers);
		return "update";
	}
	public String managerDelete(){
		manager = md.findManagerById(manager.getAid());
		md.delete(manager);
		managers = md.managerList();
		ServletActionContext.getRequest().getSession().setAttribute("managers", managers);
		return "delete";
	}
}
