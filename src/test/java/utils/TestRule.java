package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import core.DriverFactory;
import io.qameta.allure.Attachment;

public class TestRule {

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            saveScreenshotPNG(DriverFactory.getDriver());
        }
        DriverFactory.quitDriver();
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}

