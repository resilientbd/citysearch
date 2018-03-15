package com.javatpoint;
import javax.servlet.*;
import java.sql.*;

public class MyListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent arg0) {
		
		Connection con=null;
	try{
            
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bnlivein_lict","bnlivein_lict","java@1234");
Statement ps=con.createStatement();
		ps.executeUpdate("CREATE TABLE IF NOT EXISTS CITY1_DETAILS(ID INT,NAME TEXT,CATEGORY TEXT,EMAIL TEXT,ADDRESS TEXT,CITY TEXT,CONTACT TEXT,PRIMARY KEY (ID))");
	
		
		
		
		
		Statement ps4=con.createStatement();
		ps4.executeUpdate("CREATE TABLE IF NOT EXISTS CITY_CLASSIFIED(ID INT,BUYSELL TEXT,NAME TEXT,DESCRIPTION TEXT,USERID INT,PRIMARY KEY (ID))");		
		
		
		
		
		
	 Statement	ps5 = con.createStatement();		
		ps5.executeUpdate("CREATE TABLE IF NOT EXISTS CITY1_USER(ID INT,NAME TEXT,PASSWORD TEXT,EMAIL TEXT,ADDRESS TEXT,COUNTRY TEXT,CONTACT INT,PRIMARY KEY (ID))");
		
		
		
	
	}
		
	    catch(Exception e){
	    	e.printStackTrace();
	    	
	    }
	    
	}
	    public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("project undeployed");
		
	}
}
