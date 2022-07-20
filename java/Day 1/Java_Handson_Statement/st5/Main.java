/*5.Write a  program to print the multiplication table of an integer n upto m rows using a for loop.*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = scanner.nextInt();
        System.out.println("Enter number :");
        int m = scanner.nextInt();

        for(int i=1;i<=m;i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}
