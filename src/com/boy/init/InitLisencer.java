package com.boy.init;

import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.boy.dao.impl.ManagerDao;
import com.boy.models.Manager;

public class InitLisencer implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		arg0.getServletContext().removeAttribute("managers");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ManagerDao md = new ManagerDao();
		List<Manager> managers = md.managerList();
		arg0.getServletContext().setAttribute("managers", managers);
	}

}
