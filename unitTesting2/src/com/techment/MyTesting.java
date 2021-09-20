package com.techment;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class MyTesting {

	
	Cube calculation = new Cube();
	

	
	@Test
	void test() {
		
		assertEquals(25, calculation.cube(5));
		
	}
	
	@Test
	void Test2()
	{
		assertNotEquals(6, calculation.area(2, 4));
	}
	
	
	
	@Test
	void Test3()
	{
		assertNotEquals(6, calculation.angle(45, 45));
	}
	
	

	

	
}

