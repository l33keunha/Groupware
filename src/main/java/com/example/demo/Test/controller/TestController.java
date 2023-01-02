package com.example.demo.Test.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Test.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService service;

    @RequestMapping("/test.do")
    public ModelAndView goTest(HttpServletRequest req, HttpServletResponse rse){
    	return new ModelAndView("test/test");
    }
    
    @RequestMapping("/test1")
    public ModelAndView test1(HttpServletRequest req, HttpServletResponse rse){
    	return new ModelAndView("test/test2", "data", service.test1(req));
    }
    
    @RequestMapping("/test2")
    public ModelAndView test2(HttpServletRequest req, HttpServletResponse rse){
    	return new ModelAndView("jsonView","data", service.test1(req));
	}
}
