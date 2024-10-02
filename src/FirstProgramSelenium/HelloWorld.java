package FirstProgramSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pramod\\Downloads\\chromedriver-win64_ForSelenium\\chromedriver-win64\\chromedriver.exe");
		System.out.println("Welcome Pramod");

		//ChromeOptions options = new ChromeOptions();
		//options.setBinary("C:\\Users\\Pramod\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

//		//*[@name="q"]
		driver.findElement(By.name("q")).click();
		WebElement seachField = driver.findElement(By.xpath("//*[@name='q']"));
		seachField.sendKeys("Selenium Automation testing");

		List<WebElement> elementList = driver.findElements(By.xpath("//*[@role='listbox'] //li"));

		try {

			String expected_DropdownOption = "selenium automation testing";
			for (int i = 0; i < elementList.size(); i++) {
				WebElement ele = elementList.get(i);
				String eleText = ele.getText();

				if (eleText.equals(expected_DropdownOption)) {
					Thread.sleep(Duration.ofSeconds(2));
					ele.click();
				}
			}

		} catch (StaleElementReferenceException e) {
			System.out.println(e);
		}

		Thread.sleep(Duration.ofSeconds(2));
		 driver.quit();

	}

}
