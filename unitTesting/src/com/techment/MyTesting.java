package com.techment;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyTesting {

	
	Calculation calculation = new Calculation();
	
	@Before
	void test10() {
		assertTrue(true);
		System.out.println("before ");
	}
	
	@BeforeEach
	void test11() {
		assertTrue(true);
		System.out.println("before each");
	}
	
	
	@AfterEach
	void test12() {
		assertTrue(true);
		System.out.println("after each");
	}
	
	@Test
	void test() {
		
		assertEquals(6, calculation.add(2, 4));
		
	}
	
	@Test
	void Test2()
	{
		assertNotEquals(6, calculation.add(2, 4));
	}

	@Test
	void EligibleTest() {
		assertEquals("eligible", calculation.checkEligibility(19));
	}
	
	@Test
	void Test4()
	{
		assertTrue(calculation.name.contains("r"));
	}
	
	@Test
	void Test5()
	{
		assertFalse(calculation.name.contains("p"));
	}
	
	@Test
	void Test6()
	{
		//var message ="something went ";
		assertThrows(ArithmeticException.class, ()-> {int a=1;int b=0;System.out.println(a/b);});
	}
	
	@Test
	void Test7()
	{
	
		assertThrows(IllegalArgumentException.class, ()-> {Integer.parseInt("1");});
	}
	
	@Test
	void Test8()
	{
		
		assertThrows(IllegalArgumentException.class, ()-> {Integer.parseInt("ab");});
	}
}
