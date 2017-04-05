package Java_HW;

public class Function {
	static String[] arrayOfOne = { "����", "����", "���", "���", "������", "����", "�����", "����", "������",
			"������" };
	static String[] arrayOfDec = { "������", "����������", "����������", "����������", "������������", "����������",
			"�����������", "����������", "������������", "������������" };
	static String[] arrayOfHundred = { "", "���", "������", "������", "���������", "�������", "��������", "�������",
			"���������", "���������" };
	static String[] arrayOfDecplus = { "", "������", "��������", "��������", "�����", "���������", "����������",
			"���������", "�����������", "���������" };
	
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
		
		String[] str = {"","�����������","�������","�����","�������","�������","�������","�����������"};


		
		return str[num];
	}

	public static void main(String[] args) {

		//System.out.println(getString(17));

		// numDay(7);
		// System.out.println("���������� ����� ������� =
		// "+DecartCoord(0,4,0,2)+"c�");

	}

}
