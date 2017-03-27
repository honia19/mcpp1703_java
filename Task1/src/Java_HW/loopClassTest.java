package Java_HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class loopClassTest {

	@Test
	public void testMirror_0() {
		int param=0;
		int value=loopClass.Mirror(param);
		assertEquals(0,value);
		
	}
	@Test
	public void testMirror_Pozit() {
		int param=1853978;
		int value=loopClass.Mirror(param);
		assertEquals(8793581,value);
		
	}
	@Test
	public void testMirror_Negat() {
		int param=-36489891;
		int value=loopClass.Mirror(param);
		assertEquals(19898463,value);
		
	}
	@Test
	public void testMirror_OneValue() {
		int param=5;
		int value=loopClass.Mirror(param);
		assertEquals(5,value);
		
	}
	@Test
	public void testSumofValue_Negative() {
		int param=-123;
		int value=loopClass.SumofValue(param);
		assertEquals(6,value);
		
	}
	@Test
	public void testSumofValue_0() {
		int param=0;
		int value=loopClass.SumofValue(param);
		assertEquals(0,value);
		
	}
	@Test
	public void testSumofValue_Value() {
		int param=1234;
		int value=loopClass.SumofValue(param);
		assertEquals(10,value);
		
	}
	@Test
	public void TestFactorial6() {
		int param=6;
		int value=loopClass.Factorial(param);
		assertEquals(720,value);
		
	}
	@Test
	public void TestFactorial1() {
		int param=1;
		int value=loopClass.Factorial(param);
		assertEquals(1,value);
		
	}
	@Test
	public void TestFactorial10() {
		int param=10;
		int value=loopClass.Factorial(param);
		assertEquals(3628800,value);
		
	}
	@Test
	public void TestIsOdd() {
		int value=0;
		boolean IsAnswer=loopClass.isOdd(value);
		assertFalse(IsAnswer);
		
	}
	@Test
	public void TestIsOdd1() {
		int value=-1;
		boolean IsAnswer=loopClass.isOdd(value);
		assertFalse(IsAnswer);
		
	}
	@Test
	public void TestIsOdd2() {
		int value=1;
		boolean IsAnswer=loopClass.isOdd(value);
		assertFalse(IsAnswer);
		
	}
	@Test
	public void TestIsOdd3() {
		int value=16;
		boolean IsAnswer=loopClass.isOdd(value);
		assertFalse(IsAnswer);
		
	}
	@Test
	public void TestIsOdd4() {
		int value=17;
		boolean IsAnswer=loopClass.isOdd(value);
		assertTrue(IsAnswer);
		
	}
	@Test
	public void TestIsOdd5() {
		int value=31;
		boolean IsAnswer=loopClass.isOdd(value);
		assertTrue(IsAnswer);
		
	}
	@Test
	public void TestSumDiapazon() {
		
		int value=loopClass.SumDiapazon();
		assertEquals(2450,value);
		
	}
	@Test
	public void TestSumDiapazon2() {
		
		int value=loopClass.SumDiapazon2();
		assertEquals(49,value);
		
	}
	@Test
	public void TestSqrt1() {
		
		int value=loopClass.Sqrt1(16);
		assertEquals(4,value);
		
	}
	@Test
	public void TestSqrt2() {
		
		int value=loopClass.Sqrt1(3);
		assertEquals(1,value);
		
	}
	@Test
	public void TestSqrt3() {
		
		int value=loopClass.Sqrt1(0);
		assertEquals(0,value);
		
	}
	@Test
	public void TestSqrt4() {
		
		int value=loopClass.Sqrt1(27);
		assertEquals(5,value);
		
	}
	@Test
	public void TestSqrt5() {
		
		int value=loopClass.Sqrt1(99);
		assertEquals(9,value);
		
	}
	@Test
	public void TestSqrt2_1() {
		
		int value=loopClass.Sqrt2(16);
		assertEquals(4,value);
		
	}
	@Test
	public void TestSqrt2_2() {
		
		int value=loopClass.Sqrt2(3);
		assertEquals(1,value);
		
	}
	@Test
	public void TestSqrt2_3() {
		
		int value=loopClass.Sqrt2(0);
		assertEquals(0,value);
		
	}
	@Test
	public void TestSqrt2_4() {
		
		int value=loopClass.Sqrt2(27);
		assertEquals(5,value);
		
	}
	@Test
	public void TestSqrt2_5() {
		
		int value=loopClass.Sqrt2(99);
		assertEquals(9,value);
		
	}
	
}
