package Java_HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionTest {
//	@Test
//	public void testNumber999() {
//		String string = "девятьсот девяносто девять";
//		int i = Function.getNumber(string);
//		assertEquals(999, i);
//	}
//	@Test
//	public void testNumber83() {
//		String string = "восемьдесят три";
//		int i = Function.getNumber(string);
//		assertEquals(83, i);
//	}
//
//	@Test
//	public void testNumber211() {
//		String string = "двести одинадцать";
//		int i = Function.getNumber(string);
//		assertEquals(211, i);
//	}
//
//	@Test
//	public void testNumber230() {
//		String string = "двести тридцать";
//		int i = Function.getNumber(string);
//		assertEquals(230, i);
//	}
//
//	@Test
//	public void testNumber236() {
//		String string = "двести тридцать шесть";
//		int i = Function.getNumber(string);
//		assertEquals(236, i);
//	}
//
//	@Test(expected = IllegalArgumentException.class)
//	public void testNumber1000() {
//		Function.getNumber("тысяча");
//	}
//
//	@Test(expected = IllegalArgumentException.class)
//	public void testNumber_1() {
//		Function.getNumber("минус один");
//	}

	@Test
	public void test0() {
		int pr = 0;
		String res = Function.getString(pr);
		assertEquals("Ноль", res);
	}

	@Test
	public void test7() {
		int pr = 7;
		String res = Function.getString(pr);
		assertEquals("семь", res);
	}

	@Test
	public void test12() {
		int pr = 12;
		String res = Function.getString(pr);
		assertEquals("двенадцать", res);
	}

	@Test
	public void test20() {
		int pr = 20;
		String res = Function.getString(pr);
		assertEquals("двадцать", res);
	}

	@Test
	public void test100() {
		int pr = 100;
		String res = Function.getString(pr);
		assertEquals("сто", res);
	}

	@Test
	public void test105() {
		int pr = 105;
		String res = Function.getString(pr);
		assertEquals("сто пять", res);
	}

	@Test
	public void test110() {
		int pr = 110;
		String res = Function.getString(pr);
		assertEquals("сто десять", res);
	}

	@Test
	public void test115() {
		int pr = 115;
		String res = Function.getString(pr);
		assertEquals("сто пятнадцать", res);
	}

	@Test
	public void test999() {
		int pr = 999;
		String res = Function.getString(pr);
		assertEquals("девятьсот девяносто девять", res);
	}

	@Test
	public void testDecardCoord() {
		int x1 = 0;
		int y1 = 1;
		int x2 = 3;
		int y2 = 4;
		double rez = Function.DecartCoord(x1, y1, x2, y2);
		assertEquals(4, rez, 1);
	}

	@Test
	public void testDecardCoord_0() {
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		double rez = Function.DecartCoord(x1, y1, x2, y2);
		assertEquals(0, rez, 1);
	}

	@Test
	public void testDecardCoord_1() {
		int x1 = 1;
		int y1 = 1;
		int x2 = 1;
		int y2 = 1;
		double rez = Function.DecartCoord(x1, y1, x2, y2);
		assertEquals(0, rez, 1);
	}

	@Test
	public void testDecardCoord_2() {
		int x1 = -1;
		int y1 = 1;
		int x2 = 1;
		int y2 = -1;
		double rez = Function.DecartCoord(x1, y1, x2, y2);
		assertEquals(2, rez, 1);
	}

	@Test
	public void testDecardCoord_3() {
		int x1 = 5;
		int y1 = -1;
		int x2 = 3;
		int y2 = -2;
		double rez = Function.DecartCoord(x1, y1, x2, y2);
		assertEquals(2, rez, 1);
	}

	@Test
	public void testNumDay() {
		int num = 5;

		String rez = Function.numDay(num);
		assertEquals("Пятница", rez);
	}

	@Test
	public void testNumDay_1() {
		int num = 1;

		String rez = Function.numDay(num);
		assertEquals("Понедельник", rez);
	}

	@Test
	public void testNumDay_2() {
		int num = 7;

		String rez = Function.numDay(num);
		assertEquals("Воскресенье", rez);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNumDay_3() {
		int num = 8;

		Function.numDay(num);

	}

}
