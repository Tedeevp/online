package ru.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.bg.И;
import org.apache.commons.logging.impl.SimpleLog;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.common.AFT;
import ru.pages.Autoriz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import static ru.pages.Autoriz.*;
import static ru.pages.Autoriz.getWebDriver;

public class Find {



    public Find(){
        PageFactory.initElements(getWebDriver(),this);
    }

    @И("^авторизуюсь под \"([^\"]*)\" и паролем \"([^\"]*)\"$")
    public void efefef(String arg0, String arg1){
    new Autoriz().getStart();
    }

    @cucumber.api.java.ru.И("^нажимаем кнопку поиск$")
    public void нажимаемКнопкуПоиск() throws Throwable {
         new AFT().findButton.click();
        System.out.println("fef- "+new AFT().findButton.getText());
    }

    @И("^выцепляем id$")
    public void выцепляемId() throws Throwable {
        String ert;
        String stats;
        Thread.sleep(2000);
        ArrayList<WebElement> webElements = (ArrayList<WebElement>) getWebDriver().findElements(By.xpath("//div[@class='b-tile__item-slot']/a"));
        System.out.println("fff - "+webElements.size());
      for (int i = 1;i!=5;i++) {//webElements.size(
          System.out.println(webElements.get(i).getAttribute("href"));
          Thread.sleep(2000);
          ert = webElements.get(i).getAttribute("href");
          ert= ert.toString();
          ert=ert.substring(23,33);
          System.out.println("ert- "+ert);
          getWebDriver().navigate().to("https://love.mail.ru/my/message.phtml?uid="+ert);
          try {
              stats = getWebDriver().findElement(By.xpath("//li[@class='my-msg simple-msg  clearFix']//p")).getText();
              System.out.println("stats - "+stats);
              System.out.println("смс есть");
          }catch (Exception  e){
             // System.out.println("смс Нету");
              break;

              //getWebDriver().findElement(By.id("f_message")).sendKeys("Привет, как проходит день, что делаешь?)");
             // getWebDriver().findElement(By.id("f_message")).sendKeys(Keys.ENTER);

          }continue;

      }

    }


}
