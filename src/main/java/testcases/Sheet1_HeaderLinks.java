package testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet1_HeaderLinks extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="VERIFY THE HEADER LINKS";
		testDescription="Verify whether the header links are present or present or not";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test
	public void headerlink() throws AWTException {
		
		new HomePage_RRS()
		
		.verifymenu();
	}

}
