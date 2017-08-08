package com.wjy.myspringbootdemo.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


/**
 * 普通类调用Spring bean对象： 说明： 1、此类需要放到App.java同包或者子包下才能被扫描，否则失效。
 */
@Component
public class SpringUtilBase implements ApplicationContextAware
{
	protected static ApplicationContext applicationContext = null;

	@Override
	public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException
	{
		if (SpringUtilBase.applicationContext == null)
		{
			SpringUtilBase.applicationContext = applicationContext;
		}
		System.out.println(">>>>>com.wjy.myspringbootdemo.util.SpringUtil.setApplicationContext(ApplicationContext)<<<<<");
		System.out.println(SpringUtilBase.applicationContext);
		System.out.println(">>>>>com.wjy.myspringbootdemo.util.SpringUtil.setApplicationContext(ApplicationContext)<<<<<");
	}

	//获取applicationContext
	protected static ApplicationContext getApplicationContext()
	{
		return applicationContext;
	}

	//通过name获取 Bean.
	protected static Object getBean(final String name)
	{
		return getApplicationContext().getBean(name);
	}

	//通过class获取Bean.
	protected static <T> T getBean(final Class<T> clazz)
	{
		return getApplicationContext().getBean(clazz);
	}

	//通过name,以及Clazz返回指定的Bean
	protected static <T> T getBean(final String name, final Class<T> clazz)
	{
		return getApplicationContext().getBean(name, clazz);
	}

	public void output()
	{
		System.out.println(this.getClass().getSimpleName());
	}
}
