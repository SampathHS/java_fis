/*2.Write a program to find the sum of the odd digits in a number.*/

import java.util.Scanner;
public class Main
{
	public static int findOddDigitSum(int number) {

     int lastDigit = 0;
     int oddDigitSum = 0;

     while(number!=0) {

         lastDigit = number%10;

         if(lastDigit % 2 != 0) {
            // add it to sum
            oddDigitSum += lastDigit;
         }

         number = number / 10;
      }
      return oddDigitSum;
  }

  public static void main(String[] args) {

      int number = 0;
      int sumOfOddDigits = 0;

      Scanner scan =  new Scanner(System.in);

      System.out.print("Enter an integer number:");
      number = scan.nextInt();

      sumOfOddDigits = findOddDigitSum(number);

      System.out.println("The sum of odd digits of"+" the number "+number+" = "+ sumOfOddDigits);

      scan.close();
  }
}
