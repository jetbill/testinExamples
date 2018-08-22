package pruebas.selenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class Testing {
    WebDriver driver=null;
    String baseUrl=null;

    @Before
    public void setup()throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\PROYECTOS\\AUTOMATIZACION\\clienteExample\\testinExamples\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl ="http://www.google.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @Test
    public void testConfig(){
        driver.get(baseUrl);

    }

    @After
    public void  endSetup(){

    }

}
