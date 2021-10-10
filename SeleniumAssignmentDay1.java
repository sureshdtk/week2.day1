package week2.day1.assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignmentDay1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(2000);
		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("Demosalesmanager");
		WebElement eleUsername1 = driver.findElement(By.id("password"));
		eleUsername1.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SGS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suresh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		Select dropdown = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
        dropdown.selectByVisibleText("Cold Call");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Suresh Kumar");
        driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("R");
        driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
        driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("6/9/83");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Manager");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
        driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
        driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
        driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("ABC");
        driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("LIBOR");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Details");
        driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("IMP");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("00000000");
        driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("23");
        driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Mobile");
        driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("11");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suresh@abc.com");
        driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Suresh");
        driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("R");
        driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Chennai");
        driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Villivakkam");
       driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
       Select dropdown1 = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
       dropdown1.selectByVisibleText("Alabama");
        driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("49");
        driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("23");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.findElement(By.id("sectionHeaderTitle_leads")).getText());
		System.out.println(driver.findElement(By.id("viewLead_firstNameLocal_sp")).getText());
		
	}

}
