/*3.Write a program to find if the student is eligible for first, second or third grade universities by finding the average of their marks. Read marks in five subjects as input,calculate average and based on the average calculate grade.
 
Grade should be calculated as given below :
Average >80 First Grade University
Average >60 Second Grade University
Otherwise Third Grade University*/

import java.util.Scanner;
class demo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        for (int i = 0; i <5 ; i++) {
            System.out.print("Enter Marks :");
            int marks = scanner.nextInt();
            sum = sum + marks;
        }
        double average;

        average = sum/5;

        if (average >80) {
            System.out.println("First Grade University");
        } else if (average>60) {
            System.out.println("Second Grade University");
        }else {
            System.out.println("Third Grade University");
        }
    }
}

