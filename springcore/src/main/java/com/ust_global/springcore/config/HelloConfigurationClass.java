package com.ust_global.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.ust_global.springcore.di.Book;
import com.ust_global.springcore.di.Cat;
import com.ust_global.springcore.di.Dog;
import com.ust_global.springcore.di.Hello;
import com.ust_global.springcore.di.Pet;

@Configuration
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {
	
	@Bean(name="hello")
//	@Scope("prototype")
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("I love Priyanka Chopra");
		return hello;
	}
	
}
