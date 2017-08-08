package com.wjy.myspringbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.wjy.myspringbootdemo.servlet.MyServlet1;
import com.wjy.myspringbootdemo.util.SpringUtil2;
import com.wjy.myspringbootdemo.util.SpringUtil3;


/**
 * 其中@SpringBootApplication申明让spring boot自动给程序进行必要的配置，等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
 */
@EnableDiscoveryClient
@SpringBootApplication
@Import(value =
{ SpringUtil3.class })
@ServletComponentScan
public class App extends WebMvcConfigurerAdapter
{
	//	@Override
	//	public void configureMessageConverters(final List<HttpMessageConverter<?>> converters)
	//	{
	//		super.configureMessageConverters(converters);
	//
	//		final FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
	//
	//		final FastJsonConfig fastJsonConfig = new FastJsonConfig();
	//		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
	//		fastConverter.setFastJsonConfig(fastJsonConfig);
	//
	//		converters.add(fastConverter);
	//	}

	//	@Bean
	//	public HttpMessageConverters fastJsonHttpMessageConverters()
	//	{
	//		final FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
	//		final FastJsonConfig fastJsonConfig = new FastJsonConfig();
	//		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
	//		fastConverter.setFastJsonConfig(fastJsonConfig);
	//		final HttpMessageConverter<?> converter = fastConverter;
	//		return new HttpMessageConverters(converter);
	//	}

	@Bean
	public SpringUtil2 springUtil2()
	{
		return new SpringUtil2();
	}

	@Bean
	public ServletRegistrationBean MyServlet1()
	{
		return new ServletRegistrationBean(new MyServlet1(), "/myServlet/*");
	}

	public static void main(final String[] args)
	{
		SpringApplication.run(App.class, args);
	}
}
