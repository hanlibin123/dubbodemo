package com.mujourney.service;

import java.util.concurrent.TimeUnit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartServer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "application-provider.xml" });
		context.start();
		try {
			TimeUnit.HOURS.sleep(1l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
