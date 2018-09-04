package demo.pack.DemoProject2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass 
{
	@Test()
	public void orange()
	{
		System.out.println("orange");
	}
	
	
	@Test(dependsOnMethods= {"orange"})
	public void white()
	{
		System.out.println("white");
	}
	
	@Test(dependsOnMethods= {"white"})
	public void black()
	{
		System.out.println("black");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods= {"black"})
	public void green()
	{
		System.out.println("green");
	}
	

}
