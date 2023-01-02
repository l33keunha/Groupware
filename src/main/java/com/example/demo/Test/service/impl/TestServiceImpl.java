package com.example.demo.Test.service.impl;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Test.service.TestService;
import com.example.demo.Util.CommonUtil;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestMapper mapper;

	@Override
	public HashMap<String, Object> test1(HttpServletRequest req) {
		CommonUtil util = new CommonUtil();
		System.out.println(util.convertMap(req));
		return util.convertMap(req);
	}

}
