package com.automationpractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class RegistTest extends TestBase{
    @Test
    public void Login() throws InterruptedException {
        clickLoginLink();
        AccCreation();
        fillLoginFrom("Raf", "M", 16);
        pause(10000);

    }


    @AfterSuite
    public void tearDown(){
        wd.quit();
    }
}

