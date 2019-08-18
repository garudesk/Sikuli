import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YoutubeHandling {

	public static void main(String[] args) throws FindFailed {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        driver.get("https://www.youtube.com/watch?v=g92tWVT4Bd8");
        
        Screen sc = new Screen();
        
        Pattern pt = new Pattern("pause.png");
		
		sc.wait(pt,1000);
		
		sc.click();
		
		sc.click();
		
		sc.wait(pt,9000);
		Pattern pt1 = new Pattern("setting.png");
		sc.click();
		
		sc.wait(pt1,9000);
		
		Pattern pt2 = new Pattern("quality.png");
		sc.click();
		
		sc.wait(pt2,9000);
		
		Pattern pt3 = new Pattern("240p.png");
		sc.click();
	}

}
