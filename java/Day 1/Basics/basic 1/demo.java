/*Karen got salary for this month and she spends 20% of her salary for food and 
30% of her salary for travel. If she takes care of other shifts she will get 
2% of the salary per day. Given her salary and the number of shifts she handled.
Calculate how much she can save in her pocket after spending all these?
Get salary and number of shifts as input and find the saving.*/


import java.util.*;
public class demo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary:");
		int Salary=sc.nextInt();
		System.out.println("Enter no of extra shift:");
		int shift=sc.nextInt();
		double food=(double)(0.2*Salary);
		double travel=(double) (0.3*Salary);
		double extra=(double) (0.02*Salary*shift);
		double saving=(double) (Salary-food-travel+extra);
		sc.close();
		System.out.println("Karen's saving is : "+saving);
	}

}
