
package Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Test2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.by/news");
        WebElement element = driver.findElement(By.xpath("//a[text()='Вход']"));
        String par = element.getText();
        String par1 = element.getCssValue("height");
        System.out.println(par);
        System.out.println(par1);

        element.click();
    }
}
