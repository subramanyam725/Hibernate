package com.balu.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitilizer //implements WebApplicationInitializer 
{

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		
		/*
		 * XmlWebApplicationContext webapplicationContext=new
		 * XmlWebApplicationContext();
		 * webapplicationContext.setConfigLocation("classpath:beans.xml");
		 */
		
		AnnotationConfigWebApplicationContext webapplicationContext = new AnnotationConfigWebApplicationContext();
		webapplicationContext.register(LoveCalculatorAppConfig.class);
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webapplicationContext);
		ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
		myCustomDispatcherServlet.setLoadOnStartup(1);
		myCustomDispatcherServlet.addMapping("/LoveCalculator.com/*");
		
		

	}

}
