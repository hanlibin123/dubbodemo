package com.mujourney.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.dubbo.config.annotation.Reference;

@Component
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/application-consumer.xml"})
public class ClientTest {
	
	@Reference(version="1.0.0")
	private UserService uservice;
	
	@Test
	public void pors()  {
		System.out.println(uservice.findById(1));
	}
}
