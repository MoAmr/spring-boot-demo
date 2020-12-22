package com.springboot.hellowworld.demo.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Mohammed Amr
 * @created 22/12/2020 - 23:52
 * @project Springboot Hello World Demo
 */

@WebServlet(name = "helloServlet", urlPatterns = "/helloServlet")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("Running Hello Servlet doGet method");
    }
}
