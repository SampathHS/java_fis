/*2.Given the basic salary as input, write a program to calculate the bonus and display it.

The bonus will be calculated based on the below category.
Basic>20000 bonus=17%of basic+1500
Basic>15000 bonus=15%of basic+1200
Basic>10000 bonus=12%of basic+1000
for rest =8%of basic+500*/


import java.util.Scanner;
class demo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount :");
        int basic = scanner.nextInt();
        double bonus = 0;

        if (basic > 20000) {
            bonus = (0.17 * basic) + 1500;
            System.out.println("Bonus is : " + bonus);
        }
        else if (basic>15000 && basic<=20000) {
            bonus = (0.15 * basic) + 1200;
            System.out.println("Bonus is : " + bonus);
        }
        else if (basic>10000 && basic<=15000) {
            bonus = (0.12 * basic) + 1000;
            System.out.println("Bonus is : " + bonus);
        }
        else {
            bonus = (0.08 * basic) + 500;
            System.out.println("Bonus is : " + bonus);
        }
    }
}