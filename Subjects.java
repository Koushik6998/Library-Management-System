import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Oracle.DBConnection;


	public class Subjects{
//To create a method of chemistry subject	
	 public void chemistry() throws Exception{
		 long student = 0;
		 //To create the object of the student in this we give the student
		StudentDetails b=new StudentDetails ( student);
		//To Create connection and to get the connection from DBconnection		
				Connection conn= DBConnection.getConnection();				
			System.out.println(conn);
			//To write a query of books to give the subject id
			 String query = "select * from Library_management.books where subject_id=1";
			//To create a statement
			    Statement stmt = conn.createStatement(); {
			    	 //To create a resultset in that we have execute a script		     
			       ResultSet rs = stmt.executeQuery(query);
			      while (rs.next()) {
			    	  //To get the bookname 
			        String chem = rs.getString(1);
			        //To get the subject Name
			        String chem1 = rs.getString(2);
			       //To get the subject id
			        long chem2 = rs.getLong(3);
			        //To get the bookid
			        long chem3 = rs.getLong(4);
			        //To print the details of chemistry
			        System.out.println(chem + ", " + chem1 + ", " +
	                           ", " + chem2 + ", "+chem3);			     
			      }					
    }}
	
	//To create a method of physics subject
			     public void physics() throws Exception{
			    	//To Create connection and to get the connection from DBconnection	
			    	 Connection conn= DBConnection.getConnection();			    	 
						System.out.println(conn);
						//To write a query of books to give the subject id
						 String query = "select * from Library_management.books where subject_id=2 ";
						 //To create a statement
						     Statement stmt = conn.createStatement(); {
						    	//To create a resultset in that we have execute a script							     
						      ResultSet rs = stmt.executeQuery(query);						      
						      while (rs.next()) {
						    	  //To get the bookname 
						    	 String phy = rs.getString(1);
						    	 //To get the subject Name
						        String phy1 = rs.getString(2);
						      //To get the subject id
					      long phy2 = rs.getLong(3);
					    //To get the bookid
						        long phy3 = rs.getLong(4);
						      //To print the details of physics					        
						        System.out.println(phy + ", " + phy1 + ", " +
						                           ", " + phy2 + ", " + phy3);		    
						      }}
}
			   //To create a method of biology subject			 	
public void biology() throws Exception{
	//To Create connection and to get the connection from DBconnection	
	Connection conn= DBConnection.getConnection();
	System.out.println(conn);
	//To write a query of books to give the subject id
	 String query = "select * from Library_management.books where subject_id=3 ";
	//To create a statement	 
	     Statement stmt = conn.createStatement(); {
	    	 	//To create a resultset in that we have execute a script							     			   
	     ResultSet rs = stmt.executeQuery(query);
	      while (rs.next()) {
	    	  //To get the bookname 			    
	    	  String bio = rs.getString(1);
	    		 //To get the subject Name		      
	        String bio1 = rs.getString(2);
	        //To get the subject id		    
	        long bio2 = rs.getLong(3);
	      //To get the bookid			
	        long bio3 = rs.getLong(4);
	      //To print the details of physics					        		      
	        System.out.println(bio + ", " + bio1 + ", " +
	                           ", " + bio2 + ", " + bio3);
    } }}}
