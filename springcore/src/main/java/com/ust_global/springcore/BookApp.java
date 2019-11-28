package com.ust_global.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust_global.springcore.config.BookConfig;
import com.ust_global.springcore.di.Book;

public class BookApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);
		Book book = context.getBean(Book.class);
		System.out.println("book name  : "+book.getName());
		System.out.println("book author  : "+book.getAuthor().getName());
		System.out.println("book price  : "+book.getPrice());
		System.out.println("book penName  : "+book.getAuthor().getPenName());
	}
}
