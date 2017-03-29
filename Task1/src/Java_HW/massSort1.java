package Java_HW;

import java.util.Arrays;
import java.util.Random;

public class massSort1 {

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

	public static class ShellSort {

		public static void sort(int[] array) {
			int inner, outer;
			int temp;

			int h = 1;
			while (h <= array.length / 3) {
				h = h * 3 + 1;
			}
			while (h > 0) {
				for (outer = h; outer < array.length; outer++) {
					temp = array[outer];
					inner = outer;

					while (inner > h - 1 && array[inner - h] >= temp) {
						array[inner] = array[inner - h];
						inner -= h;
					}
					array[inner] = temp;
				}
				h = (h - 1) / 3;
			}
		}
	}

	public static void main(String[] args) {

		Random rnd = new Random();
		int mass[] = new int[5];

		for (int i = 0; i < mass.length; i++) {
			mass[i] = rnd.nextInt(45) - 3;
			System.out.print(mass[i] + " ");

		}
		System.out.println();

		// MergeSort mg=new MergeSort();
		//
		// Integer[] a = {2, 6, 3, 5, 1,68,32,41,18,478,389,0,-67,-34,-1,-45};
		// MergeSort.mergeSort(a);
		// System.out.println(Arrays.toString(a));
		// MyQuickSort sorter = new MyQuickSort();
		// int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		//
		// sorter.sort(input);
		// for(int i:input){
		// System.out.print(i);
		// System.out.print(" ");
		// }
		// int[] arr2 = Insert(mass);
		// for(int i:mass){
		// System.out.print(i);
		// System.out.print(", ");
		// }

		//Bubble(mass);
		System.out.println(Insert(mass));
		// Select(mass);

	}

}
