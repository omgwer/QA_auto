import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.avito.ru/rossiya/rabota");
        WebElement element = driver.findElement(By.xpath("//span[@data-marker=\"page-title/count\"]"));
        String par = element.getText();
        System.out.println(par);
    }
}
