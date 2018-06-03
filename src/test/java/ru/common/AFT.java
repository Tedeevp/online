package ru.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.pages.Autoriz;

import static ru.pages.Autoriz.*;

public class AFT {

//  @FindBy(xpath = "//span[contains(text(),'Знакомства')]")
    @FindBy(xpath = "//a[@href='https://love.mail.ru/search.phtml?rl=1&from_item=1']")
    public WebElement findButton;

    @FindBy(xpath = "//a[@href='https://love.mail.ru/search.phtml?rl=1&from_item=1']")
    public WebElement write;

    public AFT(){
        PageFactory.initElements(getWebDriver(),this);
    }


}
