package testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet1_FooterLinks extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="vERIFY THE FOOTER LINKS";
		testDescription="Verify whether the footer links are present or present or not";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test
	public void footerlinks() throws AWTException {
		
		new HomePage_RRS()
		
		.verifycustomerservice()
		.verifyfurtherinformation()
	
		.verifyvipfamily()
	
		.verifywecare();
	
		
	}
	

}
