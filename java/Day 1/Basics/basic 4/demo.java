
/*Student Fees is calculated according to the student's 10th marks. 
The student will get discount in fees as follows :
Marks discount(%)
>90         -  50%
81-90      - 25%
70-80      - 10%
<70         -  0%
Calculate the fees according to above table.
assuming default fee per year as 1,00,000(one lakh)*/



import java.util.*;
public class demo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter class 10 overall percentage : ");
		int markpercent=sc.nextInt();
		int default_fee=100000;
		int fee_to_pay;
		if(markpercent>90)
		{
			fee_to_pay=(int) (default_fee-(default_fee*0.5));
		}
		else if((markpercent>80)&&(markpercent<=90))
		{
			fee_to_pay= (int) (default_fee-(default_fee*0.25));
		}
		else if((markpercent>70)&&(markpercent<=80))
		{
			fee_to_pay=(int) ( default_fee-(default_fee*0.1));
		}
		else
		{
			fee_to_pay= default_fee-(default_fee*0);
		}
		sc.close();
		System.out.println("Fee to be payed : "+fee_to_pay);
	}

}