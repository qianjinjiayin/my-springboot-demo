package com.wjy.myspringbootdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.wjy.myspringbootdemo.interceptor.MyInterceptor1;
import com.wjy.myspringbootdemo.interceptor.MyInterceptor2;


/**
 * WebMvcConfigurerAdapter 并非只是注册添加拦截器使用，其顾名思义是做Web配置用的，它还可以有很多其他作用
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter
{

	@Override
	public void addInterceptors(final InterceptorRegistry registry)
	{
		// 多个拦截器组成一个拦截器链
		// addPathPatterns 用于添加拦截规则
		// excludePathPatterns 用户排除拦截
		registry.addInterceptor(new MyInterceptor1()).addPathPatterns("/**");
		registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}

}
