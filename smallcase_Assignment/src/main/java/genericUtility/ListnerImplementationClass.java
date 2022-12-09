package genericUtility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import genericUtility.BaseClass;

public class ListnerImplementationClass implements ITestListener
{

	public void onTestStart(ITestResult result) 
	{
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result)
	{
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result)
	{
	String testname=result.getMethod().getMethodName();
	System.out.println(testname+"====Execute and  I am listening====");
	EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.sDriver);
	File srcFile=edriver.getScreenshotAs(OutputType.FILE);
	try
	{
		File destFile=new File("./screenshots"+testname+".png");
		FileUtils.copyFile(srcFile, destFile);
	}
	catch(Throwable e)
	{
		e.printStackTrace();
	}
	}

	public void onTestSkipped(ITestResult result) 
	{
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

}
