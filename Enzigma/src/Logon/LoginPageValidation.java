package Logon;



import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.edge.EdgeOptions;


	public class LoginPageValidation {

	    public static void main(String[] args) 
	    {

	    	System.setProperty("webdriver.edge.driver", "C:\\Users\\New Guest\\Downloads\\edgedriver_win64\\msedgedriver.exe");

	        
	        EdgeOptions options = new EdgeOptions();

	        
	        WebDriver driver = new EdgeDriver(options);

	        driver.get("https://app-staging.nokodr.com/");
	        WebElement emailid = driver.findElement(By.xpath("/html/body/app-root/login/abx-auth-container/div/div[2]/div/abx-login/div/abx-tabs/div/div/abx-tab[1]/div/div/abx-tabs/div/div/abx-tab[1]/div/div/abx-form/div/div/abx-container/div/div/div/span[1]/abx-layout-item/div/abx-field/div/div/div/div[1]/abx-email/input"));
            emailid.sendKeys("shivanishankarshete@gmail.com");
           WebElement password = driver.findElement(By.xpath("/html/body/app-root/login/abx-auth-container/div/div[2]/div/abx-login/div/abx-tabs/div/div/abx-tab[1]/div/div/abx-tabs/div/div/abx-tab[1]/div/div/abx-form/div/div/abx-container/div/div/div/span[2]/abx-layout-item/div/abx-field/div/div/div/div[1]/abx-password/div/div/input"));
           password.sendKeys("Shivani@123");
           WebElement loginbtn = driver.findElement(By.xpath("/html/body/app-root/login/abx-auth-container/div/div[2]/div/abx-login/div/div[2]/abx-button/button"));
           loginbtn.click();
           
           
	    }

}
