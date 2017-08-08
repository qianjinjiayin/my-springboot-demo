package com.wjy.myspringbootdemo.web;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wjy.myspringbootdemo.exception.CustomException;
import com.wjy.myspringbootdemo.models.User;
import com.wjy.myspringbootdemo.models.WelcomeMsg;
import com.wjy.myspringbootdemo.service.UserService;
import com.wjy.myspringbootdemo.util.SpringUtil;
import com.wjy.myspringbootdemo.util.SpringUtil2;
import com.wjy.myspringbootdemo.util.SpringUtil3;


/**
 * 官方文档：
 *
 * @RestController is a stereotype annotation that combines @ResponseBody and @Controller. 意思是：
 * @RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。
 *
 *                                   (1)如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，配置的视图解析器InternalResourceViewResolver不起作用，返回的内容就是Return里的内容。
 *                                   例如：本来应该到success.jsp页面的，则其显示success.
 *                                   2)如果需要返回到指定页面，则需要用 @Controller配合视图解析器InternalResourceViewResolver才行。
 *                                   3)如果需要返回JSON，XML或自定义mediaType内容到页面，则需要在对应的方法上加上@ResponseBody注解。
 */
@RestController
public class RestHelloController
{
	@Resource
	private UserService userService;
	@Resource
	private SpringUtil springUtil;
	@Resource
	private SpringUtil2 springUtil2;
	@Resource
	private SpringUtil3 springUtil3;

	@RequestMapping("/")
	public WelcomeMsg hello()
	{
		return new WelcomeMsg("Welcome", new Date());
	}

	@RequestMapping("/throwCustomException")
	public void throwCustomException() throws Exception
	{
		throw new CustomException();
	}

	@RequestMapping("/getUser")
	public User getUser(final long id)
	{
		return userService.getUser(id);
	}

	@RequestMapping("/saveUser")
	public String saveUser()
	{
		userService.save();
		return "Successful!";
	}

	@RequestMapping("/updateUser")
	public String updateUser(final long id, final String name, final String email)
	{
		userService.update(id, name, email);
		return "Successful!";
	}

	@RequestMapping("/callSpringUtil")
	public String callSpringUtil()
	{
		springUtil.output();
		springUtil2.output();
		springUtil3.output();
		return "Successful!";
	}

}
