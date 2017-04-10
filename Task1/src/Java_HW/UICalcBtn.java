package Java_HW;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class UICalcBtn {

	@Test
	public void testCalcButtChr14() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn0")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("0",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr15() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn1")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("1",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr16() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn2")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("2",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr17() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn3")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("3",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr18() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn4")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("4",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr19() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn5")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("5",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr141() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn6")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("6",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr142() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn7")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("7",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr143() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn8")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("8",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr144() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn9")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("9",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr145() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btnMul")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("*",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr146() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btnMinus")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("-",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr147() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btnPlus")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("+",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr148() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btnDiv")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("/",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr149() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btnRavno")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("=",res);
		drv.quit();
	}
	@Test
	public void testCalcButtFF15() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/UICalcUpdate.html");
		drv.findElement(By.id("btn0")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("0",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr151() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/UICalcUpdate.html");
		drv.findElement(By.id("btn1")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("1",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr161() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/UICalcUpdate.html");
		drv.findElement(By.id("btn2")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("2",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr171() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/UICalcUpdate.html");
		drv.findElement(By.id("btn3")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("3",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr181() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/UICalcUpdate.html");
		drv.findElement(By.id("btn4")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("4",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr191() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/UICalcUpdate.html");
		drv.findElement(By.id("btn5")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("5",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1411() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/UICalcUpdate.html");
		drv.findElement(By.id("btn6")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("6",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1421() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/UICalcUpdate.html");
		drv.findElement(By.id("btn7")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("7",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1431() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/UICalcUpdate.html");
		drv.findElement(By.id("btn8")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("8",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1441() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/UICalcUpdate.html");
		drv.findElement(By.id("btn9")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("9",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1451() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/UICalcUpdate.html");
		drv.findElement(By.id("btnMul")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("*",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1461() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/UICalcUpdate.html");
		drv.findElement(By.id("btnMinus")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("-",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1471() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/UICalcUpdate.html");
		drv.findElement(By.id("btnPlus")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("+",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1481() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/UICalcUpdate.html");
		drv.findElement(By.id("btnDiv")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("/",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1491() 
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver drv = new FirefoxDriver();
		drv.get("file:///D:/UICalcUpdate.html");
		drv.findElement(By.id("btnRavno")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("=",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr14222() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn0")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("0",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr152() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn1")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("1",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr162() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn2")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("2",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr172() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn3")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("3",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr182() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn4")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("4",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr192() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn5")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("5",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1412() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn6")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("6",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1422() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn7")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("7",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1432() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn8")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("8",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1442() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn9")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("9",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1452() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btnMul")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("*",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1462() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btnMinus")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("-",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1472() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btnPlus")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("+",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1482() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btnDiv")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("/",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1492() 
	{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		WebDriver drv = new EdgeDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btnRavno")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("=",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1423() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn0")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("0",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1523() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn1")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("1",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1623() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn2")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("2",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1723() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn3")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("3",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1823() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn4")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("4",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr1923() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn5")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("5",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr14123() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn6")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("6",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr14223() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn7")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("7",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr14323() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn8")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("8",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr14423() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btn9")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("9",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr14523() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btnMul")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("*",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr14623() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btnMinus")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("-",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr14723() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
	WebDriver drv = new OperaDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btnPlus")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("+",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr14823() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btnDiv")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("/",res);
		drv.quit();
	}
	@Test
	public void testCalcButtChr14923() 
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver.exe");
		WebDriver drv = new OperaDriver();
		drv.get("D://UICalcUpdate.html");
		drv.findElement(By.id("btnRavno")).click();
		String res= drv.findElement(By.id("text1")).getAttribute("value");
		assertEquals("=",res);
		drv.quit();
	}


}
