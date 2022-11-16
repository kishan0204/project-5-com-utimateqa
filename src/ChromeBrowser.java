import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {

        //1. Setup chrome browser
        String baseURl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("Webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //2. Open URL
        driver.get(baseURl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        //3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("page title is"+ title);

        //4. Print the current url
        System.out.println("Current URL:"+ driver.getCurrentUrl());

        //5. Print the page source
        System.out.println("page source"+ driver.getPageSource());

        //6. Enter the email to email field
        WebElement emailField = driver.findElement(By.name("user[email]"));
        emailField.sendKeys("kishan_0204@yahoo.co.in");

        //7. Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("123456789");


        //8. Close the browser
        driver.quit();
    }

}
