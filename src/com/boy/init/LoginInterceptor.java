package com.boy.init;

import com.boy.models.Manager;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		Manager manager =(Manager) arg0.getInvocationContext().getSession().get("manager");
		if(manager!=null){
			return arg0.invoke();
		}
		return "login";
	}

}
