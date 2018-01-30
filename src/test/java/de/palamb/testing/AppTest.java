package de.palamb.testing;

import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
    
    private WebDriver driver;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        setupWebdriver();
    }
    
    private void setupWebdriver(){
        java.io.File file = new java.io.File("");
        String chromeDriverPath = file.getAbsolutePath() + "\\chromedriver.exe";
        System.out.println(chromeDriverPath);
	System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        this.driver = new ChromeDriver();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        this.driver.get("https://www.google.de");
        assertTrue( true );
        this.driver.close();
    }
}
