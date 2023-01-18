import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
public static void main(String args[]) throws Exception {
	

 Scanner obj=new Scanner(System.in);
            //To call the Subject method
	        Subjects obj2=new Subjects();
	        //To call the SelectTheBooks 
	        SelectTheBooks obj3=new SelectTheBooks();
	        StudentDetails obj1;
	       
	        int choice =0;
	        int res;
	      int phys;
	      int chemi;
	      long student;
	      System.out.println("-------------Welcome To Library Management---------------");
	     	 
	    System.out.println("Please enter the student id"); 
	    //To enter the student id
      	 student=obj.nextLong();
      	obj1=new StudentDetails(student);
   	 //In this to set the student variable in studentdetails       
      	obj1.setdata(student);
      	System.out.println("-------------------------------------");
      	//To call the flag
      	int flag=obj1.flag;
      	//If the flag==0 then it shows no details found
      	if(flag==0) {
      		System.out.println("No student Details found");
      		System.out.println("-----------------------------------");
      		System.out.println("Please enter the valid student id");
      		//Re enter the student id
      		 student=obj.nextLong();     		 
      		obj1=new StudentDetails(student);
      	//In this to set the student variable in studentdetails            	     
          	obj1.setdata(student);
      	}
	 
   //To choose the option
	      while(choice !=2){
	        	System.out.println("Enter \"1\"to access the selection page \n Enter \"2\" to end the system");
	        	//To enter the choice
	            choice =obj.nextInt();
	            if(choice==1) {
	            	System.out.println("select the subject you need");
	            	System.out.println("1.Chemistry\n2.Physics\n3.Biology");
	            	//To enter the subject
	            	res=obj.nextInt();
	            	//Response==1
	            	if(res==1)
						try {
							{
								//To print the subjects
								obj2.chemistry();
								//System.out.println("-------------------------------------------");		       		 
								System.out.println("\n Please enter the Book id which do you need");
								//To enter the book id
								chemi=obj.nextInt();
								//To show the select book
								obj3.chymys(chemi);
								System.out.println("---------------------------------------");
								 //To get the student details which you enter previous
							obj1.setdata(student);
							System.out.println("-------------------------------------------------------------------------------");
								System.out.println("If you want to choose another subject please click '1' otherwise click '2'");
								System.out.println("---------------------------------------------------------------------------");
								
							}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	            	//Response==2
					else if(res==2) {
						//To print the subjects
	            	obj2.physics();	 
	            	System.out.println("\nPlease enter the Book id which do you need");
	            	//To enter the book id
	            	phys=obj.nextInt();	
	            	//To show the select book
	            	obj3.physi(phys);
	            	System.out.println("-------------------------------------------");
	       		 //To get the student details which you enter previous			
	            	obj1.setdata(student);
	            	System.out.println("--------------------------------------------------------------------------");
		       		 
            		System.out.println("If you want to choose another subject please click '1' otherwise click '2'");
            		System.out.println("---------------------------------------------------------------------------");
   	       		 
            		
	            }
	            	//Response==3
	            	else if(res==3) {
	            		//To print the subjects    	            
	            	obj2.biology();
	            	System.out.println("\nPlease enter the Book id which do you need");
	            	//To enter the book id
	            	
	            	int Bio=obj.nextInt();
	            	//To show the select book
	            	obj3.Biolo(Bio);	            	
	            	System.out.println("---------------------------------------------");
	            	//To get the student details which you enter previous			
		            
	            obj1.setdata(student);	
	            System.out.println("--------------------------------------------------------------------------");  		
            		System.out.println("If you want to choose another subject please click '1' otherwise click '2'");
            		System.out.println("--------------------------------------------------------------------------");       		
            		
	      }}//choice==2
	            else if(choice==2) {
	            	System.out.println("Thank you for visiting");
	            	  
	               
	            	
	     	 		
}}}}




          

 

