package com.testwithnoor.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ElementInteraction {

    @Test
    public void ElementInteractionAndFormSubmission(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
