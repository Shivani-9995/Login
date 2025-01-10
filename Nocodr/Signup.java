// Import necessary Selenium WebDriver and other dependencies

package logon;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Signup 
{

    public static void main(String[] args) throws InterruptedException 
    {

    	System.setProperty("webdriver.edge.driver", "C:\\Users\\New Guest\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        EdgeOptions options = new EdgeOptions();
        options.addArguments("start-maximized");  

        WebDriver driver = new EdgeDriver(options);

       
            driver.get("https://app-staging.nokodr.com/");

            WebElement signUpLink = driver.findElement(By.xpath ("/html/body/app-root/login/abx-auth-container/div/div[2]/div/abx-login/div/div[5]/div/a"));
            signUpLink.click();
           
            WebElement emailField = driver.findElement(By.xpath("/html/body/abx-modal/section/div/div/abx-sign-up/div/div/div[2]/span/abx-tabs/div/div/abx-tab[1]/div/div/abx-form/div/div/abx-container/div/div/div/span[1]/abx-layout-item/div/abx-field/div/div/div/div[1]/abx-email/input")); // Use the correct ID or locator
            emailField.sendKeys("shankarsheteshivani@gmail.com");
            
            WebElement checkBox = driver.findElement(By.xpath("/html/body/abx-modal/section/div/div/abx-sign-up/div/div/div[2]/span/abx-tabs/div/div/abx-tab[1]/div/div/abx-form/div/div/abx-container/div/div/div/span[2]/abx-layout-item/div/abx-field/div/div/div/div[1]/abx-checkbox/div/label/span")); // Replace with actual checkbox ID
            if (!checkBox.isSelected()) {
                checkBox.click();  
            }

           
            WebElement proceedButton = driver.findElement(By.xpath("/html/body/abx-modal/section/div/div/abx-sign-up/div/div/div[2]/span/div[2]/abx-button/button")); // Replace with actual button ID
            proceedButton.click();
            Thread.sleep(150000);
            WebElement verifybtn = driver.findElement(By.xpath("/html/body/abx-modal/section/div/div/verification-code/div/div[2]/div/abx-button/button"));
            verifybtn.click()	;
            
            
            WebElement firstname = driver.findElement(By.id("id_17365093771526452"));
             firstname.sendKeys("Shivani");
            WebElement lastname = driver.findElement(By.id("id_17365093771537108"));
            lastname.sendKeys("Shete");
            WebElement passwordField = driver.findElement(By.id("id_17365093771547041")); 
            passwordField.sendKeys("Shivani123");
            WebElement confirmPasswordField = driver.findElement(By.id("id_17365093771547041-confirmpassword"));
            confirmPasswordField.sendKeys("Shivani123");

            
            

        
    }
}
