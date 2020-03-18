package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();
        //Thread.sleep();
        WebElement gender = driver.findElement(By.xpath("//input[@id='gender-female']"));
        gender.click();
        WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstname.sendKeys("Pratiksha");
        WebElement lastname = driver.findElement(By.xpath("//input[@name='LastName']"));
        lastname.sendKeys("Patel");
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("patty_appu@yahoo.co.uk");
        WebElement companyname = driver.findElement(By.xpath("//input[@id='Company'"));
        companyname.sendKeys("PQR Limited");
        WebElement password = driver.findElement(By.xpath("//input[@id=Password"));
        password.sendKeys("2810om");
        WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmpassword.sendKeys("2810om");
        WebElement registerbutton = driver.findElement(By.xpath("//input[@id='register-button']"));
        registerbutton.click();
    }

}
