package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {

	// To-do : multiple url mapping
	@RequestMapping(value = {"/productlist/",  "/confirm/", "/error/"} , method = RequestMethod.GET )
	public void getUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.html");
	    requestDispatcher.forward(request, response);
     	return;
	}
	
}
