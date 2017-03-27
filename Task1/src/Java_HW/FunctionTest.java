package Java_HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionTest {

	@Test
	public void testDecardCoord() {
		int x1=0;
		int y1=1;
		int x2=3;
		int y2=4;
		double rez=Function.DecartCoord(x1, y1, x2, y2);
		assertEquals(4,rez,1);
	}
	@Test
	public void testDecardCoord_0() {
		int x1=0;
		int y1=0;
		int x2=0;
		int y2=0;
		double rez=Function.DecartCoord(x1, y1, x2, y2);
		assertEquals(0,rez,1);
	}
	@Test
	public void testDecardCoord_1() {
		int x1=1;
		int y1=1;
		int x2=1;
		int y2=1;
		double rez=Function.DecartCoord(x1, y1, x2, y2);
		assertEquals(0,rez,1);
	}
	@Test
	public void testDecardCoord_2() {
		int x1=-1;
		int y1=1;
		int x2=1;
		int y2=-1;
		double rez=Function.DecartCoord(x1, y1, x2, y2);
		assertEquals(2,rez,1);
	}
	@Test
	public void testDecardCoord_3() {
		int x1=5;
		int y1=-1;
		int x2=3;
		int y2=-2;
		double rez=Function.DecartCoord(x1, y1, x2, y2);
		assertEquals(2,rez,1);
	}
	@Test
	public void testNumDay() {
		int num=5;
		
		String rez=Function.numDay(num);
		assertEquals("Пятница",rez);
	}
	@Test
	public void testNumDay_1() {
		int num=1;
		
		String rez=Function.numDay(num);
		assertEquals("Понедельник",rez);
	}
	@Test
	public void testNumDay_2() {
		int num=7;
		
		String rez=Function.numDay(num);
		assertEquals("Воскресенье",rez);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testNumDay_3() {
		int num=8;
		
		Function.numDay(num);
		
	}

}
