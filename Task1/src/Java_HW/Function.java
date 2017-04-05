package Java_HW;

public class Function {
	static String[] arrayOfOne = { "ноль", "один", "два", "три", "четыри", "пять", "шесть", "семь", "восемь",
			"девять" };
	static String[] arrayOfDec = { "десять", "одинадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
			"шестнадцать", "семнадцать", "восемнадцать", "девятнадцать" };
	static String[] arrayOfHundred = { "", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот",
			"восемьсот", "девятьсот" };
	static String[] arrayOfDecplus = { "", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят",
			"семьдесят", "восемьдесят", "девяносто" };
	
	static String getString(int num)
	{
		String ret="";
		int sot=num/100;
		int dec=num%100/10;
		int odi=num%10;
		ret=arrayOfHundred[sot];
		if(dec==1)
		{
			ret+=arrayOfDec[odi];
		}
		else
		{
			ret+="" + arrayOfDecplus[dec];
			ret+="" + arrayOfOne[odi];
		}
		return ret.trim();
	}
	
	




	static double DecartCoord(int x1, int y1, int x2, int y2) {
	

		double rez = 0;
		rez = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		return rez;
	}

	static String numDay(int num) {
		
		if(num<=0 || num>=8)
		{
			throw new IllegalArgumentException();
		}
		
		String[] str = {"","Понедельник","Вторник","Среда","Четверг","Пятница","Суббота","Воскресенье"};


		
		return str[num];
	}

	public static void main(String[] args) {

		//System.out.println(getString(17));

		// numDay(7);
		// System.out.println("Расстояние между точками =
		// "+DecartCoord(0,4,0,2)+"cм");

	}

}
