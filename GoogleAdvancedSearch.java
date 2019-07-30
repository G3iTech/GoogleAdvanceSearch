package com.BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleAdvancedSearch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "" + "../BasicSelenium/src/test/java/resources/chromedriver.exe");

		// Open the google ChromeBrowser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Open Google Advance Search
		driver.get("https://www.google.com/advanced_search");

		WebElement findWord = driver.findElement(By.xpath("//input[@id='xX4UFf']"));
		findWord.sendKeys("Automation");

		WebElement exactWord = driver.findElement(By.xpath("//input[@id='CwYCWc']"));
		exactWord.sendKeys("'Automation'");

		driver.findElement(By.xpath("//input[@id='mSoczb']")).sendKeys("Automation or Manual");

		driver.findElement(By.xpath("//input[@id='t2dX1c']")).sendKeys("-Rocket");

		driver.findElement(By.xpath("//input[@id='LK5akc']")).sendKeys("10..35kg");
		driver.findElement(By.xpath("//input[@name='as_nhi']")).sendKeys("£300..£500");

//		WebElement africana = driver.findElement(By.xpath("//div[@id='lr_button']"));
//		africana.click();

		// Select English as the Language
		driver.findElement(By.xpath("//*[@id=\":1b\"]")).click(); // click the box of any language
		driver.findElement(By.xpath("//*[@id=\":d\"]/div")).click(); // select the language

		// Select United Kingdom as the region
		driver.findElement(By.xpath("//div[@id='cr_button']")).click(); // box
		driver.findElement(By.xpath("//*[@id=\':7l\']/div")).click(); // selection

		// Click on last Update box
		driver.findElement(By.xpath("//div[@id=':84']")).click();

		// And now select last 24 hour
		WebElement last24hr = driver.findElement(By.xpath("//li[@id=':80']/div[@class='goog-menuitem-content']"));
		last24hr.click();

		WebElement siteOrDomain = driver.findElement(By.xpath("//input[@name='as_sitesearch']"));
		siteOrDomain.sendKeys("Wikipedia");

		// Click the box of terms appearing
		WebElement termsAppearing = driver.findElement(By.xpath("//div[@id=':8a']"));
		termsAppearing.click();

		// Then you see the dropdown menu and then click the relevant link you want
		WebElement inTheTitlePage = driver.findElement(By.xpath("//li[@id=':86']/div[@class='goog-menuitem-content']"));
		inTheTitlePage.click();


		WebElement safeSearchBox = driver.findElement(By.xpath("//div[@id='as_safesearch_button']"));
		safeSearchBox.click();
		driver.findElement(By.xpath("//div[contains(text(),'Filter explicit results')]")).click();

		// Select file type
		driver.findElement(By.xpath("//div[@id='as_filetype_button']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Adobe Acrobat PDF (.pdf)')]")).click();

		// Usage right box
		driver.findElement(By.xpath("//div[@id='as_rights_button']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'free to use or share, even commercially')]")).click();

		// click on ADVANCE SEARCH BUTTON
		driver.findElement(By.xpath("//input[@class='jfk-button jfk-button-action dUBGpe']")).click();

		String title = driver.getTitle();
		System.out.println(title);

		driver.quit();
		driver.close();

	}

}
