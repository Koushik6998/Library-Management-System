import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
public static void main(String args[]) throws Exception {
	

 Scanner obj=new Scanner(System.in);
            
	        Subjects obj2=new Subjects();
	        SelectTheBooks obj3=new SelectTheBooks();
	        StudentDetails obj1;
	       
	        int choice =0;
	        int res;
	      int phys;
	      int chemi;
	      long student;
	     	 
	    System.out.println("Please enter the student id");   	
      	 student=obj.nextLong();
      	obj1=new StudentDetails(student);
      	obj1.setdata(student);
      	System.out.println("\n");
      	int flag=obj1.flag;
      	if(flag==0) {
      		System.out.println("No student Details found");
      		System.out.println("\n");
      		System.out.println("Please enter the valid student id");
      		 student=obj.nextLong();
      		obj1=new StudentDetails(student);
          	obj1.setdata(student);
      	}
	 
   
	      while(choice !=2){
	        	System.out.println("Enter \"1\"to access the selection page \n Enter \"2\" to end the system");
	        	
	            choice =obj.nextInt();
	            if(choice==1) {
	           
	           
	            		System.out.println("select the subject you need");
	            	System.out.println("1.Chemistry\n2.Physics\n3.Biology");
	            	res=obj.nextInt();
	            	 
	            	if(res==1)
						try {
							{
								obj2.chemistry();
								
								System.out.println("\n Please enter the Book id which do you need");
								chemi=obj.nextInt();
								obj3.chymys(chemi);
								System.out.println("\n");
								 
							obj1.setdata(student);
								
								System.out.println("If you want to choose another subject please click '1' otherwise click '2'");
								System.out.println("\n");
								
							}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					else if(res==2) {
	            	obj2.physics();	 
	            	System.out.println("\nPlease enter the Book id which do you need");
	            	phys=obj.nextInt();
	            	obj3.physi(phys);
	            	System.out.println("\n");
	            	obj1.setdata(student);	            	
            		System.out.println("If you want to choose another subject please click '1' otherwise click '2'");
            		System.out.println("\n");
            		
	            }
	            
	            	else if(res==3) {
	            	obj2.biology();
	            	System.out.println("\nPlease enter the Book id which do you need");
	            	int Bio=obj.nextInt();
	            	obj3.Biolo(Bio);	
	            	System.out.println("\n");
	            obj1.setdata(student);	            	
            		System.out.println("If you want to choose another subject please click '1' otherwise click '2'");
            		System.out.println("\n");
            		
	      }}
	            else if(choice==2) {
	            	System.out.println("Thank you for visiting");
	            	  
	               
	            	
	     	 		
}}}}