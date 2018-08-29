package com.mrcubes.admin.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;

@WebServlet(urlPatterns = { "/login" })
public class LogInServlet extends HttpServlet {
	private  static final long serialVersionUID = 1L;
	private static final org.apache.logging.log4j.Logger logger= LogManager.getLogger("LogInServlet.class");
     
    
    public LogInServlet() {
    	super();
    	logger.info("Entry servlet constructor called.");
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
        logger.info("doGet method of entry servlet has been called.");

		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
        logger.info("doPost : method of entry servlet has been called.");

        if (logger.isTraceEnabled()) {
            logger.trace("doPost : ContentLength is: {}", request.getContentLength());
        }
	}

}
