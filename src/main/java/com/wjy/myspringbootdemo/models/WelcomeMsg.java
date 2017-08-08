package com.wjy.myspringbootdemo.models;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;


public class WelcomeMsg
{
	private String msg;

	@JSONField(serialize = false)
	private Date date;


	public WelcomeMsg()
	{

	}

	public WelcomeMsg(final String msg)
	{
		this();
		this.setMsg(msg);
	}

	public WelcomeMsg(final String msg, final Date date)
	{
		this(msg);
		this.setDate(date);
	}

	public String getMsg()
	{
		return msg;
	}

	public void setMsg(final String msg)
	{
		this.msg = msg;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(final Date date)
	{
		this.date = date;
	}

}
