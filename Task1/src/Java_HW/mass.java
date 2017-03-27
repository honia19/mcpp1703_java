package Java_HW;

import java.util.Random;

public class mass {
	public static int[] ChengeHalfArr(int arr[]) {

		int[] res = {};
		if (arr != null)
		{
			res = new int[arr.length];
			int midle;
			if (arr.length % 2 == 0)
			{
				midle = arr.length / 2;
			} else
			{
				midle = arr.length / 2 + 1;
				res[midle - 1] = arr[midle - 1];
			}
			for (int i = 0, j = midle; j < arr.length; i++, j++)
			{

				res[j] = arr[i];
				res[i] = arr[j];
			}
		}
		return res;

	}

	public static int[] Reverse(int arr[]) {
		// Сделать реверс массива (массив в обратном направлении)
		if (arr == null || arr.length == 0) {
			return new int[0];
		}
		int[] resArr = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			resArr[j] = arr[i];
			j++;
		}
		return resArr;
	}

	public static int CountUneven(int arr[]) {
		// Посчитать количество нечетных элементов массива
		int countUnevent = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {
				countUnevent++;

			}

		}

		return countUnevent;
	}

	public static int SumElemUneven(int arr[]) {
		// Посчитать сумму элементов массива с нечетными индексами
		int index = arr[0];
		int sumuneven = 0;
		for (int i = 0; i < arr.length; i++) {

			index = i;
			if (index % 2 != 0) {

				sumuneven += arr[index];
			}

		}

		return sumuneven;
	}

	static public int iMaxArray(int arr[]) {
		int imax = 0;
		int max = arr[imax];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				imax = i;
			}
		}
		return imax;
	}

	static public int iMinArray(int arr[]) {
		int imin = 0;
		int min = arr[imin];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				imin = i;
			}
		}
		return imin;
	}

	static public int MaxArray(int arr[]) {

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

	static public int MinArray(int arr[]) {

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		return min;
	}

	public static void main(String[] args) {

		Random rnd = new Random();

		int mass[] = new int[6];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = rnd.nextInt(60) - 2;
			System.out.print((mass[i] + " "));

		}
		
		System.out.println();
//System.out.println(iMaxArray(mass));
		// ChengeHalfArr(mass);

	}

}
