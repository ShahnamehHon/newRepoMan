//Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class New1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void new1() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1296, 696));
    driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
    driver.findElement(By.name("q")).sendKeys("freecodecamp");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("div:nth-child(2) > .rc .LC20lb")).click();
    driver.findElement(By.id("fcc_instantsearch")).click();
    driver.findElement(By.id("fcc_instantsearch")).sendKeys("Selenium - Web Browser AutomaAion");
    driver.findElement(By.id("fcc_instantsearch")).sendKeys(Keys.ENTER);
    driver.findElement(By.linkText("A recipe for website automated tests with Python Selenium & Headless Chrome in Docker")).click();
    driver.findElement(By.linkText("Github repo")).click();
  }
}
