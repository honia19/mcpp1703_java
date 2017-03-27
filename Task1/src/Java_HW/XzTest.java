package Java_HW;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class XzTest {

	@Test
	public void Testf_10_20() {
		
		int c=Xz.function(10, 20);
		
		assertEquals(200,c);
		
		
	}
	@Test
	public void Testf_calcPlus1() {
		
		int c=Xz.calc(10, 20, "+");
		assertEquals(30, c);
		
		
		
	}

	@Test
	public void Testf_calcMinus() {
		
		int c=Xz.calc(10, 20,"-");
		
		assertEquals(-10,c);
		
		
	}

	@Test
	public void Testf_calcMult() {
		
		int c=Xz.calc(10, 20,"*");
		
		assertEquals(200,c);
		
		
	}

	@Test
	public void Testf_CalcDiv() {
		
		int c=Xz.calc(20, 10, "/");
		
		assertEquals(2,c);
		
		
	}
	@Test
	public void Testf_ArrayMax() {
		int arr[]={1,2,3,4,5,6,7,8,9};
		
		int c=Xz.Array(arr);
		
		assertEquals(9,c);
		
		
	}



}
