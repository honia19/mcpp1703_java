package Java_HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class massTest {

	@Test
	public void testReversArr_4() {

		int[] in = { 1, 2, 3, 4 };
		int[] out = { 4, 3, 2, 1 };
		mass.Reverse(in);
		assertArrayEquals(out, in);
	}



	@Test
	public void testReversArr_3() {

		int[] in = { 5, 4, 3 };
		int[] out = { 3, 4, 5 };
		mass.Reverse(in);
		assertArrayEquals(out, in);
	}

	@Test
	public void testReversArr_2() {

		int[] in = { 5, 4 };
		int[] out = { 4, 5 };
		mass.Reverse(in);
		assertArrayEquals(out, in);
	}

	@Test
	public void testReversArr_1() {

		int[] in = { 4 };
		int[] out = { 4 };
		mass.Reverse(in);
		assertArrayEquals(out, in);
	}

	@Test
	public void testReversArr_Zero() {

		int[] in = { 0 };
		int[] out = { 0 };
		mass.Reverse(in);
		assertArrayEquals(out, in);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testReversArr_null() {

		
		mass.Reverse(null);
	
	}
	@Test(expected=IllegalArgumentException.class)
	public void testReversArr_Pusto() {

		int[] in = {};
		mass.Reverse(in);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void testCountEven_null() {

		
		mass.CountUneven(null);
	
	}
	@Test(expected=IllegalArgumentException.class)
	public void testCountEven_Pusto() {

		int[] in = {};
	mass.CountUneven(in);
		
	}

	@Test
	public void testCountEven() {

		int[] in = { 5, 4, 3, 6, 9, 8, 7 };

		int res = mass.CountUneven(in);
		assertEquals(4, res);
	}
	

	@Test
	public void testCountEven_0() {

		int[] in = { 0 };

		int res = mass.CountUneven(in);
		assertEquals(0, res);
	}

	@Test
	public void testCountEven_2() {

		int[] in = { 7, 2 };

		int res = mass.CountUneven(in);
		assertEquals(1, res);
	}

	@Test
	public void testCountEven_All() {

		int[] in = { 7, -1, 3, -5, 9 };

		int res = mass.CountUneven(in);
		assertEquals(5, res);
	}

	@Test
	public void testCountEven_AllNotEven() {

		int[] in = { 2, 4, 6, 8, 10, 22, 14, 12, -2, 0, -6 };

		int res = mass.CountUneven(in);
		assertEquals(0, res);
	}

	@Test
	public void testSumElemUneven() {

		int[] in = { 5, 4, 3, 6, 9, 8, 7 };

		int res = mass.SumElemUneven(in);
		assertEquals(18, res);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testSumElemUneven_Pusto() {

		int[] in = {};
	mass.SumElemUneven(in);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void testSumElemUneven_Null() {

		
		 mass.SumElemUneven(null);
		
	}

	@Test
	public void testSumElemUneven_0() {

		int[] in = { 0 };

		int res = mass.SumElemUneven(in);
		assertEquals(0, res);
	}

	@Test
	public void testSumElemUneven_2() {

		int[] in = { 5, 4 };

		int res = mass.SumElemUneven(in);
		assertEquals(4, res);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testiMaxArray_Pusto() {

		int[] in = {};

		mass.iMaxArray(in);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void testiMaxArray_Null() {

		

		 mass.iMaxArray(null);
		
	}

	@Test
	public void testiMaxArray_1() {

		int[] in = { 5, 4 };

		int res = mass.iMaxArray(in);
		assertEquals(0, res);
	}

	@Test
	public void testiMaxArray_2() {
		int[] in = { 5, 4, 3, 6, 9, 8, 7 };

		int res = mass.iMaxArray(in);
		assertEquals(4, res);
	}

	@Test
	public void testiMaxArray_3() {

		int[] in = { 2, 4, 6, 8, 10, 22, 14, 12, -2, 0, -6 };
		int res = mass.iMaxArray(in);
		assertEquals(5, res);
	}

	@Test
	public void testiMaxArray_4() {

		int[] in = { 0 };
		int res = mass.iMaxArray(in);
		assertEquals(0, res);
	}

	@Test
	public void testiMaxArray_5() {

		int[] in = { -9, -20 };
		int res = mass.iMaxArray(in);
		assertEquals(0, res);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testiMinArray_Pusto() {

		int[] in = {  };
		 mass.iMinArray(in);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void testiMinArray_Null() {

		
		 mass.iMinArray(null);
		
	}

	@Test
	public void testiMinArray_0() {

		int[] in = { 0 };
		int res = mass.iMinArray(in);
		assertEquals(0, res);
	}

	@Test
	public void testiMinArray_1() {

		int[] in = { 2, 4, 6, 8, 10, 22, 14, 12, -2, 0, -6 };
		int res = mass.iMinArray(in);
		assertEquals(10, res);
	}

	@Test
	public void testiMinArray_2() {

		int[] in = { 5, 4, 3, 6, 9, 8, 7 };
		int res = mass.iMinArray(in);
		assertEquals(2, res);
	}

	@Test
	public void testiMinArray_3() {

		int[] in = { -5, -4, -3, -6, -9, -8, -7 };
		int res = mass.iMinArray(in);
		assertEquals(4, res);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testMaxArray_Pusto() {

		int[] in = { };
		mass.MaxArray(in);
	
	}
	@Test(expected=IllegalArgumentException.class)
	public void testMaxArray_Null() {

		
		 mass.MaxArray(null);
	
	}

	@Test
	public void testMaxArray_0() {

		int[] in = { 0 };
		int res = mass.MaxArray(in);
		assertEquals(0, res);
	}

	@Test
	public void testMaxArray_1() {

		int[] in = { 0, 1, 9, 7, 3, 9 };
		int res = mass.MaxArray(in);
		assertEquals(9, res);
	}

	@Test
	public void testMaxArray_2() {

		int[] in = { 0, -1, -9, -7, -3, -9 };
		int res = mass.MaxArray(in);
		assertEquals(0, res);
	}

	@Test
	public void testMaxArray_3() {

		int[] in = { -18, -1, -9, -7, -3, -9 };
		int res = mass.MaxArray(in);
		assertEquals(-1, res);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testMinArray_Pusto() {

		int[] in = { };
		mass.MinArray(in);
	
	}
	@Test(expected=IllegalArgumentException.class)
	public void testMinArray_Null() {

		int[] arr=null;
	mass.MinArray(arr);
	
	}

	@Test
	public void testMinArray_0() {

		int[] in = { -18, -1, -9, -7, -3, -9 };
		int res = mass.MinArray(in);
		assertEquals(-18, res);
	}

	@Test
	public void testMinArray_1() {

		int[] in = { 0 };
		int res = mass.MinArray(in);
		assertEquals(0, res);
	}

	@Test
	public void testMinArray_2() {

		int[] in = { 0, -1, 6 };
		int res = mass.MinArray(in);
		assertEquals(-1, res);
	}

	@Test
	public void testMinArray_3() {

		int[] in = { 12, 11, 6, 36, 98, 135, 10 };
		int res = mass.MinArray(in);
		assertEquals(6, res);
	}

	@Test
	public void testMinArray_4() {

		int[] in = { -12, -11, -6, -36, -98, -135, -10 };
		int res = mass.MinArray(in);
		assertEquals(-135, res);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testChengeHalfArr_Pusto() {

		int[] in = {  };
		

		mass.ChengeHalfArr(in);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void testChengeHalfArr_null() {

		
		

		mass.ChengeHalfArr(null);
		
	}

	@Test
	public void testChengeHalfArr_0() {

		int[] in = { -12, -11, -6, -36 };
		int[] out = { -6, -36, -12, -11 };

		 mass.ChengeHalfArr(in);
		assertArrayEquals(out, in);
	}

	@Test
	public void testChengeHalfArr_1() {

		int[] in = { 12, 13, 6, 47 };
		int[] out = { 6, 47, 12, 13 };

		 mass.ChengeHalfArr(in);
		assertArrayEquals(out, in);
	}

	@Test
	public void testChengeHalfArr_2() {

		int[] in = { 12, 13, 6, 4, 7 };
		int[] out = { 4, 7, 6, 12, 13 };

		mass.ChengeHalfArr(in);
		assertArrayEquals(out, in);
	}

}
