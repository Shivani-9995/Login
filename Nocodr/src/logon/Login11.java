// Import necessary Selenium WebDriver and other dependencies

package logon;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Login11 
{

    public static void main(String[] args) throws InterruptedException 
    {

        // Set path for the EdgeDriver executable
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\New Guest\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        // Optional: Set Edge options (e.g., headless mode)
        EdgeOptions options = new EdgeOptions();
        options.addArguments("start-maximized");  // Open browser in maximized window
        // options.addArguments("headless"); // Uncomment this line to run in headless mode

        // Initialize the Edge WebDriver with options
        WebDriver driver = new EdgeDriver(options);

       
            // Navigate to the noKodr platform
            driver.get("https://app-staging.nokodr.com/");

            // Perform additional actions (optional)
            System.out.println("Page Title: " + driver.getTitle());

            // Pause for a moment to see the result (optional)
            WebElement signUpLink = driver.findElement(By.xpath ("/html/body/app-root/login/abx-auth-container/div/div[2]/div/abx-login/div/div[5]/div/a"));
            signUpLink.click();
           // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            //WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_17365066911514914"))); // Replace with correct popup ID

            //Thread.sleep(5000);
            WebElement emailField = driver.findElement(By.xpath("/html/body/abx-modal/section/div/div/abx-sign-up/div/div/div[2]/span/abx-tabs/div/div/abx-tab[1]/div/div/abx-form/div/div/abx-container/div/div/div/span[1]/abx-layout-item/div/abx-field/div/div/div/div[1]/abx-email/input")); // Use the correct ID or locator
            emailField.sendKeys("shankarsheteshivani@gmail.com");
            
            WebElement checkBox = driver.findElement(By.xpath("/html/body/abx-modal/section/div/div/abx-sign-up/div/div/div[2]/span/abx-tabs/div/div/abx-tab[1]/div/div/abx-form/div/div/abx-container/div/div/div/span[2]/abx-layout-item/div/abx-field/div/div/div/div[1]/abx-checkbox/div/label/span")); // Replace with actual checkbox ID
            if (!checkBox.isSelected()) {
                checkBox.click();  // Check the box if it's not already selected
            }

            // Locate and click the "Proceed" button within the popup
            WebElement proceedButton = driver.findElement(By.xpath("/html/body/abx-modal/section/div/div/abx-sign-up/div/div/div[2]/span/div[2]/abx-button/button")); // Replace with actual button ID
            proceedButton.click();
            Thread.sleep(150000);
            WebElement verifybtn = driver.findElement(By.xpath("/html/body/abx-modal/section/div/div/verification-code/div/div[2]/div/abx-button/button"));
            verifybtn.click()	;
            
            
            WebElement firstname = driver.findElement(By.id("id_17365093771526452"));
           firstname.sendKeys("Shivani");
            WebElement lastname = driver.findElement(By.id("id_17365093771537108")); 
            WebElement passwordField = driver.findElement(By.id("id_17365093771547041")); // Replace with actual password field ID
            WebElement confirmPasswordField = driver.findElement(By.id("id_17365093771547041-confirmpassword")); // Replace with actual confirm password field ID
            
            

        
    }
}
