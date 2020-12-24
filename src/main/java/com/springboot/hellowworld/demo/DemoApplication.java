package com.springboot.hellowworld.demo;

import com.springboot.hellowworld.demo.servlet.HelloFilter;
import com.springboot.hellowworld.demo.servlet.HelloListener;
import com.springboot.hellowworld.demo.servlet.HelloServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/// Register Servlet.
	@Bean
	public ServletRegistrationBean getServletRegistrationBean() {
		ServletRegistrationBean servletBean = new ServletRegistrationBean(new HelloServlet());
		servletBean.addUrlMappings("/helloServlet");
		return servletBean;
	}

	/// Register Filter.
	@Bean
	public FilterRegistrationBean getFilterRegistrationBean() {
		FilterRegistrationBean filterBean = new FilterRegistrationBean(new HelloFilter());
		// Add filter path
		filterBean.addUrlPatterns("/helloServlet");
		return filterBean;
	}

	@Bean
	public ServletListenerRegistrationBean<HelloListener> getServletListenerRegistrationBean() {
		ServletListenerRegistrationBean listenerBean =
				new ServletListenerRegistrationBean(new HelloListener());
		return listenerBean;
	}

}
