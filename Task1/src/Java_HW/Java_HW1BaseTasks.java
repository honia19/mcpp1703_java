package Java_HW;

import java.util.Scanner;

public class Java_HW1BaseTasks {

	public static void main(String[] args) {

		// System.out.println(Marks(101));
		 //System.out.println("Четверть:"+Coord(1,0));
		// System.out.println(Sum3x(-101,-100,-88));
		// System.out.println(MaxFunc(101,100,-100));
		// System.out.println(Notodd(101,100));

	}

	static int MaxFunc(int num1, int num2, int num3) {

		// Посчитать выражение (макс(а*б*с, а+б+с))+3

		int max1 = (num1 * num2 * num3);
		int max2 = (num1 + num2 + num3);
		int res = 0;
		res = max1 > max2 ? max1 + 3 : max2 + 3;
		res = max1 == max2 ? 0 : res;
		return res;

	}

	static int Notodd(int a, int b) {

		// Если а – четное посчитать а*б, иначе а+б
		int res = 0;
		res = (a % 2) == 0 ? a * b : a + b;

		return res;

	}

	static int Sum3x(int num1, int num2, int num3) {

		// Найти суммы только положительных из трех чисел
		int res = 0;
		res = num1 > 0 ? num1 : 0;
		res = num2 > 0 ? res + num2 : res;
		res = num3 > 0 ? res + num3 : res;
		return res;

	}

	static String Marks(int point) {
		// Написать программу определения
		// оценки студента по его рейтингу, на основе следующих правил
		String str = " ";

		str = (point >= 0 && point <= 19) ? "F" : str;
		str = (point >= 20 && point <= 39) ? "E" : str;
		str = (point >= 40 && point <= 59) ? "D" : str;
		str = (point >= 60 && point <= 74) ? "C" : str;
		str = (point >= 75 && point <= 89) ? "B" : str;
		str = (point >= 90 && point <= 100) ? "A" : str;

		return str;

	}

	static int Coord(int x, int y) {
		// Определить какой четверти принадлежит точка с координатами (х,у)
		int coord = 0;
		if (x > 0 && y > 0) {
			coord = 1;
		} else if (x < 0 && y > 0) {
			coord = 2;
		} else if (x < 0 && y < 0) {
			coord = 3;
		} else if (x > 0 && y < 0) {
			coord = 4;
		} else {
			throw new IllegalArgumentException();
		}

		return coord;
	}

}
