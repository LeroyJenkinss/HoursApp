package com.example.projectInfo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProjectDataExtraction{
	
	public int projectId;
	public String projectName;
	public String businessUnit;
	public String firstContact;
	public String ckeyContact;
	public String ownerApplication;
	public String assetownerApplication;
	public String ckeyAssetOwner;
	public Boolean onderhoudsContract;
	public int uren;
	public int urenUsed;
//	public Date startDateContract;
//	public Date endDateContract;
	
	public String project;
	
	public Connection c = null;
	public  Statement stmt = null;
	
	public void doit(String projectName){
	   try {
		   
		   
		   System.out.println("Here we are?? ?? ");
	      Class.forName("org.postgresql.Driver");
	     
	      
	
	      c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "IAmTheMacDaddy");
	
	//     c.setAutoCommit(false);
	
	      System.out.println("Successfully Connected.");
	
	
	
	      stmt = c.createStatement();
	
	      ResultSet rs = stmt.executeQuery( "select * from public.\"project\" where projectname = '"+projectName+"';" );
	
	      while ( rs.next() ) {
	
	    	  this.projectId = rs.getInt("project_id");
		         this.projectName = rs.getString("projectname");		  
		         this.businessUnit = rs.getString("businessunit");		         
		         this.firstContact = rs.getString("first_contact");		         
		         this.ckeyContact = rs.getString("ckey_contact");		         
		         this.ownerApplication = rs.getString("owner_application");		         
				 this.assetownerApplication = rs.getString("assetowner_application");				
				 this.ckeyAssetOwner = rs.getString("ckey_assetOwner");			
				 this.onderhoudsContract = rs.getBoolean("onderhoudsContract");		
				 this.uren = rs.getInt("uren");			 
				 this.urenUsed = rs.getInt("uren_used");
				 
				/* this.startDateContract = rs.getDate("start_date_contract");
				 this.endDateContract = rs.getDate("end_date_contract"); */
	         
	
	        
	
	      }
	
	      rs.close();
	
	      stmt.close();
	
	      c.close();
	
	   } catch ( Exception e ) {
	
	      System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	
	      System.exit(0);
	
	   }
	
	   System.out.println(" Data Retrieved Successfully ..");
	
	   
		}
}