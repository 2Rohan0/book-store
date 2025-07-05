package com.book_manager.book_store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookStoreApplication {

	public static void main(String[] args) {

		SpringApplication.run(BookStoreApplication.class, args);
		System.out.println("Working !");
	}

}
