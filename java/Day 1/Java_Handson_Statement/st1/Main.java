/*In a car racing video game, the car is an object. You can drive the car, turn the car, or 
stop the car when needed but you need to drive long. You will get money according to the Km you have travelled. 
For example if you have travelled 123 km then the product of the km (ie 1*2*3 = 6) would be the amount you win. 
Write a program to find the product of the digits in the given input number.Include a method named productDigits 
that accepts an integer argument and returns an integer that corresponds to the product of digits in the integer*/




import java.util.Scanner;
public class Main
{
	public static void main (String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            
            int n = num; // copy of the original number
            
            //Logic
            int product = 1;
            
            while(n>0){
                int digit = n%10;
                
                product *= digit;
                
                n/=10;
            }
            
            System.out.println("Product of digits of the number "+num+" is "+product+" .");
    }
}