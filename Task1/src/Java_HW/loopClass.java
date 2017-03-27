package Java_HW;

public class loopClass {

	public static void main(String[] args) {

		// System.out.println("Mirror: " + Mirror(123));
		// System.out.println("Сумма цифр в числе = " + SumofValue(12345));
		// System.out.println(Factorial(5));
		// SumDiapazon();
		// System.out.println(isOdd(0));
		// int [] array={12,22,33,41,58,69,72,87,99,100};
		// System.out.println(Sqrt2(3));

	}

	static int Mirror(int num) {
		// Вывести число, которое является зеркальным отображением
		// последовательности
		// цифр заданного числа, например, задано число 123, вывести 321.
		int temp = 0;
		while (num != 0) {
			temp = temp * 10 + num % 10;
			num /= 10;
		}
		temp = Math.abs(temp);
		return temp;

	}

	static int SumofValue(int num) {
		// Посчитать сумму цифр заданного числа
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		sum = Math.abs(sum);
		return sum;
	}

	static int Factorial(int num) {

		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}

	static int Sqrt1(int num1) {
		// Найти корень натурального числа с точностью до целого (рассмотреть
		// вариант
		// последовательного подбора и метод бинарного поиска)

		int res = 0;
		for (int i = 1; i * i <= num1; i++) {
			int sq = i * i;
			if (sq <= num1) {
				res = i;
			}
		}
		return res;

	}

	static int Sqrt2(int num) {
		// Найти корень натурального числа с точностью
		// до целого (рассмотреть вариант последовательного подбора и метод
		// бинарного поиска)

		int res = 0;

		int min = 1;
		int max = num;

		while (min <= max) {
			int mid = (min + max) / 2;
			if (mid * mid <= num) {
				res = mid;
				min = mid + 1;

			}

			else {
				max = mid - 1;
			}

		}
		return res;

	}

	static boolean isOdd(int num) {
		// Проверить простое ли число?
		// (число называется простым, если оно делится только само на себя и на
		// 1)
		boolean notOdd = true;
		if (num < 2) {
			notOdd = false;
		}
		for (int i = 2; i * i <= num; i++) {

			if (num % i == 0) {
				notOdd = false;
			}
		}
		return notOdd;
	}

	static int SumDiapazon() {

		int sum = 0;
		// int count = 0;
		for (int i = 2; i < 99; i++) {
			if (i % 2 == 0) {
				sum += i;
				// count++;
			}

		}
		return sum;

	}

	static int SumDiapazon2() {

		// int sum = 0;
		int count = 0;
		for (int i = 2; i < 99; i++) {
			if (i % 2 == 0) {
				// sum += i;
				count++;
			}

		}
		return count;

	}
}
