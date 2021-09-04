package com.techment;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IAuthDao;
import com.techment.dao.IBookDao;

import com.techment.entity.Auth;
import com.techment.entity.Book;


@SpringBootApplication
public class AssignmentAuthorApplication implements CommandLineRunner {

	@Autowired
	IBookDao iBookDao;

	@Autowired
	IAuthDao iAuthDao;

	public static void main(String[] args) {
		SpringApplication.run(AssignmentAuthorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hello this is my first spring boot");

     

		Auth author1 = new Auth("Robert kausaki");
		Auth author2 = new Auth("Junaid");
		Auth author3 = new Auth("aash");


		iAuthDao.save(author1);
		iAuthDao.save(author2);
		iAuthDao.save(author3);

		
		System.out.println("inserted");

		iBookDao.save(new Book("python", 1000, author1));
		iBookDao.save(new Book("html", 500, author2));
		iBookDao.save(new Book("css", 650, author3));


		System.out.println("********************************************************");
		
		List<Book> products = iBookDao.findAll();
		products.forEach(System.out::println);

		System.out.println("********************************************************");
		
		
		List<Book> books = iBookDao.findByAuthorName("Junaid");
		books.forEach(System.out::println);


		System.out.println("********************************************************");
		
		
		List<Book> books1 = iBookDao.findByPriceBetween(600, 2000);
		books1.forEach(System.out::println);

        System.out.println("********************************************************");
		
		
		Optional<Auth> auths = iAuthDao.findById(2);
		System.out.println(auths.get().getName()+" "+auths.get().getId());

		
	}

}
