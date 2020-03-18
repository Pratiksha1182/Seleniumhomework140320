package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {
    public static void main(String[] args) {
        String baseUrl = "https://timesofindia.indiatimes.com/poll.cms";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        WebElement yesradiobutton = driver.findElement(By.xpath("//input[@class=\"radio1\"]"));
        yesradiobutton.click();
        WebElement userans = driver.findElement(By.xpath("//span[@id=\"mathq2\"]"));
        userans.sendKeys("");
    }
}
