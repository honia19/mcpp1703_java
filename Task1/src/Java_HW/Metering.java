package Java_HW;

public class Metering {

	static double Miles(double num) {
		if (num <= 0) 
		{
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = 0.00062 * num;
		return res;
	}

	static double Yard(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = 1.09 * num;
		return res;
	}

	static double Phut(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = 3.28 * num;
		return res;
	}

	static double Sagen(double num) {
		if (num <= 0) 
		{
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1 / 2.13) * num;
		return res;
	}

	static double CosoySagen(double num) {
		if (num <= 0) 
		{
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1 / 3.02) * num;
		return res;
	}

	static double Posoch(double num) {
		if (num <= 0) 
		{
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1 / 1.6) * num;
		return res;
	}

	static double Arshin(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1 / 0.71) * num;
		return res;
	}

	static double Stoune(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1 / 6.35) * num;
		return res;
	}

	static double Funt(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (2.20) * num;
		return res;
	}

	static double Uncia(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (35.2) * num;
		return res;
	}

	static double Pud(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1 / 16.38) * num;
		return res;
	}

	static double Berckovec(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1 / 163.8) * num;
		return res;
	}

	static double Butman(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1 / 4.095) * num;
		return res;
	}

	static double Tonna(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1 / 1000) * num;
		return res;
	}

	static double Kvarta(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = 0.87 * num;
		return res;
	}

	static double Pinta(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1.75) * num;
		return res;
	}

	static double Galon(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1 / 3.8) * num;
		return res;
	}

	static double Barrel(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1 / 159.0) * num;
		return res;
	}

	static double Anker(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res;
		res = (1 / 36.0) * num;
		return res;
	}

	static double Vedro(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (0.08) * num;
		return res;
	}

	static double Shopen(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1 / 0.5) * num;
		return res;
	}

	static double Secunda(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = num * 60;
		return res;
	}

	static double Hour(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1 / 60.0) * num;
		return res;
	}

	static double Days(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (0.00069) * num;
		return res;
	}

	static double AcademHour(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1 / 45.0) * num;
		return res;
	}

	static double AstroHour(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1 / 60.0) * num;
		return res;
	}

	static double ParaUniverse(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = (1 / 85.0) * num;
		return res;
	}

	static double Milisec(double num) 
	{
		if (num <= 0) {
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = num * 60000;
		return res;
	}

	static double Farengate(double num) 
	{
		double res = 0;
		if (num == 0)
			res = 32;
		else {
			res = (num * 1.8) + 32;
		}

		return res;
	}

	static double Kelvin(double num) 
	{
		double res = 0;
		if (num == 0)
			res = 273.15;
		else {
			res = num + 273.15;
		}

		return res;
	}

	static double Rankin(double num) 
	{
		double res = 0;
		if (num == 0)
			res = 491.67;
		else {
			res = (num * 1.8) + 491.67;
		}

		return res;
	}

	static double Demel(double num) 
	{
		double res = 0;
		if (num == 0)
			res = 150;
		else {
			res = (-1.5 * num) + 150;
		}

		return res;
	}

	static double Reomur(double num) 
	{
		double res = 0;
		if (num == 0) {
			return res;
		} else {
			res = num * 0.8;
		}

		return res;
	}

	static double Newton(double num) 
	{
		double res = 0;
		if (num == 0) {
			return res;
		} else {
			res = num * 0.33;
		}

		return res;
	}

	static double Remeru(double num) 
	{
		double res=0;
		if (num == 0) {

			res = 7.5;
		} else {
			res = (num * 0.525) + 7.5;
		}

		return res;
	}

}
