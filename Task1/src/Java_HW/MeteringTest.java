package Java_HW;

import static org.junit.Assert.*;

import org.junit.Test;

public class MeteringTest {

	@Test
	public void testMiles1() {
		double in = 1089;
		double out = 0.67;

		double res = Metering.Miles(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testMiles2() {

		Metering.Miles(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testMiles3() {

		Metering.Miles(-8);

	}

	@Test
	public void testYard1() {
		double in = 1089;
		double out = 1187.01;

		double res = Metering.Yard(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testYard2() {

		Metering.Yard(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testYards3() {

		Metering.Yard(-4);

	}

	@Test
	public void testPhut1() {
		double in = 1089;
		double out = 3571.91;

		double res = Metering.Phut(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPhut2() {

		Metering.Phut(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPhut3() {

		Metering.Phut(-4);

	}

	@Test
	public void testSagen1() {
		double in = 1089;
		double out = 511.26;

		double res = Metering.Sagen(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testSagen2() {

		Metering.Sagen(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testSagen3() {

		Metering.Sagen(-4);

	}

	@Test
	public void testCosoySagen1() {
		double in = 1089;
		double out = 360.59;

		double res = Metering.CosoySagen(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testCosoySagen2() {

		Metering.CosoySagen(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testCosoySagen3() {

		Metering.CosoySagen(-4);

	}

	@Test
	public void testPosoch1() {
		double in = 1089;
		double out = 680.625;

		double res = Metering.Posoch(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPosoch2() {

		Metering.Posoch(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPosoch3() {

		Metering.Posoch(-4);

	}

	@Test
	public void testArshin1() {
		double in = 1089;
		double out = 1533.80;

		double res = Metering.Arshin(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testArshin2() {

		Metering.Arshin(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testArshin3() {

		Metering.Arshin(-4);

	}

	@Test
	public void testStoune1() {
		double in = 100;
		double out = 15.74;

		double res = Metering.Stoune(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testStoune2() {

		Metering.Stoune(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testStoune3() {

		Metering.Stoune(-4);

	}

	@Test
	public void testFunt1() {
		double in = 100;
		double out = 220.00;

		double res = Metering.Funt(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testFunt2() {

		Metering.Funt(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testFunt3() {

		Metering.Funt(-4);

	}

	@Test
	public void testUncia1() {
		double in = 100;
		double out = 3520.00;

		double res = Metering.Uncia(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testUncia2() {

		Metering.Uncia(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testUncia3() {

		Metering.Uncia(-4);

	}

	@Test
	public void testPud1() {
		double in = 100;
		double out = 6.10;

		double res = Metering.Pud(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPud2() {

		Metering.Pud(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPud3() {

		Metering.Pud(-4);

	}

	@Test
	public void testBercovec1() {
		double in = 100;
		double out = 0.61;

		double res = Metering.Berckovec(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testBercovec2() {

		Metering.Berckovec(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testBercovec3() {

		Metering.Berckovec(-4);

	}

	@Test
	public void testBatman1() {
		double in = 100;
		double out = 24.42;

		double res = Metering.Butman(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testBatman2() {

		Metering.Butman(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testBatman3() {

		Metering.Butman(-4);

	}

	@Test
	public void testTonna1() {
		double in = 100;
		double out = 0.10;

		double res = Metering.Tonna(in);
		assertEquals(out, res, 0.1);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testTonna2() {

		Metering.Tonna(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testTonna3() {

		Metering.Tonna(-4);

	}

	@Test
	public void testKvarta1() {
		double in = 100;
		double out = 87;

		double res = Metering.Kvarta(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testKvarta2() {

		Metering.Kvarta(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testKvarta3() {

		Metering.Kvarta(-4);

	}

	@Test
	public void testPinta1() {
		double in = 100;
		double out = 175;

		double res = Metering.Pinta(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPinta2() {

		Metering.Pinta(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPinta3() {

		Metering.Pinta(-4);

	}

	@Test
	public void testGalon1() {
		double in = 100;
		double out = 26.315;

		double res = Metering.Galon(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testGalon2() {

		Metering.Galon(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testGalon3() {

		Metering.Galon(-4);

	}

	@Test
	public void testBarrel1() {
		double in = 100;
		double out = 0.62;

		double res = Metering.Barrel(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testBarrel2() {

		Metering.Barrel(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testBarrel3() {

		Metering.Barrel(-4);

	}

	@Test
	public void testAnker1() {
		double ini = 1000;
		double out = 27.7;

		double res = Metering.Anker(ini);
		assertEquals(out, res, 0.1);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testAnker2() {

		Metering.Anker(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testAnker3() {

		Metering.Anker(-4);

	}

	@Test
	public void testVedro1() {
		double in = 100;
		double out = 8;

		double res = Metering.Vedro(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testVedro2() {

		Metering.Vedro(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testVedro3() {

		Metering.Vedro(-4);

	}

	@Test
	public void testShopen1() {
		double in = 100;
		double out = 200;

		double res = Metering.Shopen(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testShopen2() {

		Metering.Shopen(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testShopen3() {

		Metering.Shopen(-4);

	}

	@Test
	public void testSec1() {
		double in = 100;
		double out = 6000;

		double res = Metering.Secunda(in);
		assertEquals(out, res, 1);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testSec2() {

		Metering.Secunda(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testSec3() {

		Metering.Secunda(-4);

	}

	@Test
	public void testHour1() {
		double in = 100;
		double out = 1.66;

		double res = Metering.Hour(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testHour2() {

		Metering.Hour(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testHour3() {

		Metering.Hour(-4);

	}

	@Test
	public void testDays1() {
		double in = 10;
		double out = 0.0069;

		double res = Metering.Days(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testDays2() {

		Metering.Days(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testDays3() {

		Metering.Days(-4);

	}

	@Test
	public void testAcademHour1() {
		double in = 10;
		double out = 0.22;

		double res = Metering.AcademHour(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testAcademHour2() {

		Metering.AcademHour(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testtestAcademHour3() {

		Metering.AcademHour(-4);

	}

	@Test
	public void testAstroHour1() {
		double in = 10;
		double out = 0.16;

		double res = Metering.AstroHour(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testAstroHourr2() {

		Metering.AstroHour(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testAstroHour3() {

		Metering.AstroHour(-4);

	}

	@Test
	public void testPara1() {
		double in = 10;
		double out = 0.117;

		double res = Metering.ParaUniverse(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPara2() {

		Metering.ParaUniverse(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPara3() {

		Metering.ParaUniverse(-4);

	}

	@Test
	public void testMiliSec1() {
		double in = 10;
		double out = 600000;

		double res = Metering.Milisec(in);
		assertEquals(out, res, 0.01);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testMiliSec2() {

		Metering.Milisec(0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testMiliSec3() {

		Metering.Milisec(-4);

	}

	@Test
	public void testFarengate1() {
		double in = 25;
		double out = 77;

		double res = Metering.Farengate(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void testFarengate2() {
		double in = 25.5;
		double out = 77.9;

		double res = Metering.Farengate(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void testFarengate3() {
		double in = 0;
		double out = 32;

		double res = Metering.Farengate(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void testFarengate4() {
		double in = -10.5;
		double out = 13.09;

		double res = Metering.Farengate(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void testKelvin1() {
		double in = 25;
		double out = 298.15;

		double res = Metering.Kelvin(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void testKelvin2() {
		double in = 25.5;
		double out = 298.65;

		double res = Metering.Kelvin(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void testKelvin3() {
		double in = 0;
		double out = 273.15;

		double res = Metering.Kelvin(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void testKelvin4() {
		double in = -10.5;
		double out = 262.65;

		double res = Metering.Kelvin(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Rankin1() {
		double in = 25;
		double out = 536.67;

		double res = Metering.Rankin(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Rankin2() {
		double in = 25.5;
		double out = 537.57;

		double res = Metering.Rankin(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Rankin3() {
		double in = 0;
		double out = 491.67;

		double res = Metering.Rankin(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Rankin4() {
		double in = -10.5;
		double out = 472.77;

		double res = Metering.Rankin(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Demel1() {
		double in = 25;
		double out = 112.5;

		double res = Metering.Demel(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Demel2() {
		double in = 25.5;
		double out = 111.75;

		double res = Metering.Demel(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Demel3() {
		double in = 0;
		double out = 150.0;

		double res = Metering.Demel(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Demel4() {
		double in = -10.5;
		double out = 165.75;

		double res = Metering.Demel(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Reomur1() {
		double in = 25;
		double out = 20.0;

		double res = Metering.Reomur(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Reomur2() {
		double in = 25.5;
		double out = 20.4;

		double res = Metering.Reomur(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Reomur3() {
		double in = 0;
		double out = 0;

		double res = Metering.Reomur(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Reomur4() {
		double in = -10.5;
		double out = -8.4;

		double res = Metering.Reomur(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Newton1() {
		double in = 25;
		double out = 8.25;

		double res = Metering.Newton(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Newton2() {
		double in = 25.5;
		double out = 8.41;

		double res = Metering.Newton(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Newton3() {
		double in = 0;
		double out = 0;

		double res = Metering.Newton(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Newton4() {
		double in = -10.5;
		double out = -3.46;

		double res = Metering.Newton(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Remeru1() {
		double in = 25;
		double out = 20.625;

		double res = Metering.Remeru(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Remeru2() {
		double in = 25.5;
		double out = 20.88;

		double res = Metering.Remeru(in);
		assertEquals(out, res, 0.1);

	}

	@Test
	public void Remeru3() {
		double in = 0;
		double out = 7.5;

		double res = Metering.Remeru(in);
		assertEquals(out, res, 0.01);

	}

	@Test
	public void Remeru4() {
		double in = -10.5;
		double out = 1.98;

		double res = Metering.Remeru(in);
		assertEquals(out, res, 0.1);

	}

}
