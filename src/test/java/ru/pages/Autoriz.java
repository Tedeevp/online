package ru.pages;



//import com.sun.deploy.services.Service;
//import com.sun.xml.internal.ws.wsdl.writer.document.Service;
//import com.google.common.util.concurrent.Service;
import com.google.common.util.concurrent.Service;
import org.omg.CORBA.Object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.support.pagefactory.FieldDecorator;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Autoriz {
    private static WebDriver webDriver;
    InternetExplorerDriverService service;
    //fefewfewf

    public static String getUrl() {
        return url;
    }

    private static String url;

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        Autoriz.webDriver = webDriver;
    }

    //fefewfewf
    public Autoriz(){
       // getUsers();

    }

    public void  getStart(){
        System.out.println("ehk - " +getUrl());
        System.setProperty("webdriver.ie.driver", "C:/Users/Петрик/IdeaProjects/Online/src/test/resources/webdriver/IEDriverServer.exe");
        webDriver = new InternetExplorerDriver();
        webDriver.navigate().to("https://love.mail.ru/search.phtml?rl=1&from_item=1");
        service= InternetExplorerDriverService.createDefaultService();
    }

    public static void getUsers(){

    Properties properties = new Properties();
        try {
          ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream stream = classLoader.getResourceAsStream("users.properties");
            properties.load(stream);
            url=properties.getProperty("url");
        }catch(Exception e){
       e.printStackTrace();
    }
    }
    //fefewfewf  
 public static void initElements(FieldDecorator decorator, Object page){
        org.openqa.selenium.support.PageFactory.initElements(decorator,page);
 }

@cucumber.api.java.After()
    public  void driverClose(){
   // webDriver.quit();
    }
}
