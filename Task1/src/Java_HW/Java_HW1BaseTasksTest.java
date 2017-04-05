package Java_HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class Java_HW1BaseTasksTest {

	@Test
	public void testMaxFunc_Standart() {
		int a = -2;
		int b = 4;
		int c = 1;
		int z;
		z = Java_HW1BaseTasks.MaxFunc(a, b, c);
		assertEquals(6, z);
	}

	@Test
	public void testMaxFunc_Zero() {
		int a = 0;
		int b = 0;
		int c = 0;
		int z;
		z = Java_HW1BaseTasks.MaxFunc(a, b, c);
		assertEquals(0, z);
	}

	@Test
	public void testMaxFunc_AllOne() {
		int a = 1;
		int b = 1;
		int c = 1;
		int z;
		z = Java_HW1BaseTasks.MaxFunc(a, b, c);
		assertEquals(6, z);
	}

	@Test
	public void testMaxFunc_OneZero() {
		int a = -2;
		int b = 0;
		int c = 1;
		int z;
		z = Java_HW1BaseTasks.MaxFunc(a, b, c);
		assertEquals(3, z);
	}

	@Test
	public void testMaxFunc_AllNatural() {
		int a = 6;
		int b = 7;
		int c = 1;
		int z;
		z = Java_HW1BaseTasks.MaxFunc(a, b, c);
		assertEquals(45, z);
	}

	@Test
	public void testNotodd_NeChet() {
		int a = 3;
		int b = 0;
		int z;
		z = Java_HW1BaseTasks.Notodd(a, b);
		assertEquals(3, z);
	}

	@Test
	public void testNotodd_Chet() {
		int a = 4;
		int b = 3;
		int z;
		z = Java_HW1BaseTasks.Notodd(a, b);
		assertEquals(12, z);
	}

	@Test
	public void testNotodd_Zero() {
		int a = 0;
		int b = 123;
		int z;
		z = Java_HW1BaseTasks.Notodd(a, b);
		assertEquals(0, z);
	}

	@Test
	public void testNotodd_NegativeValueOdd() {
		int a = -8;
		int b = 3;
		int z;
		z = Java_HW1BaseTasks.Notodd(a, b);
		assertEquals(-24, z);
	}

	@Test
	public void testNotodd_NegativeValueNotOdd() {
		int a = -9;
		int b = -3;
		int z;
		z = Java_HW1BaseTasks.Notodd(a, b);
		assertEquals(-12, z);
	}

	@Test
	public void testSum3x_AllPozitive() {
		int a = 6;
		int b = 3;
		int c = 9;
		int z;
		z = Java_HW1BaseTasks.Sum3x(a, b, c);
		assertEquals(18, z);
	}

	@Test
	public void testSum3x_AllNegotive() {
		int a = -6;
		int b = -3;
		int c = -9;
		int z;
		z = Java_HW1BaseTasks.Sum3x(a, b, c);
		assertEquals(0, z);
	}

	@Test
	public void testSum3x_AllZero() {
		int a = 0;
		int b = 0;
		int c = 0;
		int z;
		z = Java_HW1BaseTasks.Sum3x(a, b, c);
		assertEquals(0, z);
	}

	@Test
	public void testSum3x_TwoNegative() {
		int a = -6;
		int b = -3;
		int c = 9;
		int z;
		z = Java_HW1BaseTasks.Sum3x(a, b, c);
		assertEquals(9, z);
	}

	@Test
	public void testSum3x_OneNegotive() {
		int a = -6;
		int b = 5;
		int c = 9;
		int z;
		z = Java_HW1BaseTasks.Sum3x(a, b, c);
		assertEquals(14, z);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testMarksExpNeg() {
		
		Java_HW1BaseTasks.Marks(-1);
		
	}

	@Test(expected=IllegalArgumentException.class)
	public void testMarksLimit100() {
	
		Java_HW1BaseTasks.Marks(101);
	
	}

	@Test
	public void testMarksF1() {
		int a = 0;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("F", z);
	}

	@Test
	public void testMarksF2() {
		int a = 15;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("F", z);
	}

	@Test
	public void testMarksF3() {
		int a = 19;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("F", z);
	}

	@Test
	public void testMarksE1() {
		int a = 20;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("E", z);
	}

	@Test
	public void testMarksE2() {
		int a = 35;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("E", z);
	}

	@Test
	public void testMarksE3() {
		int a = 39;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("E", z);
	}

	@Test
	public void testMarksD1() {
		int a = 40;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("D", z);
	}

	@Test
	public void testMarksD2() {
		int a = 47;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("D", z);
	}

	@Test
	public void testMarksD3() {
		int a = 59;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("D", z);
	}

	@Test
	public void testMarksC1() {
		int a = 60;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("C", z);
	}

	@Test
	public void testMarksC2() {
		int a = 69;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("C", z);
	}

	@Test
	public void testMarksC3() {
		int a = 74;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("C", z);
	}

	@Test
	public void testMarksB1() {
		int a = 75;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("B", z);
	}

	@Test
	public void testMarksB2() {
		int a = 82;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("B", z);
	}

	@Test
	public void testMarksB3() {
		int a = 89;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("B", z);
	}

	@Test
	public void testMarksA1() {
		int a = 90;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("A", z);
	}

	@Test
	public void testMarksA2() {
		int a = 97;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("A", z);
	}

	@Test
	public void testMarksA3() {
		int a = 100;
		String z;
		z = Java_HW1BaseTasks.Marks(a);
		assertEquals("A", z);
	}

	@Test
	public void testCoord_00() {
		int x = 1;
		int y = 2;
		int quarter = Java_HW1BaseTasks.Coord(x, y);
		assertEquals(1, quarter);
	}

	@Test
	public void testCoord_01() {
		int x = -1;
		int y = 4;
		int quarter = Java_HW1BaseTasks.Coord(x, y);
		assertEquals(2, quarter);
	}

	@Test
	public void testCoord_02() {
		int x = -6;
		int y = -8;
		int quarter = Java_HW1BaseTasks.Coord(x, y);
		assertEquals(3, quarter);
	}

	@Test
	public void testCoord_03() {
		int x = 5;
		int y = -1;
		int quarter = Java_HW1BaseTasks.Coord(x, y);
		assertEquals(4, quarter);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCoordExep() {
		
		Java_HW1BaseTasks.Coord(0, 0);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void testCoordExep1() {
		
		Java_HW1BaseTasks.Coord(1, 0);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void testCoordExep2() {
		
		Java_HW1BaseTasks.Coord(0, -2);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void testCoordExep3() {
		
		Java_HW1BaseTasks.Coord(-1, 0);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void testCoordExep4() {
		
		Java_HW1BaseTasks.Coord(0, 1);
		
	}
}
