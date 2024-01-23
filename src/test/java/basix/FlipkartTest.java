package basix;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartTest {

	
	@Test
	public void LaunchTest()
	{
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.tirabeauty.com/");
		
		WebElement tira = w.findElement(By.id("search"));
		tira.sendKeys("Perfume");
		tira.sendKeys(Keys.ENTER);
	
		
		

}
}
