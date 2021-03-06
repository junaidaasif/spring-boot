package com.techment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IProductDao;
import com.techment.entity.Product;

@SpringBootApplication
public class SpringBootJpa1Application implements CommandLineRunner{
	
	@Autowired
	IProductDao iProductDao;
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpa1Application.class, args);
	}
		@Override
		public void run(String...  args) throws Exception{
			System.out.println("Hello this my first spring boot");
		
			Product product1 = new Product("laptop", "Laptop", 4500);
			Product product2 = new Product("mobile", "mob", 44500);
			
//			iProductDao.save(product1);	//for inserting
//			iProductDao.save(product2);
			
//			List<Product> products = iProductDao.findAll();
//			products.forEach(System.out.println());
			
			System.out.println("inserted");
			
			
			
//			Optional<Product> product = iProductDao.findById(3);
			
//			if(product.isPresent()) {
//				System.out.println("products " + product.get());
//			}
//			else {
//				System.out.println("not present");
//			}
			
//			
//			Product product3 = iProductDao.findById(3).get();
//			System.out.println("Product " + product3);
//			
			/*
			 * count
			 * 
			 */
			
			long totalProducts = iProductDao.count();
			System.out.println("total no. of product " + totalProducts);
			
			/*
			 * delete
			 */
//			
//			iProductDao.deleteById(3);
//			System.out.println("deleted");
			
			try {
				iProductDao.existsById(4);
			} catch (Exception e) {
				System.out.println("no id present");
			}
			
//			if() {
//				iProductDao.deleteById(4);
//				System.out.println("deleted");
//			}
//			else {
//				System.out.println("not found");
//			}
			
		List<Product> prod = 	iProductDao.findByName("Laptop");
		
		System.out.println("Product " + prod);
		
		List<Product> prodList = iProductDao.findByCategory("laptop");
		System.out.println(prodList);
		
		List<Product> prodm = iProductDao.findByCategoryAndName("mobile" , "mob");
		System.out.println(prodm);
		}
		
}

