package Java_HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertUpdateTest {

	@Test
	public void test1() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Galon", "Barrel");
		assertEquals(0.023, res, 0.01);
		
	}
	@Test
	public void test2() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Galon", "Anker");
		assertEquals(0.10, res, 0.01);
		
	}
	@Test
	public void test3() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Galon", "Vedro");
		assertEquals(0.304, res, 0.01);
		
	}
	@Test
	public void test4() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Galon", "Pinta");
		assertEquals(6.65, res, 0.01);
		
	}
	@Test
	public void test5() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Galon", "Shopen");
		assertEquals(7.60, res, 0.01);
		
	}
	@Test
	public void test6() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Galon", "Kvarta");
		assertEquals(3.306, res, 0.01);
		
	}
	@Test
	public void test7() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Barrel", "Galon");
		assertEquals(41.84, res, 0.01);
		
	}
	@Test
	public void test8() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Barrel", "Kvarta");
		assertEquals(138.33, res, 0.01);
		
	}
	@Test
	public void test9() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Barrel", "Pinta");
		assertEquals(278.25, res, 0.01);
		
	}
	@Test
	public void test10() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Barrel", "Shopen");
		assertEquals(318.0, res, 0.01);
		
	}
	@Test
	public void test11() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Barrel", "Vedro");
		assertEquals(12.72, res, 0.01);
		
	}
	@Test
	public void test12() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Barrel", "Anker");
		assertEquals(4.41, res, 0.01);
		
	}
	@Test
	public void test13() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Anker", "Barrel");
		assertEquals(0.22, res, 0.01);
		
	}
	@Test
	public void test14() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Anker", "Galon");
		assertEquals(9.47, res, 0.01);
		
	}
	@Test
	public void test15() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Anker", "Pinta");
		assertEquals(63.0, res, 0.01);
		
	}
	@Test
	public void test16() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Anker", "Shopen");
		assertEquals(72.0, res, 0.01);
		
	}
	@Test
	public void test17() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Anker", "Kvarta");
		assertEquals(31.32, res, 0.01);
		
	}
	@Test
	public void test18() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Anker", "Vedro");
		assertEquals(2.88, res, 0.01);
		
	}
	@Test
	public void test19() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Pinta", "Galon");
		assertEquals(0.15, res, 0.01);
		
	}
	@Test
	public void test20() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Pinta", "Barrel");
		assertEquals(0.0035, res, 0.0001);
		
	}
	@Test
	public void test21() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Pinta", "Vedro");
		assertEquals(0.045, res, 0.001);
		
	}
	@Test
	public void test22() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Pinta", "Shopen");
		assertEquals(1.14, res, 0.01);
		
	}
	@Test
	public void test23() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Pinta", "Anker");
		assertEquals(0.015, res, 0.001);
		
	}
	@Test
	public void test24() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Pinta", "Kvarta");
		assertEquals(0.49, res, 0.01);
		
	}
	@Test
	public void test25() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Kvarta", "Pinta");
		assertEquals(2.01, res, 0.01);
		
	}
	@Test
	public void test26() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Kvarta", "Barrel");
		assertEquals(0.007, res, 0.001);
		
	}
	@Test
	public void test27() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Kvarta", "Galon");
		assertEquals(0.3021, res, 0.001);
		
	}
	@Test
	public void test28() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Kvarta", "Anker");
		assertEquals(0.031, res, 0.001);
		
	}
	@Test
	public void test29() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Kvarta", "Shopen");
		assertEquals(2.29, res, 0.01);
		
	}
	@Test
	public void test30() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Kvarta", "Vedro");
		assertEquals(0.09, res, 0.01);
		
	}
	@Test
	public void test31() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Shopen", "Vedro");
		assertEquals(0.04, res, 0.01);
		
	}
	@Test
	public void test32() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Shopen", "Galon");
		assertEquals(0.13, res, 0.01);
		
	}
	@Test
	public void test33() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Shopen", "Barrel");
		assertEquals(0.003, res, 0.001);
		
	}
	@Test
	public void test34() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Shopen", "Pinta");
		assertEquals(0.875, res, 0.001);
		
	}
	@Test
	public void test35() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Shopen", "Kvarta");
		assertEquals(0.435, res, 0.001);
		
	}
	@Test
	public void test36() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Shopen", "Anker");
		assertEquals(0.01, res, 0.01);
		
	}
	@Test
	public void test37() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Vedro", "Anker");
		assertEquals(0.34, res, 0.01);
		
	}
	@Test
	public void test38() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Vedro", "Galon");
		assertEquals(3.28, res, 0.01);
		
	}
	@Test
	public void test39() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Vedro", "Barrel");
		assertEquals(0.07, res, 0.01);
		
	}
	@Test
	public void test40() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Vedro", "Shopen");
		assertEquals(25.0, res, 0.01);
		
	}
	@Test
	public void test41() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Vedro", "Kvarta");
		assertEquals(10.87, res, 0.01);
		
	}
	@Test
	public void test42() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Vedro", "Pinta");
		assertEquals(21.87, res, 0.01);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void DoubleVedroTest() {
		ConvertUpdate.VolumeOfAmount(11.52, "Vedro", "Vedro");
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void NullAmount() {
		ConvertUpdate.VolumeOfAmount(11.52, null, null);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void NullAmount1() {
		ConvertUpdate.VolumeOfAmount(-1, "Vedro", "Galon");
		
	}

}
