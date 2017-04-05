package Java_HW;

import java.util.Scanner;

public class Java_HW1BaseTasks {


	static int MaxFunc(int num1, int num2, int num3) {

		// ��������� ��������� (����(�*�*�, �+�+�))+3

		int max1 = (num1 * num2 * num3);
		int max2 = (num1 + num2 + num3);
		int res = 0;
		res = max1 > max2 ? max1 + 3 : max2 + 3;
		res = max1 == max2 ? 0 : res;
		return res;

	}

	static int Notodd(int a, int b) {

		// ���� � � ������ ��������� �*�, ����� �+�
		int res = 0;
		res = (a % 2) == 0 ? a * b : a + b;

		return res;

	}

	static int Sum3x(int num1, int num2, int num3) {

		// ����� ����� ������ ������������� �� ���� �����
		int res = 0;
		res = num1 > 0 ? num1 : 0;
		res = num2 > 0 ? res + num2 : res;
		res = num3 > 0 ? res + num3 : res;
		return res;

	}

	static String Marks(int point) {
		// �������� ��������� �����������
		// ������ �������� �� ��� ��������, �� ������ ��������� ������
		if(point<0 || point >100)
		{
			throw new IllegalArgumentException();
		}
		String str = "";

		str = (point >= 0 && point <= 19) ? "F" : str;
		str = (point >= 20 && point <= 39) ? "E" : str;
		str = (point >= 40 && point <= 59) ? "D" : str;
		str = (point >= 60 && point <= 74) ? "C" : str;
		str = (point >= 75 && point <= 89) ? "B" : str;
		str = (point >= 90 && point <= 100) ? "A" : str;

		return str;

	}

	static int Coord(int x, int y) {
		// ���������� ����� �������� ����������� ����� � ������������ (�,�)
		if(x==0 || y==0)
		{
			throw new IllegalArgumentException();
		}
	

		return (x>0 ? (y>0 ? 1:4) : (y>0 ? 2:3));
	}

}
