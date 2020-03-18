package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Exercise1 {
    public static void main(String [] args){
        String baseUrl = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        WebElement search = driver.findElement(By.xpath("//input[@title='Search'"));

        search.click();

        WebElement GoogleSearch = driver.findElement(By.name("q"));

        GoogleSearch.sendKeys(new String[]{"nopCommerce demo store"});
        GoogleSearch.submit();
        WebElement nopcommerce = driver.findElement(By.xpath("//h3[@class=\"LC20lbDKV0Md\"]"));
        nopcommerce.click();

        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (int i = 1; i<=links.size(); i=i+1) {
            System.out.println(links.get(i).getText());
        }
    }
}


