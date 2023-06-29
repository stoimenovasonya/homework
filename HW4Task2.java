import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class HW4Task2 {
    private static WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://pragmatic.bg/automation/lecture13/Config.html");

    }
    @Test
    public void actionsExercise() {
        WebElement airbags = driver.findElement(By.xpath("//input[@value='Airbags']"));
        WebElement parkingSensor = driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/p[3]/input[3]"));

        if (!airbags.isSelected())
            airbags.click();

        if (!parkingSensor.isSelected())
            parkingSensor.click();
        assertTrue(airbags.isSelected());
        assertTrue(parkingSensor.isSelected());

    }
}
