package seleDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rcdemo {

    public static void bose(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette", "./geckodriver.exe");
    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    	
    	//WebDriver driver = new FirefoxDriver();
    	WebDriver driver=new ChromeDriver();
        String baseUrl = "http://fullintel.com/login";
        driver.manage().window().maximize();
        String expectedTitle = "FullIntel - Login";
        String actualTitle = "";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
        String currentUrl;
        currentUrl = driver.getCurrentUrl();
        System.out.println("Current Version is : "+currentUrl);
        // get the actual value of the title
        actualTitle = driver.getTitle();
        
        /*
         * compare the actual title of the page witht the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Firefox
        driver.close();
       
        // exit the program explicitly
        System.exit(0);
    }

}