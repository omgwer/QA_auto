package Test3;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
            Thread.sleep(2000);
            WebElement element = driver.findElement(By.id("draggable"));
            WebElement element2 = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);

            //actions.moveToElement(element).clickAndHold().moveToElement(element2).release().build().perform();
            actions.dragAndDrop(element, element2);

            actions.moveToElement(element).pause(1000);;


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(20000);
            driver.quit();
        }


    }
}

