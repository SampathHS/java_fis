
/*
The task is to get the details of the vehicle and display the details using a menu driven application.
Write a Java program to Implement this task.
Create a class Vehicle
Include the following protected data members / attributes:
make – of type String
vehicleNumber – of type String
fuelType – of type String
fuelCapacity - of type Integer
cc – of type Integer
 
Include the following public methods
Create a constructor that initializes all the data members --- 
public Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc)
displayMake – Display the make of the vehicle
"displayBasicInfo" – display basic information of the vehicle.
"displayDetailInfo" – An empty method.
 
Create a class TwoWheeler that extends Vehicle
kickStartAvailable – of type Boolean.
"displayDetailInfo" – displays the availability of kick start.

Create a class FourWheeler that extends Vehicle
audioSystem – of type String.
numberOfDoors – of type Integer.

"displayDetailInfo" - displays the audio system and number of doors.
displayDetailInfo - overridden method
Include getter setters for all the classes.
Create a main class to test the classes defined above.

*/

import java.util.*;
class Vehicle{
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public void displayMake() {
		System.out.println("Make : "+make);
	}
	public void displayBasicInfo() {
		System.out.println("Vehicle Number : "+vehicleNumber);
		System.out.println("FUel Type : "+fuelType);
		System.out.println("fuelCapacity : "+fuelCapacity);
		System.out.println("cc : "+cc);
	}
	public void displayDetailInfo() {
		
	}
}
class TwoWheeler extends Vehicle{
	private boolean kickStartAvailable;
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
			boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}
	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	public void displayDetailInfo() {
		System.out.println("The kick start : "+kickStartAvailable);
	}
}
class FourWheeler extends Vehicle{
	private String audioSystem;
	private int numberOfDoors;
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem,
			int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	public void displayDetailInfo() {
		System.out.println("Audio system : "+audioSystem);
		System.out.println("Number Of Doors : "+numberOfDoors);
	}
}
public class prg2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String ch;
	do {
	System.out.println("Enter the choice:\n\t1.Two Wheeler\n\t2.Four Wheeler");
	int n=sc.nextInt();
	switch(n) {
	case 1:
		String make=sc.next();
		String vehiclenumber=sc.next();
		String fueltype=sc.next();
		int fuelcapacity=sc.nextInt();
		int cc=sc.nextInt();
		boolean kick=sc.nextBoolean();
		TwoWheeler obj=new TwoWheeler(make,vehiclenumber,fueltype,fuelcapacity,cc,kick);
		obj.displayMake();
		obj.displayBasicInfo();
		obj.displayDetailInfo();
		break;
	case 2:
		String make2=sc.next();
		String vehiclenumber2=sc.next();
		String fueltype2=sc.next();
		int fuelcapacity2=sc.nextInt();
		int cc2=sc.nextInt();
		String audio=sc.next();
		int doors=sc.nextInt();
		FourWheeler obj2=new FourWheeler(make2,vehiclenumber2,fueltype2,fuelcapacity2,cc2,audio,doors);
		obj2.displayMake();
		obj2.displayBasicInfo();
		obj2.displayDetailInfo();
		break;
	default:
		break;
	}
	System.out.println("Want to continue yes/no : ");
	ch=sc.next();
}while(ch.equals("yes"));
sc.close();
}
}