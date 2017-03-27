package Java_HW;

public class Xz 
{

	public static void main(String[] args) 
	{
		//System.out.println(calc(100,0,"/"));
		/*int a=11;
		int b=20;
		int c=function(a,b);
		System.out.println(c);*/

	}
	public static int Array(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i]) 
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static int calc(int a, int b, String op)
	{
		int calculator = 0;
		switch(op)
		{
		case "+": calculator=(a+b);break;
		case "-": calculator=(a-b);break;
		case "*": calculator=(a*b);break;
		case "/": calculator=(a/b);break;
		}
		
		 
		
		
		return calculator;
	}

	public static int function(int a, int b) {
		// TODO Auto-generated method stub
		int res=0;
		
		if(a%2==0)
		{
			res=a*b;
		}
		else 
		{
			res=a+b;
		}
		
		return res;
	}

}
