import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Oracle.DBConnection;

public class StudentDetails {
	
	 long student;
	 int flag = 0;
	 StudentDetails(long student){
		 this.student=student;
		 }
//To create a method for student details and create a variable
	public int setdata(long student) throws Exception{ 
		//To Create connection and to get the connection from DBconnection
		
	Connection conn= DBConnection.getConnection();
	System.out.println(conn);
	//To write a query of student details in that we have get the student details 
	 String query = "select * from Library_management.studentdetails where s_uid="+student;
	//To create a statement	   
	     Statement stmt = conn.createStatement(); {
	    	 //To create a resultset in that we have execute a script		     
	     ResultSet rs = stmt.executeQuery(query);      
	      while (rs.next()) {
	    	  flag=1;
	    	  //To get the name of the student
	         String name= rs.getString(1);
	         //To get the university id
	         String uni_id = rs.getString(2);
	         //To get the Student id
	        long uid = rs.getLong(3);
	        //To get the semester of the student
	        long sem = rs.getLong(4);
	        //To get the mobile number of the student
	         long mobile = rs.getLong(5);
	         //To print the data of the student
	        System.out.println("Student Name : "+name +"\n"+"University_Id : "+ uni_id+"\n" +"Student_Id: "
	      
	                           + uid +"\n"+"Semester : "+ sem+"\n"+"Mobile Number :"+mobile);
}}
	     //we have to return the flag
return flag;
}
	     }
