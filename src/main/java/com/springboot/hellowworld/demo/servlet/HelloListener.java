package com.springboot.hellowworld.demo.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Mohammed Amr
 * @created 24/12/2020 - 23:56
 * @project Springboot Hello World Demo
 */

@WebListener
public class HelloListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Servlet Contest Destroyed");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Servlet Context Initialized");
    }
}
