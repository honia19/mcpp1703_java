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
	
	static int getNumber(String string)
	{
		int count = 0;
		String[] stringsMass = string.split(" ");
		for (int i = stringsMass.length - 1, j = 1; i >= 0; i--, j++)
		{
			int dig = serchDig(stringsMass[i], j);
			if (dig == -1)
			{
				throw new IllegalArgumentException();
			}
			count += dig;
		}
		return count;
	}

	static int serchDig(String string, int position)
	{
		int dig = 0;
		int i = 0;
		do
		{
			if (string.equals(arrayOfOne[i]))
			{
				dig = i;
				return dig;
			}
			i++;
		} while (i < arrayOfOne.length);
		i = 0;
		do
		{
			if (string.equals(arrayOfDecplus[i]))
			{
				dig = i * 10;
				return dig;
			}
			i++;
		} while (i < arrayOfDecplus.length);
		i = 0;
		do
		{
			if (string.equals(arrayOfHundred[i]))
			{
				dig = i * 100;
				return dig;
			}
			i++;
		} while (i < arrayOfDecplus.length);
		i = 0;
		do
		{
			if (string.equals(arrayOfDec[i]))
			{
				dig = i + 10;
				return dig;
			}
			i++;
		} while (i < arrayOfDecplus.length);

		return -1;
	}

	static String getString(int num) {
		if (num == 0) {
			return "����";
		}
		int divider = 10; // ��������
		int remain = 0;
		String string = "";
		int temp = num % 10; // ��� ��������� *������
		for (int i = 1; i <= 3; i++) {

			remain = num % divider;
			num /= 10;
			if (remain != 0) {
				if (i == 1) {
					string = arrayOfOne[remain];
				}
				if (i == 2) {
					if (remain == 1) {
						string = arrayOfDec[temp];
					} else {
						if (temp == 0) {
							string = "";
						}
						string = arrayOfDecplus[remain] + " ".concat(string);
					}
				}
				if (i == 3) {
					string = arrayOfHundred[remain] + " ".concat(string);
				}
			}
			if (string.endsWith(" ")) {
				string = string.substring(0, string.length() - 1);
			}
		}

		return string;

	}

	static double DecartCoord(int x1, int y1, int x2, int y2) {
	

		double rez = 0;
		rez = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		return rez;
	}

	static String numDay(int num) {
		String str = " ";
		if(num<=0 || num>=8)
		{
			throw new IllegalArgumentException();
		}
		switch (num) {
		case 1:
			str = "�����������";
			break;
		case 2:
			str = "�������";
			break;
		case 3:
			str = "�����";
			break;
		case 4:
			str = "�������";
			break;
		case 5:
			str = "�������";
			break;
		case 6:
			str = "�������";
			break;
		case 7:
			str = "�����������";
			break;

		}
		return str;
	}

	public static void main(String[] args) {
		// System.out.println(getString(969));
		//System.out.println(getNumber("��� ����� ���"));

		// numDay(7);
		// System.out.println("���������� ����� ������� =
		// "+DecartCoord(0,4,0,2)+"c�");

	}

}
