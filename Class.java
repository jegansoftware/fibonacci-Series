package analyze;

import java.util.Scanner;

public class FinocciSerious {
	
	private int n1=1;
	private int n2=1;
	private int count;
	public int getn1()
	{
		return n1;
	}
	
	
	public int getn2()
	{
		return n2;
	}
	
	
	public int getcount()
	{
		return count;
	}
	
	public void read()
	{
		System.out.printf("\nEnter Number");
		Scanner fib=new Scanner(System.in);
		count=fib.nextInt();
		int i;
		int c3;
		System.out.printf(" %d ",n1);
		System.out.printf(" %d ",n2);
		for(i=1;i<=count;i++)
		{
			c3=n1+n2;
			System.out.printf(" %d ",c3);
			
			n1=n2;
			n2=c3;
			
		}
	}
}
