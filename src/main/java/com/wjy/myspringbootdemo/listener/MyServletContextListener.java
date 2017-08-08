package com.wjy.myspringbootdemo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


/**
 * 使用@WebListener注解，实现ServletContextListener接口<br>
 * 如果使用代码方式注册，使用ServletListenerRegistrationBean
 */
@WebListener
public class MyServletContextListener implements ServletContextListener
{

	@Override
	public void contextInitialized(final ServletContextEvent arg0)
	{
		System.out.println("ServletContext初始化");
	}

	@Override
	public void contextDestroyed(final ServletContextEvent arg0)
	{
		System.out.println("ServletContext销毁");
	}
}
