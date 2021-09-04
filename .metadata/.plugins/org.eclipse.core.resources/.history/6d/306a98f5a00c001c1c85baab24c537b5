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
public class SpringBootJpaApplication implements CommandLineRunner {

	@Autowired
	IBookDao iBookDao;

	@Autowired
	IAuthDao iAuthDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hello this is my first spring boot");

     
//
//		Auth auth1 = new Auth("Ebalaguru swami");
//		Auth auth2 = new Auth("Chetan Bhagat");
//		Auth auth3 = new Auth("Harper Lee");
//		Auth auth4 = new Auth("Rakesh jha");
//		Auth auth5 = new Auth("jalebi bai");
//
//		iAuthDao.save(auth1);
//		iAuthDao.save(auth2);
//		iAuthDao.save(auth3);
//		iAuthDao.save(auth4);
//		iAuthDao.save(auth5);
//		
//		System.out.println("inserted");
//
//		iBookDao.save(new Book("Java", 340, auth1));
//		iBookDao.save(new Book("Java2", 340, auth2));
//		iBookDao.save(new Book("Java3", 640, auth3));
//		iBookDao.save(new Book("Java4", 340, auth4));
//		iBookDao.save(new Book("Java5", 840, auth5));
//		iBookDao.save(new Book("Java6", 340, auth5));

		System.out.println("********************************************************");
		
		List<Book> products = iBookDao.findAll();
		products.forEach(System.out::println);

		System.out.println("********************************************************");
		
		
		List<Book> books = iBookDao.findByAuthorName("Ebalaguru swami");
		books.forEach(System.out::println);


		System.out.println("********************************************************");
		
		
		List<Book> books1 = iBookDao.findByPriceBetween(500, 800);
		books1.forEach(System.out::println);

        System.out.println("********************************************************");
		
		
		Optional<Auth> auths = iAuthDao.findById(2);
		System.out.println(auths.get().getName()+" "+auths.get().getId());

		
	}

}
