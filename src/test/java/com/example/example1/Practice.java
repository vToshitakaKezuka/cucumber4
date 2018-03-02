package com.example.example1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.Yahoo;

public class Practice {
  private static WebDriver driver;
private Yahoo yah;

//  @BeforeClass
//  public static void BeforeClass() {
//	 // chrome起動
//	 System.setProperty("webdriver.chrome.driver", "C:\\pleiades\\workspace\\webdriver\\chromedriver.exe");
//	 driver = new ChromeDriver();
//  }
//  
//  @Test
//  public void test01(){
//
//
//    // yahoo表示
//    driver.get("https://www.yahoo.co.jp/");
//
//    // アサートを出す
//    // assertThat("Yahooのホームページが表示されること", driver.getTitle(), is("Yahoo! JAPA"));
//    Yahoo yah = new Yahoo(driver);
//    assertThat("Yahooのホームページが表示されること" , yah.getPageTitle(), is("Yahoo! JAPAN"));
//
//    // 検索文字入力
//    // driver.findElement(By.id("srchtxt")).sendKeys("ベリサーブ");
//    yah.sendSrchTxt("ベリサーブ");
//
//    // 検索ボタンをクリック
//    // driver.findElement(By.id("srchbtn")).click();
//    yah.clickSrchBtn();
//
//    // chrome閉じる
////    driver.close();
//  }
//  
//  @AfterClass
//  public static void afterClass(){
//	  driver.close();
//  }
  
  @Given("^Chromeを起動$")
  public void chromeを起動() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "C:\\pleiades\\workspace\\webdriver\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @Then("^Yahooのページを開く$")
  public void yahooのページを開く() throws Throwable {
	  driver.get("https://www.yahoo.co.jp/");
  }

  @Then("^Yahooのページが表示される$")
  public void yahooのページが表示される() throws Throwable {
	  Yahoo yah = new Yahoo(driver);
	  assertThat("Yahooのホームページが表示されること" , yah.getPageTitle(), is("Yahoo! JAPAN"));
  }

  @When("^検索に\"([^\"]*)\"を入力する$")
  public void 検索に_を入力する(String arg1) throws Throwable {
	  Yahoo yah = new Yahoo(driver);
	  yah.sendSrchTxt(arg1);

  }

  @When("^検索ボタンをクリックする$")
  public void 検索ボタンをクリックする() throws Throwable {
	  Yahoo yah = new Yahoo(driver);
     yah.clickSrchBtn();
  }

  @Then("^Chromeを閉じる$")
  public void chromeを閉じる() throws Throwable {
	  driver.close();
  }
}
