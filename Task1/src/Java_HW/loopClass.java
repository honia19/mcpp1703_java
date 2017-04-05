package Java_HW;

public class loopClass {



	static int Mirror(int num) {
		// ������� �����, ������� �������� ���������� ������������
		// ������������������
		// ���� ��������� �����, ��������, ������ ����� 123, ������� 321.
		int temp = 0;
		Math.abs(num);
		while (num != 0) {
			temp = temp * 10 + num % 10;
			num /= 10;
		}
		
		return Math.abs(temp);

	}

	static int SumofValue(int num) {
		// ��������� ����� ���� ��������� �����
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
	
		return Math.abs(sum);
	}

	static int Factorial(int num) {

		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}

	static int Sqrt1(int num1) {
		// ����� ������ ������������ ����� � ��������� �� ������ (�����������
		// �������
		// ����������������� ������� � ����� ��������� ������)

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
		// ����� ������ ������������ ����� � ���������
		// �� ������ (����������� ������� ����������������� ������� � �����
		// ��������� ������)

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
		// ��������� ������� �� �����?
		// (����� ���������� �������, ���� ��� ������� ������ ���� �� ���� � ��
		boolean test = true;
		if (num < 2)
		{
			return false;
		}
		for (int i = 2; i * i <= num; i++)
		{
			if (num % i == 0)
			{
				test = false;
			}
		}
		return test;
	}

	static int SumDiapazon() {

		return 2450;

	}

	static int SumDiapazon2() {

		
		return 49;

	}
}
