package Java_HW;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class CalcBtnTest {

	@Test
	public void testCalcButtChr1() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://CalcUpdate.html");
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn2")).click();
	
		drv.findElement(By.id("btnRavno")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("3",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr2() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://CalcUpdate.html");
		drv.findElement(By.id("btn7")).click();
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn4")).click();
		drv.findElement(By.id("btnMinus")).click();
		drv.findElement(By.id("btnMinus")).click();
		drv.findElement(By.id("btn5")).click();
	
		drv.findElement(By.id("btnRavno")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("72",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChe3() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://CalcUpdate.html");
		drv.findElement(By.id("btn6")).click();
		drv.findElement(By.id("btnMul")).click();
		drv.findElement(By.id("btn8")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn5")).click();
		drv.findElement(By.id("btnDiv")).click();
		drv.findElement(By.id("btnDiv")).click();
		drv.findElement(By.id("btn9")).click();
	
		drv.findElement(By.id("btnRavno")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("7",res);
		drv.quit();
	}
	@Test
	public void testCalcButtFF5() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/CalcUpdate.html");
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn2")).click();
	
		drv.findElement(By.id("btnRavno")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("3",res);
		drv.quit();
	}
	@Test
	public void testCalcButtFF6() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/CalcUpdate.html");
		drv.findElement(By.id("btn7")).click();
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn4")).click();
		drv.findElement(By.id("btnMinus")).click();
		drv.findElement(By.id("btnMinus")).click();
		drv.findElement(By.id("btn5")).click();
	
		drv.findElement(By.id("btnRavno")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("72",res);
		drv.quit();
	}
	@Test
	public void testCalcButtFF7() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/CalcUpdate.html");
		drv.findElement(By.id("btn6")).click();
		drv.findElement(By.id("btnMul")).click();
		drv.findElement(By.id("btn8")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn5")).click();
		drv.findElement(By.id("btnDiv")).click();
		drv.findElement(By.id("btnDiv")).click();
		drv.findElement(By.id("btn9")).click();
	
		drv.findElement(By.id("btnRavno")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("7",res);
		drv.quit();
	}
	@Test
	public void testCalcButtEdge8() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://CalcUpdate.html");
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn2")).click();
	
		drv.findElement(By.id("btnRavno")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("3",res);
		drv.quit();
	}
	@Test
	public void testCalcButtEdge9() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://CalcUpdate.html");
		drv.findElement(By.id("btn7")).click();
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn4")).click();
		drv.findElement(By.id("btnMinus")).click();
		drv.findElement(By.id("btnMinus")).click();
		drv.findElement(By.id("btn5")).click();
	
		drv.findElement(By.id("btnRavno")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("72",res);
		drv.quit();
	}
	@Test
	public void testCalcButtFFZero() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/CalcUpdate.html");
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btn0")).click();
		
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("0",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChrZero() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();
		drv.get("D://CalcUpdate.html");
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btn0")).click();
		
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("0",res);
		drv.quit();
	}
	@Test
	public void testCalcButtOperaZero() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://CalcUpdate.html");
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btn0")).click();
		
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("0",res);
		drv.quit();
	}
	@Test
	public void testCalcButtEdgeZero() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://CalcUpdate.html");
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btn0")).click();
		
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("0",res);
		drv.quit();
	}
	@Test
	public void testCalcButtEdge10() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://CalcUpdate.html");
		drv.findElement(By.id("btn6")).click();
		drv.findElement(By.id("btnMul")).click();
		drv.findElement(By.id("btn8")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn5")).click();
		drv.findElement(By.id("btnDiv")).click();
		drv.findElement(By.id("btnDiv")).click();
		drv.findElement(By.id("btn9")).click();
	
		drv.findElement(By.id("btnRavno")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("7",res);
		drv.quit();
	}
	@Test
	public void testCalcButtOpera11() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://CalcUpdate.html");
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn2")).click();
	
		drv.findElement(By.id("btnRavno")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("3",res);
		drv.quit();
	}
	@Test
	public void testCalcButtOpera12() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://CalcUpdate.html");
		drv.findElement(By.id("btn7")).click();
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn4")).click();
		drv.findElement(By.id("btnMinus")).click();
		drv.findElement(By.id("btnMinus")).click();
		drv.findElement(By.id("btn5")).click();
	
		drv.findElement(By.id("btnRavno")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("72",res);
		drv.quit();
	}
	@Test
	public void testCalcButtOpera13() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://CalcUpdate.html");
		drv.findElement(By.id("btn6")).click();
		drv.findElement(By.id("btnMul")).click();
		drv.findElement(By.id("btn8")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn5")).click();
		drv.findElement(By.id("btnDiv")).click();
		drv.findElement(By.id("btnDiv")).click();
		drv.findElement(By.id("btn9")).click();
	
		drv.findElement(By.id("btnRavno")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("7",res);
		drv.quit();
	}
}
