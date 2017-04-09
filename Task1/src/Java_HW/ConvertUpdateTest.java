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
	@Test
	public void test43() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Miles", "Yard");
		assertEquals(1758.0, res, 0.1);
		
	}
	@Test
	public void test44() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Miles", "Phut");
		assertEquals(5290.3, res, 0.1);
		
	}
	@Test
	public void test45() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Miles", "Sagen");
		assertEquals(757.2, res, 0.1);
		
	}
	@Test
	public void test46() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Miles", "CosoySagen");
		assertEquals(534.07, res, 0.01);
		
	}
	@Test
	public void test47() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Miles", "Posoch");
		assertEquals(1008.06, res, 0.01);
		
	}
	@Test
	public void test48() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Miles", "Arshin");
		assertEquals(2271.6, res, 0.1);
		
	}
	@Test
	public void test49() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Yard", "Arshin");
		assertEquals(1.29, res, 0.01);
		
	}
	@Test
	public void test50() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Yard", "Miles");
		assertEquals(0.000568, res, 0.000001);
		
	}
	@Test
	public void test51() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Yard", "Sagen");
		assertEquals(0.43, res, 0.01);
		
	}
	@Test
	public void test52() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Yard", "CosoySagen");
		assertEquals(0.303, res, 0.001);
		
	}
	@Test
	public void test53() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Yard", "Phut");
		assertEquals(3.0, res, 0.1);
		
	}
	@Test
	public void test54() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Yard", "Posoch");
		assertEquals(0.57, res, 0.01);
		
	}
	@Test
	public void test56() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Posoch", "Yard");
		assertEquals(1.74, res, 0.01);
		
	}
	@Test
	public void test57() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Posoch", "Miles");
		assertEquals(0.000992, res, 0.000001);
		
	}
	@Test
	public void test58() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Posoch", "Phut");
		assertEquals(5.248, res, 0.001);
		
	}
	@Test
	public void test59() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Posoch", "Sagen");
		assertEquals(0.75, res, 0.01);
		
	}
	@Test
	public void test60() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Posoch", "CosoySagen");
		assertEquals(0.52, res, 0.01);
		
	}
	@Test
	public void test61() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Posoch", "Arshin");
		assertEquals(2.25, res, 0.01);
		
	}
	@Test
	public void test62() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Phut", "Arshin");
		assertEquals(0.42, res, 0.01);
		
	}
	@Test
	public void test63() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Phut", "Posoch");
		assertEquals(0.19, res, 0.01);
		
	}
	@Test
	public void test64() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Phut", "Sagen");
		assertEquals(0.14, res, 0.01);
		
	}
	@Test
	public void test65() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Phut", "CosoySagen");
		assertEquals(0.10, res, 0.01);
		
	}
	@Test
	public void test66() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Phut", "Miles");
		assertEquals(0.000189, res, 0.000001);
		
	}
	@Test
	public void test67() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Phut", "Yard");
		assertEquals(0.33, res, 0.01);
		
	}
	@Test
	public void test68() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Sagen", "Yard");
		assertEquals(2.32, res, 0.01);
		
	}
	@Test
	public void test69() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Sagen", "Miles");
		assertEquals(0.0013, res, 0.0001);
		
	}
	@Test
	public void test70() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Sagen", "Posoch");
		assertEquals(1.33, res, 0.01);
		
	}
	@Test
	public void test71() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Sagen", "CosoySagen");
		assertEquals(0.705, res, 0.001);
		
	}
	@Test
	public void test72() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Sagen", "Arshin");
		assertEquals(3.0, res, 0.1);
		
	}
	@Test
	public void test73() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Sagen", "Phut");
		assertEquals(6.98, res, 0.01);
		
	}
	@Test
	public void test74() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Arshin", "Phut");
		assertEquals(2.32, res, 0.01);
		
	}
	@Test
	public void test75() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Arshin", "Miles");
		assertEquals(0.00044, res, 1e-4);
		
	}
	@Test
	public void test76() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Arshin", "Yard");
		assertEquals(0.77, res, 0.01);
		
	}
	@Test
	public void test77() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Arshin", "Sagen");
		assertEquals(0.33, res, 0.01);
		
	}
	@Test
	public void test78() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Arshin", "CosoySagen");
		assertEquals(0.23, res, 0.01);
		
	}
	@Test
	public void test79() {
		double res=ConvertUpdate.VolumeOfDistance(1, "Arshin", "Posoch");
		assertEquals(0.44, res, 0.01);
		
	}
	@Test
	public void test206() {
		double res=ConvertUpdate.VolumeOfDistance(1, "CosoySagen", "Phut");
		assertEquals(9.90, res, 0.01);
		
	}
	@Test
	public void test207() {
		double res=ConvertUpdate.VolumeOfDistance(1, "CosoySagen", "Miles");
		assertEquals(0.0018, res, 1e-4);
		
	}
	@Test
	public void test208() {
		double res=ConvertUpdate.VolumeOfDistance(1, "CosoySagen", "Yard");
		assertEquals(3.29, res, 0.01);
		
	}
	@Test
	public void test209() {
		double res=ConvertUpdate.VolumeOfDistance(1, "CosoySagen", "Sagen");
		assertEquals(1.41, res, 0.01);
		
	}
	@Test
	public void test210() {
		double res=ConvertUpdate.VolumeOfDistance(1, "CosoySagen", "Arshin");
		assertEquals(4.25, res, 0.01);
		
	}
	@Test
	public void test211() {
		double res=ConvertUpdate.VolumeOfDistance(1, "CosoySagen", "Posoch");
		assertEquals(1.88, res, 0.01);
		
	}
	@Test
	public void test80() {
		double res=ConvertUpdate.VolumeOfWeight(1, "Stoune", "Funt");
		assertEquals(13.97, res, 0.01);
		
	}
	@Test
	public void test81() {
		double res=ConvertUpdate.VolumeOfWeight(1, "Stoune", "Uncia");
		assertEquals(223.52, res, 0.001);
		
	}
	@Test
	public void test82() {
		double res=ConvertUpdate.VolumeOfWeight(1, "Stoune", "Berck");
		assertEquals(0.038, res, 0.001);
		
	}
	@Test
	public void test83() {
		double res=ConvertUpdate.VolumeOfWeight(1, "Stoune", "Pud");
		assertEquals(0.38, res, 0.01);
		
	}
	@Test
	public void test84() {
		double res=ConvertUpdate.VolumeOfWeight(1, "Stoune", "Butman");
		assertEquals(1.55, res, 0.01);
		
	}
	@Test
	public void test85() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Stoune", "Tonna");
		assertEquals(0.0063, out, 0.0001);
		
	}
	@Test
	public void test86() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Tonna", "Stoune");
		assertEquals(157.48, out, 0.01);
		
	}
	@Test
	public void test87() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Tonna", "Pud");
		assertEquals(61.05, out, 0.01);
		
	}
	@Test
	public void test88() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Tonna", "Butman");
		assertEquals(244.2, out, 0.1);
		
	}
	@Test
	public void test89() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Tonna", "Uncia");
		assertEquals(35200.0, out, 0.1);
		
	}
	@Test
	public void test90() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Tonna", "Funt");
		assertEquals(2200.0, out, 0.1);
		
	}
	@Test
	public void test91() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Tonna", "Berck");
		assertEquals(6.10, out, 0.01);
		
	}
	@Test
	public void test92() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Berck", "Tonna");
		assertEquals(0.16, out, 0.01);
		
	}
	@Test
	public void test93() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Berck", "Uncia");
		assertEquals(5765, out, 1);
		
	}
	@Test
	public void test94() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Berck", "Funt");
		assertEquals(360, out, 1);
		
	}
	@Test
	public void test95() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Berck", "Pud");
		assertEquals(10, out, 1);
		
	}
	@Test
	public void test96() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Berck", "Stoune");
		assertEquals(25.79, out, 0.01);
		
	}
	@Test
	public void test97() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Berck", "Butman");
		assertEquals(40, out, 1);
		
	}
	@Test
	public void test98() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Uncia", "Butman");
		assertEquals(0.0069, out, 1e-4);
		
	}
	@Test
	public void test99() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Uncia", "Funt");
		assertEquals(0.0625, out, 1e-4);
		
	}
	@Test
	public void test100() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Uncia", "Stoune");
		assertEquals(0.0044, out, 1e-4);
		
	}
	@Test
	public void test101() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Uncia", "Berck");
		assertEquals(0.000173, out, 1e-4);
		
	}
	@Test
	public void test102() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Uncia", "Pud");
		assertEquals(0.0017, out, 1e-4);
		
	}
	@Test
	public void test103() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Uncia", "Tonna");
		assertEquals(0.0000284, out, 1e-5);
		
	}
	@Test
	public void test104() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Pud", "Tonna");
		assertEquals(0.016, out, 1e-2);
		
	}
	@Test
	public void test105() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Pud", "Uncia");
		assertEquals(576, out, 1);
		
	}
	@Test
	public void test106() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Pud", "Funt");
		assertEquals(36, out, 1);
		
	}
	@Test
	public void test107() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Pud", "Berck");
		assertEquals(0.099, out, 1e-2);
		
	}
	@Test
	public void test108() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Pud", "Stoune");
		assertEquals(2.57, out, 0.01);
		
	}
	@Test
	public void test109() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Pud", "Butman");
		assertEquals(4, out, 1);
		
	}
	@Test
	public void test110() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Funt", "Butman");
		assertEquals(0.11, out, 0.01);
		
	}
	@Test
	public void test111() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Funt", "Berck");
		assertEquals(0.002, out, 0.001);
		
	}
	@Test
	public void test112() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Funt", "Pud");
		assertEquals(0.02, out, 0.01);
		
	}
	@Test
	public void test113() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Funt", "Stoune");
		assertEquals(0.07, out, 0.01);
		
	}
	@Test
	public void test114() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Funt", "Uncia");
		assertEquals(16, out, 1);
		
	}
	@Test
	public void test115() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Funt", "Tonna");
		assertEquals(0.000454, out, 1e-4);
		
	}
	@Test
	public void test213() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Butman", "Funt");
		assertEquals(9.009, out, 0.001);
		
	}
	@Test
	public void test214() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Butman", "Berck");
		assertEquals(0.024, out, 0.001);
		
	}
	@Test
	public void test215() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Butman", "Pud");
		assertEquals(0.25, out, 0.01);
		
	}
	@Test
	public void test216() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Butman", "Stoune");
		assertEquals(0.64, out, 0.01);
		
	}
	@Test
	public void test217() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Butman", "Uncia");
		assertEquals(144, out, 1);
		
	}
	@Test
	public void test218() {
		double out=ConvertUpdate.VolumeOfWeight(1, "Butman", "Tonna");
		assertEquals(0.004, out, 1e-3);
		
	}
	@Test
	public void test116() {
		double out=ConvertUpdate.VolumeOfTime(1, "Secunda", "Hour");
		assertEquals(0.00027, out, 1e-4);
		
	}
	@Test
	public void test117() {
		double out=ConvertUpdate.VolumeOfTime(1, "Secunda", "AcademHour");
		assertEquals(0.000454, out, 1e-4);
		
	}
	@Test
	public void test118() {
		double out=ConvertUpdate.VolumeOfTime(1, "Secunda", "AstroHour");
		assertEquals(0.000277, out, 1e-4);
		
	}
	@Test
	public void test119() {
		double out=ConvertUpdate.VolumeOfTime(1, "Secunda", "ParaUniverse");
		assertEquals(0.000196, out, 1e-4);
		
	}
	@Test
	public void test120() {
		double out=ConvertUpdate.VolumeOfTime(1, "Secunda", "Milisec");
		assertEquals(1000, out, 1);
		
	}
	@Test
	public void test121() {
		double out=ConvertUpdate.VolumeOfTime(1, "Secunda", "Days");
		assertEquals(0.0000115, out, 1e-5);
		
	}
	@Test
	public void test122() {
		double out=ConvertUpdate.VolumeOfTime(1, "Days", "Secunda");
		assertEquals(86956, out, 1e5);
		
	}
	@Test
	public void test123() {
		double out=ConvertUpdate.VolumeOfTime(1, "Days", "Milisec");
		assertEquals(86900000, out, 1e7);
		
	}
	@Test
	public void test124() {
		double out=ConvertUpdate.VolumeOfTime(1, "Days", "AcademHour");
		assertEquals(32, out, 1);
		
	}
	@Test
	public void test125() {
		double out=ConvertUpdate.VolumeOfTime(1, "Days", "AstroHour");
		assertEquals(24, out, 1);
		
	}
	@Test
	public void test126() {
		double out=ConvertUpdate.VolumeOfTime(3, "Days", "Hour");
		assertEquals(72, out, 1);
		
	}
	@Test
	public void test127() {
		double out=ConvertUpdate.VolumeOfTime(1, "Days", "ParaUniverse");
		assertEquals(16.94, out, 0.01);
		
	}
	@Test
	public void test128() {
		double out=ConvertUpdate.VolumeOfTime(1, "ParaUniverse", "Days");
		assertEquals(0.059, out, 0.001);
		
	}
	@Test
	public void test129() {
		double out=ConvertUpdate.VolumeOfTime(1, "ParaUniverse", "Hour");
		assertEquals(1.41, out, 0.01);
		
	}
	@Test
	public void test130() {
		double out=ConvertUpdate.VolumeOfTime(1, "ParaUniverse", "AcademHour");
		assertEquals(1.88, out, 0.01);
		
	}
	@Test
	public void test131() {
		double out=ConvertUpdate.VolumeOfTime(1, "ParaUniverse", "AstroHour");
		assertEquals(1.41, out, 0.01);
		
	}
	@Test
	public void test132() {
		double out=ConvertUpdate.VolumeOfTime(1, "ParaUniverse", "Milisec");
		assertEquals(5100000, out, 1e7);
		
	}
	@Test
	public void test133() {
		double out=ConvertUpdate.VolumeOfTime(1, "ParaUniverse", "Secunda");
		assertEquals(5100, out, 1e4);
		
	}
	@Test
	public void test134() {
		double out=ConvertUpdate.VolumeOfTime(1, "Hour", "ParaUniverse");
		assertEquals(0.70, out, 0.01);
		
	}
	@Test
	public void test135() {
		double out=ConvertUpdate.VolumeOfTime(1, "Hour", "Secunda");
		assertEquals(3600, out, 0.01);
		
	}
	@Test
	public void test136() {
		double out=ConvertUpdate.VolumeOfTime(1, "Hour", "Days");
		assertEquals(0.04, out, 0.01);
		
	}
	@Test
	public void test137() {
		double out=ConvertUpdate.VolumeOfTime(1, "Hour", "AcademHour");
		assertEquals(1.33, out, 0.01);
		
	}
	@Test
	public void test138() {
		double out=ConvertUpdate.VolumeOfTime(1, "Hour", "AstroHour");
		assertEquals(1, out, 0.01);
		
	}
	@Test
	public void test139() {
		double out=ConvertUpdate.VolumeOfTime(1, "Hour", "Milisec");
		assertEquals(3600000, out, 0.01);
		
	}
	@Test
	public void test140() {
		double out=ConvertUpdate.VolumeOfTime(10000, "Milisec", "Hour");
		assertEquals(0.0027, out, 0.0001);
		
	}
	@Test
	public void test141() {
		double out=ConvertUpdate.VolumeOfTime(10000, "Milisec", "AstroHour");
		assertEquals(0.0027, out, 0.0001);
		
	}
	@Test
	public void test142() {
		double out=ConvertUpdate.VolumeOfTime(10000, "Milisec", "ParaUniverse");
		assertEquals(0.0019, out, 0.0001);
		
	}
	@Test
	public void test143() {
		double out=ConvertUpdate.VolumeOfTime(10000, "Milisec", "Secunda");
		assertEquals(10, out, 1);
		
	}
	@Test
	public void test144() {
		double out=ConvertUpdate.VolumeOfTime(10000, "Milisec", "Days");
		assertEquals(0.000115, out, 1e-4);
		
	}
	@Test
	public void test145() {
		double out=ConvertUpdate.VolumeOfTime(10000, "Milisec", "AcademHour");
		assertEquals(0.003, out, 0.001);
		
	}
	@Test
	public void test146() {
		double out=ConvertUpdate.VolumeOfTime(10, "AcademHour", "Hour");
		assertEquals(7.5, out, 0.1);
		
	}
	@Test
	public void test147() {
		double out=ConvertUpdate.VolumeOfTime(10, "AcademHour", "AstroHour");
		assertEquals(7.5, out, 0.1);
		
	}
	@Test
	public void test148() {
		double out=ConvertUpdate.VolumeOfTime(10, "AcademHour", "ParaUniverse");
		assertEquals(5.29, out, 0.01);
		
	}
	@Test
	public void test149() {
		double out=ConvertUpdate.VolumeOfTime(10, "AcademHour", "Secunda");
		assertEquals(27000, out, 1);
		
	}
	@Test
	public void test150() {
		double out=ConvertUpdate.VolumeOfTime(10, "AcademHour", "Days");
		assertEquals(0.31, out, 1e-1);
		
	}
	@Test
	public void test151() {
		double out=ConvertUpdate.VolumeOfTime(1, "AcademHour", "Milisec");
		assertEquals(2700000, out, 1e6);
		
	}
	@Test
	public void test152() {
		double out=ConvertUpdate.VolumeOfTime(10, "AstroHour", "Hour");
		assertEquals(10, out, 0.1);
		
	}
	@Test
	public void test153() {
		double out=ConvertUpdate.VolumeOfTime(10, "AstroHour", "AcademHour");
		assertEquals(13.3, out, 0.1);
		
	}
	@Test
	public void test154() {
		double out=ConvertUpdate.VolumeOfTime(10, "AstroHour", "ParaUniverse");
		assertEquals(7.05, out, 0.01);
		
	}
	@Test
	public void test155() {
		double out=ConvertUpdate.VolumeOfTime(1, "AstroHour", "Secunda");
		assertEquals(3600, out, 0.1);
		
	}
	@Test
	public void test156() {
		double out=ConvertUpdate.VolumeOfTime(10, "AstroHour", "Days");
		assertEquals(0.41, out, 0.01);
		
	}
	@Test
	public void test157() {
		double out=ConvertUpdate.VolumeOfTime(1, "AstroHour", "Milisec");
		assertEquals(3600000, out, 1e7);
		
	}
	@Test
	public void test158() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Kelvin", "Farengate");
		assertEquals(-457.86, out, 0.01);
		
	}
	@Test
	public void test159() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Kelvin", "Cels");
		assertEquals(-272.15, out, 0.01);
		
	}
	@Test
	public void test160() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Kelvin", "Newton");
		assertEquals(-89.80, out, 0.01);
		
	}
	@Test
	public void test161() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Kelvin", "Reomur");
		assertEquals(-217.72, out, 0.01);
		
	}
	@Test
	public void test162() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Kelvin", "Demel");
		assertEquals(558.22, out, 0.01);
		
	}
	@Test
	public void test163() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Kelvin", "Rankin");
		assertEquals(1.80, out, 0.01);
		
	}
	@Test
	public void test164() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Farengate", "Kelvin");
		assertEquals(255.92, out, 0.01);
		
	}
	@Test
	public void test165() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Farengate", "Cels");
		assertEquals(-17.22, out, 0.01);
		
	}
	@Test
	public void test166() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Farengate", "Newton");
		assertEquals(-5.68, out, 0.01);
		
	}
	@Test
	public void test167() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Farengate", "Reomur");
		assertEquals(-13.77, out, 0.01);
		
	}
	@Test
	public void test168() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Farengate", "Demel");
		assertEquals(175.83, out, 0.01);
		
	}
	@Test
	public void test169() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Farengate", "Rankin");
		assertEquals(460.67, out, 0.01);
		
	}
	@Test
	public void test170() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Cels", "Kelvin");
		assertEquals(274.15, out, 0.01);
		
	}
	@Test
	public void test171() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Cels", "Farengate");
		assertEquals(33.8, out, 0.01);
		
	}
	@Test
	public void test172() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Cels", "Newton");
		assertEquals(0.33, out, 0.01);
		
	}
	@Test
	public void test173() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Cels", "Reomur");
		assertEquals(0.8, out, 0.01);
		
	}
	@Test
	public void test174() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Cels", "Demel");
		assertEquals(148.5, out, 0.01);
		
	}
	@Test
	public void test175() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Cels", "Rankin");
		assertEquals(493.47, out, 0.01);
		
	}
	@Test
	public void test176() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Rankin", "Kelvin");
		assertEquals(0.55, out, 0.01);
		
	}
	@Test
	public void test177() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Rankin", "Farengate");
		assertEquals(-458.67, out, 0.01);
		
	}
	@Test
	public void test178() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Rankin", "Newton");
		assertEquals(-89.95, out, 0.01);
		
	}
	@Test
	public void test179() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Rankin", "Reomur");
		assertEquals(-218.07, out, 0.01);
		
	}
	@Test
	public void test180() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Rankin", "Demel");
		assertEquals(558.89, out, 0.01);
		
	}
	@Test
	public void test181() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Rankin", "Cels");
		assertEquals(-272.59, out, 0.01);
		
	}
	@Test
	public void test182() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Demel", "Kelvin");
		assertEquals(372.48, out, 0.01);
		
	}
	@Test
	public void test183() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Demel", "Farengate");
		assertEquals(210.79, out, 0.01);
		
	}
	@Test
	public void test184() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Demel", "Newton");
		assertEquals(32.78, out, 0.01);
		
	}
	@Test
	public void test185() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Demel", "Reomur");
		assertEquals(79.46, out, 0.01);
		
	}
	@Test
	public void test186() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Demel", "Rankin");
		assertEquals(670.47, out, 0.01);
		
	}
	@Test
	public void test187() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Demel", "Cels");
		assertEquals(99.33, out, 0.01);
		
	}
	@Test
	public void test188() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Reomur", "Kelvin");
		assertEquals(274.4, out, 0.01);
		
	}
	@Test
	public void test189() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Reomur", "Farengate");
		assertEquals(34.25, out, 0.01);
		
	}
	@Test
	public void test190() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Reomur", "Newton");
		assertEquals(0.41, out, 0.01);
		
	}
	@Test
	public void test191() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Reomur", "Demel");
		assertEquals(148.12, out, 0.01);
		
	}
	@Test
	public void test192() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Reomur", "Rankin");
		assertEquals(493.92, out, 0.01);
		
	}
	@Test
	public void test193() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Reomur", "Cels");
		assertEquals(1.25, out, 0.01);
		
	}
	@Test
	public void test194() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Newton", "Kelvin");
		assertEquals(276.18, out, 0.01);
		
	}
	@Test
	public void test195() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Newton", "Farengate");
		assertEquals(37.45, out, 0.01);
		
	}
	@Test
	public void test196() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Newton", "Reomur");
		assertEquals(2.42, out, 0.01);
		
	}
	@Test
	public void test197() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Newton", "Demel");
		assertEquals(145.45, out, 0.01);
		
	}
	@Test
	public void test198() {
		double out=ConvertUpdate.VolumeOfTemperature(1, "Newton", "Rankin");
		assertEquals(497.12, out, 0.01);
		
	}
	@Test
	public void test199() {
		double out=ConvertUpdate.VolumeOfTemperature(30, "Newton", "Cels");
		assertEquals(90.90, out, 0.01);
		
	}
	@Test
	public void test200() {
		double out=ConvertUpdate.VolumeOfTemperature(30, "Newton", "Newton");
		assertEquals(30.0, out, 0.1);
		
	}
	@Test
	public void test201() {
		double out=ConvertUpdate.VolumeOfTime(30, "Days", "Days");
		assertEquals(30.0, out, 0.1);
		
	}
	@Test
	public void test202() {
		double out=ConvertUpdate.VolumeOfWeight(30, "Pud", "Pud");
		assertEquals(30.0, out, 0.1);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void NullDistance() {
		ConvertUpdate.VolumeOfDistance(10, "Miles", null);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void NullDistance1() {
		ConvertUpdate.VolumeOfDistance(10, null, null);
		
	}
	

	@Test
	public void DoubleYardTest() {
		ConvertUpdate.VolumeOfDistance(1, "Yard", "Yard");
		
	}
	@Test
	public void DoubleVedroTest() {
		double res=ConvertUpdate.VolumeOfAmount(1, "Vedro", "Vedro");
		assertEquals(1, res, 0.01);
	}
	@Test(expected=IllegalArgumentException.class)
	public void NullAmount() {
		ConvertUpdate.VolumeOfAmount(1, null, null);
		
	}
	
	
	
	
	
	
	
	
	
//	@Test
//	public void NullAmount1() {
//		double res=ConvertUpdate.VolumeOfAmount(-1, "Vedro", "Galon");
//		assertEquals(1, res, 0.01);
//		
//	}

}
