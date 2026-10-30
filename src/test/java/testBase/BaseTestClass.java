package testBase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTestClass {

    public WebDriver driver;
    public Logger logger;
    public Properties p;

    @BeforeClass
    @Parameters({"browser"})
    public void setUp(String br) throws IOException {

        logger= LogManager.getLogger(this.getClass());

        //fetching browser through xml at runtime
        switch (br.toLowerCase()){
            case "chrome" : driver = new ChromeDriver();
            case "edge" : driver = new EdgeDriver();
            default : System.out.println("Invalid browser");
        }

        //loading properties file to get url
        FileReader file = new FileReader("src/test/resources/config.properties");
        p = new Properties();
        p.load(file);

        driver.manage().window().maximize();
        driver.get(p.getProperty("appURL"));   //reading url from properties file
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
