package SeleniumPracticeDataDriven;






import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitleVerification {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", pagetitle);
		Assert.assertTrue("#1 Free CRMhbhbb software in the cloud for sales and service", true);
		System.out.println("sat");
	}

	
	
	
	
}
