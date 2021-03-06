package Java_HW;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class CalcTest {

	@Test
	public void Calctest() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D:\\CalcWithRes.html");
		drv.findElement(By.id("text1")).sendKeys("5");
		drv.findElement(By.id("operation")).sendKeys("+");
		drv.findElement(By.id("text2")).sendKeys("5");
		drv.findElement(By.id("btn1")).click();
			String res=drv.findElement(By.id("text3")).getAttribute("value");
		assertEquals("10", res);
		drv.quit();
		
	}
	@Test
	public void Calctest1() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D:\\CalcWithRes.html");
		drv.findElement(By.id("text1")).sendKeys("5");
		drv.findElement(By.id("operation")).sendKeys("-");
		drv.findElement(By.id("text2")).sendKeys("5");
		
		drv.findElement(By.id("btn1")).click();
		String res=drv.findElement(By.id("text3")).getAttribute("value");
		assertEquals("0", res);
		drv.quit();
	}
	@Test
	public void Calctest2() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D:\\CalcWithRes.html");
		drv.findElement(By.id("text1")).sendKeys("5");
		drv.findElement(By.id("operation")).sendKeys("*");
		drv.findElement(By.id("text2")).sendKeys("5");
		
		drv.findElement(By.id("btn1")).click();
		String res=drv.findElement(By.id("text3")).getAttribute("value");
		assertEquals("25", res);
		drv.quit();
	}
	@Test
	public void Calctest3() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D:\\CalcWithRes.html");
		drv.findElement(By.id("text1")).sendKeys("5");
		drv.findElement(By.id("operation")).sendKeys("/");
		drv.findElement(By.id("text2")).sendKeys("5");
		drv.findElement(By.id("btn1")).click();
		String res=drv.findElement(By.id("text3")).getAttribute("value");
		
		
		assertEquals("1", res);
		drv.quit();
	}
	@Test
	public void CalcFF1(){
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
	WebDriver drv = new FirefoxDriver();
	drv.get("file:///D:/CalcWithRes.html");
	drv.findElement(By.id("text1")).sendKeys("5");
	drv.findElement(By.id("operation")).sendKeys("/");
	drv.findElement(By.id("text2")).sendKeys("5");
	drv.findElement(By.id("btn1")).click();
	String res=drv.findElement(By.id("text3")).getAttribute("value");

	assertEquals("1", res);
	drv.quit();
	}
	@Test
	public void CalcFF2(){
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
	WebDriver drv = new FirefoxDriver();
	drv.get("file:///D:/CalcWithRes.html");
	drv.findElement(By.id("text1")).sendKeys("5");
	drv.findElement(By.id("operation")).sendKeys("-");
	drv.findElement(By.id("text2")).sendKeys("-5");
	drv.findElement(By.id("btn1")).click();
	String res=drv.findElement(By.id("text3")).getAttribute("value");

	assertEquals("10", res);
	drv.quit();
	}
	@Test
	public void CalcFF3(){
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
	WebDriver drv = new FirefoxDriver();
	drv.get("file:///D:/CalcWithRes.html");
	drv.findElement(By.id("text1")).sendKeys("5");
	drv.findElement(By.id("operation")).sendKeys("+");
	drv.findElement(By.id("text2")).sendKeys("5");
	drv.findElement(By.id("btn1")).click();
	String res=drv.findElement(By.id("text3")).getAttribute("value");

	assertEquals("10", res);
	drv.quit();
	}
	@Test
	public void CalcFF4(){
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
	WebDriver drv = new FirefoxDriver();
	drv.get("file:///D:/CalcWithRes.html");
	drv.findElement(By.id("text1")).sendKeys("5");
	drv.findElement(By.id("operation")).sendKeys("*");
	drv.findElement(By.id("text2")).sendKeys("5");
	drv.findElement(By.id("btn1")).click();
	String res=drv.findElement(By.id("text3")).getAttribute("value");

	assertEquals("25", res);
	drv.quit();
	}
	@Test
	public void CalcEdge1(){
	System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
	WebDriver drv = new EdgeDriver();
	drv.get("D://CalcWithRes.html");
	drv.findElement(By.id("text1")).sendKeys("5");
	drv.findElement(By.id("operation")).sendKeys("*");
	drv.findElement(By.id("text2")).sendKeys("5");
	drv.findElement(By.id("btn1")).click();
	String res=drv.findElement(By.id("text3")).getAttribute("value");

	assertEquals("25", res);
	drv.quit();
	}
	@Test
	public void CalcEdge2(){
	System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
	WebDriver drv = new EdgeDriver();
	drv.get("D://CalcWithRes.html");
	drv.findElement(By.id("text1")).sendKeys("512");
	drv.findElement(By.id("operation")).sendKeys("-");
	drv.findElement(By.id("text2")).sendKeys("528");
	drv.findElement(By.id("btn1")).click();
	String res=drv.findElement(By.id("text3")).getAttribute("value");

	assertEquals("-16", res);
	drv.quit();
	}
	@Test
	public void CalcEdge3(){
	System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
	WebDriver drv = new EdgeDriver();
	drv.get("D://CalcWithRes.html");
	drv.findElement(By.id("text1")).sendKeys("5");
	drv.findElement(By.id("operation")).sendKeys("+");
	drv.findElement(By.id("text2")).sendKeys("369");
	drv.findElement(By.id("btn1")).click();
	String res=drv.findElement(By.id("text3")).getAttribute("value");

	assertEquals("374", res);
	drv.quit();
	}
	@Test
	public void CalcEdge4(){
	System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
	WebDriver drv = new EdgeDriver();
	drv.get("D://CalcWithRes.html");
	drv.findElement(By.id("text1")).sendKeys("5");
	drv.findElement(By.id("operation")).sendKeys("/");
	drv.findElement(By.id("text2")).sendKeys("10");
	drv.findElement(By.id("btn1")).click();
	String res=drv.findElement(By.id("text3")).getAttribute("value");

	assertEquals("0.5", res);
	drv.quit();
	}
	@Test
	public void CalcOpera1(){
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
	WebDriver drv = new OperaDriver();
	drv.get("D://CalcWithRes.html");
	drv.findElement(By.id("text1")).sendKeys("5");
	drv.findElement(By.id("operation")).sendKeys("*");
	drv.findElement(By.id("text2")).sendKeys("-5");
	drv.findElement(By.id("btn1")).click();
	String res=drv.findElement(By.id("text3")).getAttribute("value");

	assertEquals("-25", res);
	drv.quit();
	}
	@Test
	public void CalcOpera2(){
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
	WebDriver drv = new OperaDriver();
	drv.get("D://CalcWithRes.html");
	drv.findElement(By.id("text1")).sendKeys("5");
	drv.findElement(By.id("operation")).sendKeys("+");
	drv.findElement(By.id("text2")).sendKeys("5");
	drv.findElement(By.id("btn1")).click();
	String res=drv.findElement(By.id("text3")).getAttribute("value");

	assertEquals("10", res);
	drv.quit();
	}
	@Test
	public void CalcOpera3(){
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
	WebDriver drv = new OperaDriver();
	drv.get("D://CalcWithRes.html");
	drv.findElement(By.id("text1")).sendKeys("5");
	drv.findElement(By.id("operation")).sendKeys("-");
	drv.findElement(By.id("text2")).sendKeys("5");
	drv.findElement(By.id("btn1")).click();
	String res=drv.findElement(By.id("text3")).getAttribute("value");

	assertEquals("0", res);
	drv.quit();
	}
	@Test
	public void CalcOpera4(){
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
	WebDriver drv = new OperaDriver();
	drv.get("D://CalcWithRes.html");
	drv.findElement(By.id("text1")).sendKeys("5");
	drv.findElement(By.id("operation")).sendKeys("/");
	drv.findElement(By.id("text2")).sendKeys("5");
	drv.findElement(By.id("btn1")).click();
	String res=drv.findElement(By.id("text3")).getAttribute("value");

	assertEquals("1", res);
	drv.quit();
	}
	@Test
	public void CalcOpera5(){
	System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
	WebDriver drv = new OperaDriver();
	drv.get("D://CalcWithRes.html");
	drv.findElement(By.id("text1")).sendKeys("5");
	drv.findElement(By.id("operation")).sendKeys("/");
	drv.findElement(By.id("text2")).sendKeys("0");
	drv.findElement(By.id("btn1")).click();
	String res=drv.findElement(By.id("text3")).getAttribute("value");

	assertEquals("Infinity", res);
	drv.quit();
	}


	
	

}
