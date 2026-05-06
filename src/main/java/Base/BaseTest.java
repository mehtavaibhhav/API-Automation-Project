package Base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import Utils1.ConfigReader;

public class BaseTest {

    @BeforeClass
    public void setup() 
    {
    	System.out.println("===before successful===");
        RestAssured.baseURI = ConfigReader.getProperty("base.url");
        System.out.println("URl launch successful==="+ RestAssured.baseURI);
        System.out.println("===after 2 successful===");
        
    }
}