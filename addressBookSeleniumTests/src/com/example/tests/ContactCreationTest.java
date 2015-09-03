package com.example.tests;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactCreationTest extends TestBase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
	goToMainPage();
    driver.findElement(By.linkText("add new")).click();
    driver.findElement(By.name("firstname")).clear();
    driver.findElement(By.name("firstname")).sendKeys("Anya");
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys("Durov");
    driver.findElement(By.name("address")).clear();
    driver.findElement(By.name("address")).sendKeys("Moscow,lenina 12");
    driver.findElement(By.name("home")).clear();
    driver.findElement(By.name("home")).sendKeys("495 386 12 46");
    driver.findElement(By.name("mobile")).clear();
    driver.findElement(By.name("mobile")).sendKeys("+79131177777");
    driver.findElement(By.name("work")).clear();
    driver.findElement(By.name("work")).sendKeys("+74951188888");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("AnyaDurov@gmail.com");
    driver.findElement(By.name("email2")).clear();
    driver.findElement(By.name("email2")).sendKeys("AnyaDurov@gmail.com");
    new Select(driver.findElement(By.name("bday"))).selectByVisibleText("19");
    new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText("April");
    driver.findElement(By.name("byear")).clear();
    driver.findElement(By.name("byear")).sendKeys("1986");
    new Select(driver.findElement(By.name("new_group"))).selectByVisibleText("group name1");
    driver.findElement(By.name("address2")).clear();
    driver.findElement(By.name("address2")).sendKeys("Moscoq");
    driver.findElement(By.name("phone2")).clear();
    driver.findElement(By.name("phone2")).sendKeys("Trom");
    driver.findElement(By.name("submit")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
