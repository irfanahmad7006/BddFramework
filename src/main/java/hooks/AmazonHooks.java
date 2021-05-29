package hooks;

import io.cucumber.java.*;

public class AmazonHooks {
    @Before("@Smoke")
    public void setUpBrowser(Scenario scenarioName){
        System.out.println("Launch chrome browser");
        System.out.println(scenarioName.getName());
//        System.out.println(scenarioName.getId());
//        System.out.println(scenarioName.getStatus());

    }
    @Before(order = 2)
    public void setUpURL(){
        System.out.println("launch URL");
    }

    @After(order = 2)
    public void tearDownClose(){
        System.out.println("Close the browser");
    }
    @After("@Smoke")
    public void tearDownLogout(){
        System.out.println("logout the application");
    }

    @BeforeStep
    public void takeScreenshot(){
        System.out.println("Take the screenshot");
    }
    @AfterStep
    public void refreshThePage(){
        System.out.println("Refresh the page");
    }
}
