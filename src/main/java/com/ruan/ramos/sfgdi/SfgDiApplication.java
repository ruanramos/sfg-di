package com.ruan.ramos.sfgdi;

import com.ruan.ramos.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class  SfgDiApplication {

	public static void main(String[] args) {
		System.out.println("STARTING SPRING APP");
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());
	}

}
