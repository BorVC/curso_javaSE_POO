package service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class TestDirector {

	@Test
	void testIncentivar1() {
		Director dir = new Director("a",10,LocalDate.of(2000, 1, 30),2000,"d",30);
		dir.incentivar();
		assertEquals(5000,dir.getSalario());
	}
	
	@Test
	void testIncentivar2() {
		Director dir = new Director("a",10,LocalDate.of(2000, 1, 30),2000,"d",20);
		dir.incentivar();
		assertEquals(3500,dir.getSalario());
	}
	
	@Test
	void testIncentivar3() {
		Director dir = new Director("a",10,LocalDate.now().minusMonths(10),2000,"d",10);
		dir.incentivar();
		assertEquals(2000,dir.getSalario());
	}

}
