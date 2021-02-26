package com.example.projectInfo;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Date;





@RestController
public class ProjectContentController extends ProjectDataExtraction {

	

	@GetMapping("/project")
	public ProjectContent projectcontent(@RequestParam(value = "projectName") String projectName) {
		doit(projectName);
		System.out.println("hier in de controller is de project ID :"+projectId);
		return new ProjectContent(this.projectId,projectName,this.businessUnit,this.firstContact,this.ckeyContact,this.ownerApplication,this.assetownerApplication,this.ckeyAssetOwner,this.onderhoudsContract,this.uren,this.urenUsed);
		
	}
	
}
