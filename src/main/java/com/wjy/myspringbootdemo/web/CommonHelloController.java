package com.wjy.myspringbootdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CommonHelloController
{
	@RequestMapping("/helloHtml")
	public String helloHtml(final Model model)
	{
		model.addAttribute("hello", "from CommonHelloController.helloHtml");
		return "helloHtml";
	}

	@RequestMapping("/helloFtl")
	public String helloFtl(final Model model)
	{
		model.addAttribute("hello", "from CommonHelloController.helloFtl");
		return "helloFtl";
	}
}
