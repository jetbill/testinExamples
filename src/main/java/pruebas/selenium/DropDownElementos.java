package pruebas.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownElementos {

    WebDriver driver=null;
    String baseUrl = "https://letskodeit.teachable.com/p/practice";

    @Before
    public void setup()throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\PROYECTOS\\AUTOMATIZACION\\clienteExample\\testinExamples\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @Test
    public void testConfig() throws Exception{
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.id("carselect"));
        Select sel = new Select(element);

        Thread.sleep(2000);
        System.out.println("Seleccion por value");
        sel.selectByValue("benz");

        Thread.sleep(2000);
        System.out.println("Seleccion por posicion");
        sel.selectByIndex(2);

        Thread.sleep(2000);
        System.out.println("Seleccion por por texto visible");
        sel.selectByVisibleText("BMW");

        Thread.sleep(2000);
        System.out.println("lista con todas las opciones");
        List<WebElement> options = sel.getOptions();
        int size = options.size();

        for (int i=0; i<size; i++) {
            String optionName = options.get(i).getText();
            System.out.println(optionName);
        }



    }

    @After
    public void  endSetup(){

    }


}
