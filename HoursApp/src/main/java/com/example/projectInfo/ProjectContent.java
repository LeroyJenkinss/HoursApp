package com.example.projectInfo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProjectContent {

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

	public ProjectContent(int projectId,String projectName, String businessUnit,String firstContact,String ckeyContact,String ownerApplication,String assetownerApplication,String ckeyAssetOwner,Boolean onderhoudsContract,int uren,int urenUsed) {
		
		this.projectName = projectName;
		this.projectId = projectId;
		this.businessUnit = businessUnit;
		this.firstContact = firstContact;
		this.ckeyContact = ckeyContact;
		this.ownerApplication = ownerApplication;
		this.assetownerApplication = assetownerApplication;
		this.ckeyAssetOwner = ckeyAssetOwner;
		this.onderhoudsContract = onderhoudsContract;
		this.uren = uren;
		this.urenUsed = urenUsed;
	}
	
	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
		
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getFirstContact() {
		return firstContact;
	}

	public void setFirstContact(String firstContact) {
		this.firstContact = firstContact;
	}

	public String getCkeyContact() {
		return ckeyContact;
	}

	public void setCkeyContact(String ckeyContact) {
		this.ckeyContact = ckeyContact;
	}

	public String getOwnerApplication() {
		return ownerApplication;
	}

	public void setOwnerApplication(String ownerApplication) {
		this.ownerApplication = ownerApplication;
	}

	public String getAssetownerApplication() {
		return assetownerApplication;
	}

	public void setAssetownerApplication(String assetownerApplication) {
		this.assetownerApplication = assetownerApplication;
	}

	public String getCkeyAssetOwner() {
		return ckeyAssetOwner;
	}

	public void setCkeyAssetOwner(String ckeyAssetOwner) {
		this.ckeyAssetOwner = ckeyAssetOwner;
	}

	public Boolean getOnderhoudsContract() {
		return onderhoudsContract;
	}

	public void setOnderhoudsContract(Boolean onderhoudsContract) {
		this.onderhoudsContract = onderhoudsContract;
	}

	public int getUren() {
		return uren;
	}

	public void setUren(int uren) {
		this.uren = uren;
	}

	public int getUrenUsed() {
		return urenUsed;
	}

	public void setUrenUsed(int urenUsed) {
		this.urenUsed = urenUsed;
	}

	
		
	
	
}