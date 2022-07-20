/*3.Write a program to find the average of multiples of 5 upto 'n'. n is given as input.*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    System.out.print("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        int count = 0;

        for(int i=5;i<=n; i=i+5) {
            sum = sum + i;
            count = count + 1;
        }
        System.out.println("SUM="+sum);
        float avg = (float)sum / (float)count;
        System.out.println("AVG="+avg);
    }
}