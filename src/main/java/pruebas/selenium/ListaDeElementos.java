package pruebas.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ListaDeElementos {


    WebDriver driver=null;
    String baseUrl = "http://letskodeit.teachable.com/pages/practice";

    @Before
    public void setup()throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\PROYECTOS\\AUTOMATIZACION\\clienteExample\\testinExamples\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @Test
    public void testConfig(){
        driver.get(baseUrl);
        boolean isChecked = false;
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
        int size = radioButtons.size();
        System.out.println("Se encontraron:"+size+" radiobuttons");

        for(int i=0;i<size;i++){
            isChecked = radioButtons.get(i).isSelected();
            if (!isChecked){
                radioButtons.get(i).click();
                try {

                    Thread.sleep(2000);
                }catch (Exception error){
                    System.out.println("No se encuentra ninguno seleccionado");
                }

            }
        }




    }

    @After
    public void  endSetup(){

    }

}
