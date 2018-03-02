package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yahoo {
    private WebDriver driver;
        
    // webelementの定義
    // テキストボックス
    @FindBy(id = "srchtxt")
    private WebElement srchtxt;
    
    
    // ボタン
    @FindBy(id = "srchbtn")
    private WebElement srchbtn;
    

    public Yahoo(WebDriver driver){
      this.driver = driver;
      PageFactory.initElements(this.driver, this);
    }

    // ページタイトル取得する
    public String getPageTitle(){
      return driver.getTitle();
    }

    // 検索文字を入力する
    public void sendSrchTxt(String word){
      srchtxt.sendKeys(word);
    }

    // 検索ボタンをクリックする
    public void clickSrchBtn(){
      srchbtn.click();
    }

}