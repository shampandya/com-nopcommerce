package project1;
/**
 * Project-1 - ProjectName : com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demo.nopcommerce.com/login?returnUrl=
 * %2F”
 * 7. Print the current url.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current url.
 * 11. Refresh the page.
 * 12. Enter the email to email field.
 * 13. Enter the password to password field.
 * 14. Click on Login Button.
 * 15. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Com_NopCommerce {

        // we need to create object of driver
        static String browser = "Chrome";    // just change the browser name here to edge or firefox it will open in that browser coz we have written if else
        static String baseUrl = "https://demo.nopcommerce.com/";
        static WebDriver driver;

        public static void main(String[] args) {
            if(browser.equalsIgnoreCase("Chrome")){
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("FireFox")){
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("Edge")){
                driver = new EdgeDriver();
            }else{
                System.out.println("Wrong browser name");
            }
            driver.get(baseUrl);  // open url

            System.out.println(driver.getTitle()); // print the title of the page
            System.out.println(driver.getCurrentUrl()); // print the current url
            System.out.println(driver.getPageSource()); // print the page source
            driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F"); // navigate to given url
            System.out.println(driver.getCurrentUrl()); // get current url
            driver.navigate().back(); // navigate back to homepage
            driver.navigate().forward(); // navigate forward to login page
            System.out.println(driver.getCurrentUrl()); // print current url
            driver.navigate().refresh();  // refresh the page
            driver.findElement(By.id("Email")).sendKeys("prime.testing@gmail.com");  // find email element and add email in email field
            driver.findElement(By.name("Password")).sendKeys("123456"); // find password element and enter password automatically
            driver.findElement(By.className("button-1 login-button")).click();  // click on login button
            driver.quit(); // close the browser
    }
}
