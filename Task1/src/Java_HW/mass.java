package Java_HW;

import java.util.Random;

public class mass {
	public static void main(String[] args) {
		int [] a={4,5,6};

		Reverse(a);

		// numDay(7);
		// System.out.println("Расстояние между точками =
		// "+DecartCoord(0,4,0,2)+"cм");

	}
	public static void ChengeHalfArr(int arr[]) {
		
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		
	int d=(arr.length%2==0) ? 0 : 1;
	for(int i=0;i<arr.length/2;i++)
	{
		int temp=arr[i];
		arr[i]=arr[arr.length/2+d+i];
		arr[arr.length/2+d+i]=temp;
	}
		
	

	}

	public static void Reverse(int arr[]) 
	{
		// Сделать реверс массива (массив в обратном направлении)
	
			if (arr==null || arr.length==0)
			{
				throw new IllegalArgumentException();
			}

		for (int i = 0; i<arr.length/2; i++) 
		{
			int temp=arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		
			
		}
		
	}

	public static int CountUneven(int arr[]) {
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		
		int countUnevent = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {
				countUnevent++;

			}

		}

		return countUnevent;
	}

	public static int SumElemUneven(int arr[]) {
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
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
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
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
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
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
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if ( arr[i]>max)
				max = arr[i];
		}
		return max;
	}

	static public int MinArray(int arr[]) {
		
		
		if(arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]<min)
				min = arr[i];
		}
		return min;
	}



}
