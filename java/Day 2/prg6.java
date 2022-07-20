/*
Create an interface IVehicle with the below methods:
drive();
turnLeft();
brake();
Create another interface IPublicTransport with a method 
getNumberOfPeople();

Create a class MotorisedVehicle.java with a method checkMotor() 
which prints the message “The motor of the vehicle is in good condition”

Create a class Car.java which extends the MotorisedVehicle class 
and implements the IVehicle interface. 
This method should print appropriate messages in the implemented methods. 
(Ex. “The car is in brake mode” etc)

Create a class Train.java which implements both the IVehicle 
and IPublicTransport interfaces. 
The implemented methods should print appropriate messages 
(Ex. “The train is turning left” etc)

Create a new Interface IAdvancedVehicle that extends the IVehicle interface 
and add accelerate() method in the new interface.

Test all these methods in a main class.
*/

import java.util.*;
public class prg6 
{
	public static void main(String[] args) 
	{
		MotorisedVehicle mo= new MotorisedVehicle();
		mo.checkMotor();
		Car mo1=new Car();
		mo1.drive();
		mo1.turnLeft();
		mo1.brake();
		Train t=new Train();
		t.drive();
		t.turnLeft();
		t.brake();
	}

}


interface IVehicle
{
	void drive();
	void turnLeft();
	void brake();
}

interface IPublicTransport
{
	void getNumberOfPeople();
}

class MotorisedVehicle
{
	public void checkMotor()
	{
		System.out.println("The motor of the vehicle is in good condition");
	}
}

class Car extends MotorisedVehicle implements IVehicle
{
	public void drive() 
	{
		System.out.println("The car is in driving mode");
	}

	public void turnLeft() 
	{
		System.out.println("The car is turning left");
	}

	public void brake() 
	{
		System.out.println("The car is in brake mode");
	}
	
}

class Train implements IVehicle, IPublicTransport
{

	public void getNumberOfPeople() 
	{
		System.out.println("there are 500 passengers travelling");
	}

	public void drive() 
	{
		System.out.println("The train is in motion");
	}

	public void turnLeft() 
	{
		System.out.println("The train is turning left");
	}

	public void brake() 
	{
		System.out.println("The train is in brake state");
	}	
}

interface IAdvancedVehicle extends IVehicle
{
	void accelerate();
}
