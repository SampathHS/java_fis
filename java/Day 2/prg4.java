
/*
A Company provides an initial training for all its employees, once they join the company. 
During the training phase they call the employees as “Associate”. 
The initial training is conducted for 60 days for each Associate. 
In these 60 days they learn various technologies. 
The first 20 days they learn “Core skills”, the next 20 days they learn “Advanced modules” 
and the final 20 days they go to the “Project phase”.  
Help the Company to find in which phase the associates are in.
Create a class Associate with associateId(int),associateName(String),workStatus(String).
Include getters and setters and constructors.
Add a method trackAssociateStatus
 - This method takes the number of days as argument and sets the work status
  of the associate based on the number of days. 
  If the number of days is greater than 60 days then set the work status as “Deployed in project”.
  
 In the Main class, create an object for the Associate class; 
 Get the details assign the value for its attributes using the setters. 
 Invoke the trackAssociateStatus method and find the work status and display the details.
 */


import java.util.*;
class Associate{
	private int associateId;
	private String associateName;
	private String workStatus;
	public Associate(int associateId,String associateName,String workStatus) {
		this.associateId=associateId;
		this.associateName=associateName;
		this.workStatus=workStatus;
	}
	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public String getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	public void trackAssociateStatus(int n) {
		if(n>=0 && n<=20)workStatus="Core skills";
		else if(n>=21 && n<=40)workStatus="Advanced modules";
		else if(n>=41 && n<=60)workStatus="Project phase";
		else if(n>60)workStatus="Deployed in project";
	}
	void show() {
		System.out.println("AssociateId:"+associateId);
		System.out.println("AssociateName:"+associateName);
		System.out.println("WorkStatus:"+workStatus);
	}
}
public class prg4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter associate details");
	System.out.println("Enter associate ID");
	System.out.println("Enter associate Name");
	System.out.println("Enter number of days");
	int id=sc.nextInt();
	sc.nextLine();
	String name=sc.nextLine();
	int n=sc.nextInt();
	Associate obj=new Associate(id,name,"?");
	obj.trackAssociateStatus(n);
	obj.show();
	sc.close();
}
}