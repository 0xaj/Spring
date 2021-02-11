package com.springBootTest.first.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		HelloWorld h = (HelloWorld) context.getBean("helloWorld");
		TestEditor testEditor = (TestEditor)context.getBean("Texty");
		testEditor.checkSpelling();
		//flow-> activate constructor ->dependency injection(setter)
	//	h.getMessage();
	//	h.setMessage("Bye");

		//((AbstractApplicationContext) context).registerShutdownHook();

		//HelloWorld h1 = (HelloWorld) context.getBean("helloWorld");
        //h1.getMessage();

	}
	// can give parent in xml to use inheritance

}
