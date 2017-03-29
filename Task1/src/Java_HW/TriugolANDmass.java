package Java_HW;

public class TriugolANDmass {
	
	static void Triugol1()
	{
		for (int i=1; i<=7;i++)
		{
		for(int j=1; j<=7;j++)
		{
			if(i==1 || j==1 || i+j==8)
			{
			System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		}
	}
	static void Triugol2()
	{
		for (int i=1; i<=4;i++)
		{
		for(int j=1; j<=7;j++)
		{
			if(i==1 || i==j || i+j==8)
			{
			System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		}
	}
	static void Triugol3()
	{
		for (int i=1; i<=7;i++)
		{
		for(int j=1; j<=7;j++)
		{
			if(i==1 || j==7 || i==j)
			{
			System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		}
	}
		static void Triugol4()
		{
			for (int i=1; i<=7;i++)
			{
			for(int j=1; j<=7;j++)
			{
				if(i==7 || j==7 || i+j==8)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			}
	}
		static void Triugol5()
		{
			for (int i=1; i<=7;i++)
			{
			for(int j=1; j<=7;j++)
			{
				if(j==1 || i==7 || i==j)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			}
	}
		static void Triugol6()
		{
			for (int i=1; i<=7;i++)
			{
			for(int j=1; j<=4;j++)
			{
				if(j==1 || i==j || i+j==8)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			}
	}
		static void Triugol7()
		{
			for (int i = 1; i <= 7; i++)
			{
				for (int j = 1;j <= 4; j++)
				{
					if (j==4 || i+j==5 ||j == i-4+1 )
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
		static void Triugol8()
		{
			{
				for (int i = 1; i <= 4; i++)
				{
					for (int j = 1; j <= 7; j++)
					{
						if (i == 4 || j == i + 4 - 1 || j == 4 - i + 1)
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
		}
		

	static void Diagonal() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (j == i || i+j==8) {
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
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(4-j+" ");
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
//		Triugol1();
//		Triugol2();
//		Triugol3();
//		Triugol4();
//		Triugol5();
//		Triugol6();
		//Triugol7();
		Triugol8();
//mass333();
//mass111();
//mass123();
//mass321();
		//Diagonal();
		//Kvadrat();


	}

}
