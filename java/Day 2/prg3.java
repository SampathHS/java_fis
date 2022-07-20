/*
 Create a class Shape and inherit three classes Square,Triangle and Rectangle. Implement the
 method double calculateArea() in Shape class and override  the method in the subclasses. 
 Use runtime polymorphism to call the calculateArea() method.
 */


import java.util.*;
public class prg3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Area Calculator : ");
		System.out.println("\t1.Square\n\t2.Triangle\n\t3.Rectangle");
		int n=sc.nextInt();
		switch(n)
		{
		      case 1:
		    	  
		    	  Square sq=new Square();
		    	  System.out.print("Area of square : "+(sq.calculateArea()));
		    	  break;
		    	  
		      case 2:
		    	  
		    	  Triangle tr=new Triangle();
		    	  System.out.print("Area of triangle : "+(tr.calculateArea()));
		    	  break;
		    	  
		      case 3:
		    	  
		    	  Rectangle rt=new Rectangle();
		    	  System.out.print("Area of rectangle : "+(rt.calculateArea()));
		    	  break;
		    	  
		    	  
		}
		sc.close();
	}

}

abstract class Shape
{
	int x;
	int y;
	
	abstract double calculateArea();
}

class Square extends Shape
{
	public double calculateArea()
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter side value : ");
  	  int x = sc.nextInt();
  	  sc.close();
	  return(x*x);
	 
	}
}

class Triangle extends Shape
{
	public double calculateArea()
	{
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter base value : ");
	  	  int x = sc.nextInt();
	  	 System.out.print("Enter height value : ");
	  	  int y = sc.nextInt();
	  	  sc.close();
		  return (0.5*x*y);
	}
}

class Rectangle extends Shape
{
	public double calculateArea()
	{
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter length value : ");
	  	  int x = sc.nextInt();
	  	 System.out.print("Enter breadth value : ");
	  	  int y = sc.nextInt();
	  	  sc.close();
		return (x*y);
	}
}