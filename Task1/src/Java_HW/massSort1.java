package Java_HW;


import java.util.Random;

public class massSort1 {
	static int[] QuickSort(int[] arr, int start, int end) {
		 if(arr==null || arr.length==0 || start<0)
		 {
			 throw new IllegalArgumentException();
		 }
		if (start >= end) {
			return arr;
		}
		int i = start;
		int j = end;
		int mid = i - (i - j) / 2;
		while (i < j) {
			while ((i < mid && arr[i] <= arr[mid])) {
				i++;
			}
			while ((j > mid && arr[j] >= arr[mid])) {
				j--;
			}
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				if (i == mid) {
					mid = j;
				} else if (j == mid) {
					mid = i;

				}

			}

		}
		QuickSort(arr, start, mid);
		QuickSort(arr, mid + 1, end);
		return arr;
	}
	 static int[] shell(int[] arr) {
		 if(arr==null || arr.length==0)
		 {
			 throw new IllegalArgumentException();
		 }
		int d = arr.length / 2;
		while (d > 0) {

			for (int i = 0; i < arr.length - d; i++) {
				int j = i;
				while (j >= 0 && arr[j] > arr[j + d]) {
					int temp = arr[j];
					arr[j] = arr[j + d];
					arr[j + d] = temp;
					j--;
				}
			}
			
			d=d/2;
		}
		return arr;

	}

	static int[] Select(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			int minValueIndex = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minValueIndex]) {
					minValueIndex = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[minValueIndex];
			arr[minValueIndex] = temp;

		}
		return arr;
	}

	static int[] Insert(int[] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}

		}
		return arr;

	}

	static int[] Bubble(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = arr.length - 1; j > i; j--) {
				
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;

				}
			}
			
		}
		return arr;

	}



	public static void main(String[] args) {

		Random rnd = new Random();
		int mass[] = new int[6];

		for (int i = 0; i < mass.length; i++) {
			mass[i] = rnd.nextInt(45) - 3;
			System.out.print(mass[i] + " ");

		}
		System.out.println();

	//shell(mass);
	mass=QuickSort(mass, 0, mass.length-1);
	for(int i=0;i<mass.length;i++)
	{
		System.out.print(mass[i]+" ");
	}

		//Bubble(mass);
		//System.out.println(Insert(mass));
		// Select(mass);

	}

}
