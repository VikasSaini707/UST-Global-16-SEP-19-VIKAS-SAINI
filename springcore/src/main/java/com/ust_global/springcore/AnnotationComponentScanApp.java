package com.ust_global.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust_global.springcore.config.ComponentScanConfiguration;
import com.ust_global.springcore.di.Hello;
import com.ust_global.springcore.di.Pet;

public class AnnotationComponentScanApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
		
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("I love Food");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("Pussy");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
	}
}
