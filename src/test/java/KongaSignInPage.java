import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;

public class KongaSignInPage {
 private WebDriver driver;



    @Test
 public void start() throws InterruptedException {
   //locate where the chromedriver is
    System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

    driver = new ChromeDriver();
    //Open your app URL (https://www.konga.com)
    driver.get("https://www.konga.com/");


    if (driver.getCurrentUrl().contains("https://www.konga.com/"))
      //Pass
      System.out.println("Valid webpage");
    else
      //Fail
      System.out.println("Invalid webpage");

    //Maximize the window
    driver.manage().window().maximize();

    //Maximize the window
    driver.manage().window().maximize();
    Thread.sleep(5000);


    //@Test (priority = 0)
    //public void successfullLogin() throws InterruptedException {
   //Click on the Signin/login button
    driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();

    //Input your email address
    driver.findElement(By.id("username")).sendKeys("ara@malinator.com");

    //Input your password
    driver.findElement(By.id("password")).sendKeys("admin09");

    // Click on the login
    driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
    Thread.sleep(5000);

  //public void logout() throws InterruptedException {

    driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div[1]/div/div/div[4]/div/a/span")).click();

    Thread.sleep(5000);

    driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/div/ul/li[7]/a")).click();

  }

 }
