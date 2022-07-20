/*
Create a class named Student.Include the following protected member variables.
name,id,age,grade,address
Include appropriate getters and setters
Include a default constructor and a 5-argument constructor. 
The order of arguments in the 5- argument constructor is name, id, age, grade and address.
Include the following public methods in the Student class.
void display()
Display the details of the student.
boolean isPassed()
A student is said to have passed if his/her grade is above 50. 
This method returns true if the student has passed.
Create a subclass of Student named UGStudent .
Include the following private member variables.
degree
stream
Include appropriate getters / setters
Include a default constructor and a 7-argument constructor. 
The order of arguments in the 7-argument constructor is name, id, age, grade, address, degree and stream.
 Include the following public methods in the UGStudent class.
void display()
Display the details of the ug student in the format as specified in the output.
boolean isPassed()
A ug student is said to have passed if his/her grade is above 70. This method returns true if the student has passed.
Create another subclass of Student named PGStudent .
Include the following private member variables.
specialization
noOfPapersPublished
Include appropriate getters / setters
Include a default constructor and a 7-argument constructor. The order of arguments in the 7-argument constructor is name, id, age, grade, address, specialization and number of papers published.
 Include the following public methods in the PGStudent class.
void display()
Display the details of the pg student in the format as specified in the output.
boolean isPassed()
A pg student is said to have passed if his/her grade is above 70 and if he/she has published atleast 2 papers.This method returns true if the student has passed.
Create a class called Main to test the above classes.
*/


import java.util.*;
public class prg1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice : \n\t1.Student\n\t2.UG Student\n\t3.PG Student");
		int n=sc.nextInt();
		Student st=new Student();
		
		System.out.print("Enter your name : ");
		String name=sc.next();
		st.setName(name);
		System.out.print("Enter your id : ");
		int id=sc.nextInt();
		st.setId(id);
		System.out.print("Enter your age : ");
		int age=sc.nextInt();
		st.setAge(age);
		System.out.print("Enter your grade : ");
		int grade=sc.nextInt();
		st.setGrade(grade);
		System.out.print("Enter your address : ");
		String address=sc.next();
		st.setAddress(address);
		
     	switch(n)
	    {
       	   case 1:
       		      System.out.println("");
		          st.display();
		          break;
       	   case 2:
       		   	   UGStudent st1= new UGStudent();
       		   	   st1.setName(name);
       		   	   st1.setId(id);
       		   	   st1.setAge(age);
       			   st1.setGrade(grade);
       			   st1.setAddress(address);
       		   	   System.out.print("Enter your degree : ");
       		   	   String degree=sc.next();
       		   	   st1.setDegree(degree);
       		   	   System.out.print("Enter your stream : ");
       		   	   String stream=sc.next();
       		   	   st1.setStream(stream);
       		   	   System.out.println("");
       		   	   st1.display();
       		   	   break;
       	   case 3:
   		   	   PGStudent st2= new PGStudent();
   		   	   st2.setName(name);
   		   	   st2.setId(id);
   		   	   st2.setAge(age);
   			   st2.setGrade(grade);
   			   st2.setAddress(address);
   		   	   System.out.print("Enter your specialization : ");
   		   	   String specialization=sc.next();
   		   	   st2.setSpecialization(specialization);
   		   	   System.out.print("Enter no of paper published : ");
   		   	   int paper=sc.nextInt();
   		   	   st2.setPaper(paper);
   		   	   System.out.println("");
   		   	   st2.display();
   		   	   break;  
     	}
     	sc.close();
	}
}

class Student
{
	protected String name;
	protected int id;
	protected int age;
	protected int grade; 
	protected String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	Student()
	{
		
	}
	
	public Student(String name, int id, int age, int grade, String address)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.grade=grade;
		this.address=address;
	}
	
	void display()
	{
		Student m=new Student();
		System.out.println("Name     : "+name);
		System.out.println("ID       : "+id);
		System.out.println("Age       : "+age);
		System.out.println("Grade    : "+(m.isPassed(grade)));
		System.out.println("Address  : "+address);
		
	}
	
	boolean isPassed(int grade)
	{
		if(grade>50)
			return true;
		else
			return false;
	}
}


class UGStudent extends Student
{
	private String degree;
	private String stream;
	
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	
	UGStudent()
	{
		
	}
	
	public UGStudent(String name, int id, int age, int grade, String address, String degree, String stream)
	{
		super(name, id, age, grade, address);
		this.degree=degree;
		this.stream=stream;
	}
	
	void display()
	{
		UGStudent m=new UGStudent();
		System.out.println("Name     : "+name);
		System.out.println("ID       : "+id);
		System.out.println("Age      : "+age);
		System.out.println("Grade    : "+(m.isPassed(grade)));
		System.out.println("Address  : "+address);
		System.out.println("Degree   : "+degree);
		System.out.println("Stream   : "+stream);
		
	}
	
	boolean isPassed(int grade)
	{
		if(grade>70)
			return true;
		else
			return false;
	}
}


class PGStudent extends Student
{
	private String specialization;
	private int paper;

	
	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getPaper() {
		return paper;
	}

	public void setPaper(int paper) {
		this.paper = paper;
	}

	PGStudent()
	{
		
	}
	
	public PGStudent(String name, int id, int age, int grade, String address, String specialization, int paper)
	{
		super(name, id, age, grade, address);
		this.specialization=specialization;
		this.paper=paper;
	}
	
	void display()
	{
		PGStudent na=new PGStudent();
		System.out.println("Name    		 : "+name);
		System.out.println("ID      		 : "+id);
		System.out.println("Age      		 : "+age);
		System.out.println("Grade   		 : "+(na.isPassd(grade, paper)));
		System.out.println("Address  		 : "+address);
		System.out.println("Specialization  : "+specialization);
		System.out.println("No. of paper    : "+paper);
		
	}
	
	boolean isPassd(int grade, int paper)
	{
		if((grade>70)&&(paper>=2))
			return true;
		else
			return false;
	}
}
