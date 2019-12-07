package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_FitFinder extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Fit finder section";
		testDescription="Verify the Fit finder 	 section";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test
	public void fit()  {
		
		new HomePage_RRS()
		.clickFitFinder()
		.clickGetStarted()
		.clickmale()
		.clickrunning()
		.clickpavement()
		.clickmileage()
		.clicknext()
		.clickhealthy()
		.clicknext()
		.clickunder150()
		.clicknext()
		.clickhigharch()
		.clicknext()
		.clicklegpos()
		.clicknext()
		.clickpain()
.clicknext()
.clicklevel()
.clicknext()
		.clicksize()
		.clickwidth()
		.clicknext()
		.clickgetitnow();
		
	}
}