/*4.Write a program to that allows the user to enter 'n' numbers and finds the number
of negative numbers entered and the number of positive numbers entered.*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers you want : ");
        int num_of_numbers = scanner.nextInt();
        int positive = 0;
        int negative = 0;

        int input;
        for(int i=num_of_numbers;i>0;i=i-1) {
            System.out.print("Enter a number :");
            input = scanner.nextInt();
            if (input > 0){
                positive = positive + 1;
            } else if (input < 0) {
                negative = negative + 1;
            }
        }
        System.out.println("Positive numbers entered = " + positive);
        System.out.println("Negative numbers entered  = " + negative);
    }
}