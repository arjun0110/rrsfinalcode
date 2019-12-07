package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_LeftHandNavigation extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Left hand navigation section";
		testDescription="Verify the left hand navigation section";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test
	public void lefthandnavigation()  {
		
		new HomePage_RRS()
		.moseuhovermen()
		.verifybreadcrumbs()
		.clickhome()
		.verifyhomepage();
}
}