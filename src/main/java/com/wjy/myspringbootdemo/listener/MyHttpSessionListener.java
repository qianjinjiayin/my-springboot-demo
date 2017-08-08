package com.wjy.myspringbootdemo.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


/**
 * 监听Session的创建与销毁
 *
 */
@WebListener
public class MyHttpSessionListener implements HttpSessionListener
{

	@Override
	public void sessionCreated(final HttpSessionEvent se)
	{
		System.out.println("Session 被创建");
	}

	@Override
	public void sessionDestroyed(final HttpSessionEvent se)
	{
		System.out.println("Session 被销毁");
	}
}
