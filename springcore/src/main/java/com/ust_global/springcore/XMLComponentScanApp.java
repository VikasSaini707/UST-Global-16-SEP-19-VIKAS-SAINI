package com.ust_global.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust_global.springcore.di.Hello;
import com.ust_global.springcore.di.Pet;

public class XMLComponentScanApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("How are You");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("Ronny");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
	}
}
