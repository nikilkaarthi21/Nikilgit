package com.testcases;

import org.testng.annotations.Test;

public class potentialTest {


	String testcaseName="TestA";

	@Test(priority=1)
	
	public void createPotential()
	{
		

	
	}
	
	@Test(priority=2,dependsOnMethods={"createPotential"})
	
	public void DeletePotential()
	{
		

	
	}
}
