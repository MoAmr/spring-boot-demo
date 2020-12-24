package com.springboot.hellowworld.demo.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author Mohammed Amr
 * @created 24/12/2020 - 23:48
 * @project Springboot Hello World Demo
 */

@WebFilter(filterName = "helloFilter", urlPatterns = "/helloServlet")
public class HelloFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        System.out.println("Executing doFilter method");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Done executing doFilter method");
    }
}
