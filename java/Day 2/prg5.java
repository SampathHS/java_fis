/*
Create a class Product with attributes 
productCode -int
productName-String
price-double
Include getters and setters.
In main class, create an array to store product objects. 
The program should have options to add a new product,
search for a particular product and display the product details. 
Develop this as a menu driven application.
*/


import java.util.*;
public class prg5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Product[] pr=new Product[10000];
		int productCode;
		String productName;
		double price;
	    char choice='n';
	    int i=0;
	    int count=0;
	  do
	  {
	   
		   System.out.println("From the below options ");
		   System.out.println("\t1. Add Product\t2. Search Product\t3. Display");
		   System.out.print("Enter your choice : ");
		   int val=sc.nextInt();
		   
		   if(val==1)
			   count++;
		   switch(val)
		   {
		       case 1:
		    	   System.out.println("");
	        	   System.out.println("---------");
		    	   System.out.print("Enter Product Code : ");  
					productCode = sc.nextInt();
					System.out.print("Enter Product Name : ");
					productName = sc.next();
					System.out.print("Enter Price : ");
					price = sc.nextDouble();
					pr[i] = new Product(productCode, productName, price);
					pr[i].setData(productCode, productName, price);
					i++;
			        System.out.println("Product added");
	        		 System.out.println("---------");
			        break;
			        
		       case 2:
		    	   try{
		    		   System.out.println("");
		        		 System.out.println("---------");
		    		   System.out.println("Enter the Product Name to search : ");
		    		   String search=sc.next();
		    		   int flag=0;
		    		   for(int x=0;x<pr.length;x++)
		    		   {
		    		     if((pr[x].getProductName()).equals(search))
		    		     {
		    		       pr[x].getData();
		    		       flag=1;
		    		     }
		    		   }
		    		   if(flag==0)
		    			   System.out.println("Product not found");
		        		   System.out.println("---------");
		    	     }
		    	     catch(NullPointerException e)
		    	     {
		    	    	 System.out.println("");
		    	     }
		    	     break;
		    	     
		        case 3:
		        	
		        	if(count>0)
		        	{
		        	 for (i=0;i<count;i++) 
		             {
		        		 System.out.println("");
		        		 System.out.println("---------");
		        		 System.out.println("Product "+(i+1)+"");
		                 pr[i].getData();
		             }
		        	}
		        	else
		        		System.out.println("No products");
		        	break;
		   }
		   System.out.println("Do you wish to continue: y/n");
		   choice=sc.next().charAt(0);
	   }while(choice=='y');
	sc.close();
	}
}



class Product
{
	int productCode;
	String productName;
	double price;

	
	
	public Product(int productCode, String productName, double price) 
	{
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
	}

	public void setData(int productCode, String productName, double price) 
	{
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
	}
	
	public String getProductName() {
		return productName;
	}

	public void getData()
	{
		System.out.println("Product code : "+productCode);
		System.out.println("Product name : "+productName);
		System.out.println("Product price : "+price);
		 System.out.println("---------");
	}	
	
}