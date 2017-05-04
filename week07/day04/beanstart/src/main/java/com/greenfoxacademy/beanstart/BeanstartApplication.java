package com.greenfoxacademy.beanstart;

import com.greenfoxacademy.beanstart.config.HelloWorldConfig;
import com.greenfoxacademy.beanstart.config.MyColorConfig;
import com.greenfoxacademy.beanstart.model.BlueColor;
import com.greenfoxacademy.beanstart.model.GreenColor;
import com.greenfoxacademy.beanstart.model.HelloWorld;
import com.greenfoxacademy.beanstart.model.MyColor;
import com.greenfoxacademy.beanstart.model.RedColor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanstartApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
    ApplicationContext ctx2 = new AnnotationConfigApplicationContext(MyColorConfig.class);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
    MyColor myRed = ctx2.getBean(RedColor.class);
    MyColor myGreen = ctx2.getBean(GreenColor.class);
    MyColor myBlue = ctx2.getBean(BlueColor.class);

		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
		myRed.printColor();
		myGreen.printColor();
		myBlue.printColor();
	}
}
