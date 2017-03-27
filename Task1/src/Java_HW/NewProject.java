package Java_HW;

public class NewProject {

	static void Diagonal() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (j == i || j == 7 - i + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}

	}
	static void mass321()
	{
		
		for(int i=3;i>=1;i--)
		{
			for(int j=3;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static void mass123()
	{
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static void mass111()
	{
		int arr[]={1,2,3};
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	static void mass333()
	{
		int[] arr = { 1, 2, 3 };
		for (int i = arr.length-1; i >= 0; i--)
		{
			for (int j = 1; j <= 3; j++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	static void Kvadrat()
	{
		for (int i = 1; i <= 7; i++)
		{
			for (int j = 1; j <= 7; j++)
			{
				if (i == 1 || i == 7 || j == 1||j==7)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");

				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
//mass333();
//mass111();
//mass123();
//mass321();
		//Diagonal();
		//Kvadrat();


	}

}
