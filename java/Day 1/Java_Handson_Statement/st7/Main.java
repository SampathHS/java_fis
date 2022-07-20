
/*
Create a class with a method to find the difference between the sum of the squares 
and the square of the sum of the first n natural numbers.
For Example if n is 10,you have to find 
(1^2+2^2+3^2+….9^2+10^2)- (1+2+3+4+5…+9+10)^2 
 */


import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number n : ");
		n=sc.nextInt();
		Day1_prgrm11 ab=new Day1_prgrm11();
		System.out.println("Answer : "+ab.answer(n));
		sc.close();
	}
	
	public int answer(int n)
	{
		int insqu=0;
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			insqu+=(i*i);
			sum+=i;
		}
		int outsqu=sum*sum;
		return Math.abs(insqu-outsqu);
	}

}