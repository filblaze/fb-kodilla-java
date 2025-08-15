package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES = "//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div/div[3]/div[2]/div/div/div[2]";
    public static final String XPATH_COOKIES2 = "//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div/div[3]/div[2]/div/div[1]/div[2]/div/div[1]/div/span/span";
    public static final String XPATH_CREATE_ACCOUNT = "//*[@id=\"facebook\"]/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a";
    public static final String XPATH_DAY = "//*[@id=\"birthday_wrapper\"]/div/span/span/select[1]";
    public static final String XPATH_MONTH = "//*[@id=\"birthday_wrapper\"]/div/span/span/select[2]";
    public static final String XPATH_YEAR = "//*[@id=\"birthday_wrapper\"]/div/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT)).click();
        driver.findElement(By.xpath(XPATH_COOKIES2)).click();

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDayBoard = new Select(selectDay);
        selectDayBoard.selectByIndex(13);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonthBoard = new Select(selectMonth);
        selectMonthBoard.selectByIndex(6);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYearBoard = new Select(selectYear);
        selectYearBoard.selectByIndex(61);
    }
}
