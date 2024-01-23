package basix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyntraTest {

	
		@Test
		public void LaunchTest()
		{
			WebDriver w=new ChromeDriver();
			w.manage().window().maximize();
			w.get("https://www.myntra.com/");
			String acttitle = w.getTitle();
			System.out.println(acttitle);
			

	}

}
