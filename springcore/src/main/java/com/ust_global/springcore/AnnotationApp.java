package com.ust_global.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust_global.springcore.config.HelloConfigurationClass;
import com.ust_global.springcore.di.Book;
import com.ust_global.springcore.di.Hello;
import com.ust_global.springcore.di.Pet;

public class AnnotationApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloConfigurationClass.class);
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		
		Hello hello2 =  context.getBean(Hello.class);
		System.out.println(hello2.getMsg());
		
		System.out.println(hello);
		System.out.println(hello2);
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		
//		Animal animal = context.getBean(Animal.class);
//		animal.makeSound();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		
		
		context.close();
		
		
		
	}
}
