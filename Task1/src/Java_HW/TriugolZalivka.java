package Java_HW;

public class TriugolZalivka {
	static void Tr1(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if(j<=i)
				{
				
					System.out.print("*");
				}
	
			}
			System.out.println();
		}
	}
	static void Tr2(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <=n ; j++)
			{
				if(j >= n + 1 - i)
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
	static void Tr3(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <=n ; j++)
			{
				if(j >=i && j<=n+1-i)
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
	static void Tr4(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <=n ; j++)
			{
				if(j <=i && j>=n+1-i)
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
	static void Tr5(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <=n ; j++)
			{
				 if(j >=i && j<=n+1-i || j <=i && j>=n+1-i)
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
	static void Tr6(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <=n ; j++)
			{
				 if(j >=i && j<=n+1-i || j <=i && j>=n+1-i)
				{
					System.out.print("  ");
					
				}
				else 
				{
					System.out.print("* ");
				}
	
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
//		Tr1(7);
//		Tr2(7);
//		Tr3(7);
//		Tr4(7);
		Tr5(7);
		//Tr6(7);
	}

}
