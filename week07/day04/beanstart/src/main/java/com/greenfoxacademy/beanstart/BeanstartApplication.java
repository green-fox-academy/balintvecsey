package com.greenfoxacademy.beanstart;

import com.greenfoxacademy.beanstart.config.HelloWorldConfig;
import com.greenfoxacademy.beanstart.model.HelloWorld;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanstartApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
	}
}
