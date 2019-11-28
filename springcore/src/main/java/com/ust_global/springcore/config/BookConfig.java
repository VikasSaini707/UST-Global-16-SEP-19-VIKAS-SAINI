package com.ust_global.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ust_global.springcore.di.Author;
import com.ust_global.springcore.di.Book;

@Configuration
public class BookConfig {

	@Bean(name="author")
	public Author getAuthor()
	{
		Author author = new Author();
		author.setName("Chetan Bhagat");
		author.setPenName("chinnu");
		return author;
	}
	
	@Bean(name="book")
	public Book getBook()
	{
		Book book = new Book();
		book.setName("Dil wale");
		book.setPrice(100);
		book.setAuthor(getAuthor());
		return book;
	}
}
