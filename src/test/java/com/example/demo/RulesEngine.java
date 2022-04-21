package com.example.demo;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static java.lang.Thread.sleep;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class RulesEngine {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\chromedriver.exe");
    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("incognito");
    options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
    capabilities.setCapability(ChromeOptions.CAPABILITY, options);

    driver = new ChromeDriver(capabilities);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();

  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void da() throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, 10000);

    // Test name: da
    // Step # | name | target | value | comment
    // 1 | open | https://xtime.grpassu.fr/ |  | 
    driver.get("https://xtime.grpassu.fr/");
    // 2 | setWindowSize | 945x1020 |  | 
    driver.manage().window().setSize(new Dimension(945, 1020));
    wait.until(ExpectedConditions.elementToBeClickable(By.id("SAISIE1")));

    // 3 | click | id=SAISIE1 |  | 
    driver.findElement(By.id("SAISIE1")).click();
    // 4 | type | id=SAISIE1 | aelamraoui | 
    driver.findElement(By.id("SAISIE1")).sendKeys("aelamraoui");
    // 5 | type | id=SAISIE2 | 0 |
    wait.until(ExpectedConditions.elementToBeClickable(By.id("SAISIE2")));

    driver.findElement(By.id("SAISIE2")).sendKeys("0");
    wait.until(ExpectedConditions.elementToBeClickable(By.id("BTN_CNX")));

    // 6 | click | id=BTN_CNX |  | 
    driver.findElement(By.id("BTN_CNX")).click();
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("-------------------------------------------------------------------------------------------------------------pass");
    // 7 | click | id=BTN_BADGER |  |
    wait.until(ExpectedConditions.elementToBeClickable(By.id("BTN_BADGER")));

    driver.findElement(By.id("BTN_BADGER")).click();
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.switchTo().alert().accept();
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    //Declare and initialise a fluent wait

//Specify the timout of the wait
    driver.close();
  }
}
