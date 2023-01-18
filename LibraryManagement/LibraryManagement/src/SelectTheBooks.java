import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import Oracle.DBConnection;

public class SelectTheBooks {
//To create a method of chemistry subject
	public void chymys(int chemi) throws Exception {
		//To Create connection and to get the connection from DBconnection
		 Connection conn= DBConnection.getConnection();		 
			System.out.println(conn);
			//To write a query of subjects in that what books we have
			 String query = "select bookname from Library_management.books where book_id="+chemi;
			 //To create a statement
			     Statement stmt = conn.createStatement(); {
			    	 //To create a resultset in that we have execute a script
			      ResultSet rs = stmt.executeQuery(query);
			      while (rs.next()) {
			    	  //To get the name of the book which book you want
			        String chem = rs.getString(1);
			       
			        //To print the name of the book which book you have selected
			        System.out.println("You have selected " + chem + "\nPlease submit the book within 2 days" );
 
			      }}
		
    }
	//To create a method of physics subject
public void physi(int phys) throws Exception {
	//To Create connection and to get the connection from DBconnection
	Connection conn= DBConnection.getConnection();
	System.out.println(conn);
	//To write a query of subjects in that what books we have
	 String query = "select bookname from Library_management.books where book_id="+phys;
	 //To create a statement
	     Statement stmt = conn.createStatement(); {
	    	//To create a resultset in that we have execute a script
	      ResultSet rs = stmt.executeQuery(query);
	      System.out.println(rs);
	      while (rs.next()) {
	    	  //To get the name of the book which book you want
	        String phy = rs.getString(1);
	        //To print the name of the book which book you have selected		       
	        System.out.println("You have selected " + phy +"\n Please submit the book within 2 days" );

        	}}}
//To create a method of Biology subject
public void Biolo(int Bio) throws Exception {
	//To Create connection and to get the connection from DBconnection
	Connection conn= DBConnection.getConnection();
	System.out.println(conn);
	//To write a query of subjects in that what books we have
	
	 String query = "select bookname from Library_management.books where book_id="+Bio;
	 //To create a statement
	     Statement stmt = conn.createStatement(); {
	    	//To create a resultset in that we have execute a script
	      ResultSet rs = stmt.executeQuery(query);
	      System.out.println(rs);
	      while (rs.next()) {
	    	//To get the name of the book which book you want
	        String bio = rs.getString(1);
	        //To print the name of the book which book you have selected		       
	        System.out.println("You have selected " + bio + "\nPlease submit the book within 2 days" );

	
 		}}}}


