package lambda_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class test1 {
    //go with test annotation @TEST
    @Test()
    public void TC_01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.lambdatest.com/selenium-playground");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement input=driver.findElement(By.xpath("//a[contains(text(),'Input Form Submit')]"));
        input.click();
        WebElement name =driver.findElement(By.cssSelector("#name"));
        Thread.sleep(2000);
        name.sendKeys("Temugen");
        WebElement email=driver.findElement(By.xpath("//input[@id='inputEmail4']"));
        email.sendKeys("temugent1@gmail.com");
        WebElement pass=driver.findElement(By.xpath("//input[@id='inputPassword4']"));
        pass.sendKeys("Temugen0705");
        WebElement company=driver.findElement(By.xpath("//input[@id='company']"));
        company.sendKeys("CodeFish");
        WebElement website=driver.findElement(By.xpath("//input[@id='websitename']"));
        website.sendKeys("https://www.lambdatest.com/selenium-playground");
        WebElement country=driver.findElement(By.xpath("//option[@value='US']"));
        country.click();
        WebElement city=driver.findElement(By.xpath("//input[@id='inputCity']"));
        city.sendKeys("Chicago");
        WebElement address=driver.findElement(By.xpath("//input[@id='inputAddress1']"));
        address.sendKeys("123 main Street");
        WebElement address2=driver.findElement(By.xpath("//input[@id='inputAddress2']"));
        address2.sendKeys("321 main Street");
        WebElement state=driver.findElement(By.xpath("//input[@id='inputState']"));
        state.sendKeys("IL");
        WebElement zipcode=driver.findElement(By.xpath("//input[@id='inputZip']"));
        zipcode.sendKeys("60111");
        WebElement submit=driver.findElement(By.cssSelector(".btn-dark"));
        submit.click();
        WebElement confirmations=driver.findElement(By.xpath("//p[@class='success-msg hidden']"));














    }
}
