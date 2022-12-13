package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


import java.util.List;

public class HomePage extends Utility {



    @CacheLookup
    @FindBys(@FindBy(xpath = "//ul[@class = 'top-menu notmobile']/li"))
    List<WebElement> topMenu;
    static String menu;

    public String selectMenu(String menu) {

        this.menu = menu;
        List<WebElement> topMenuList = topMenu;
        try {
            for (WebElement element : topMenu) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            //   topMenuList = driver.findElements(By.xpath("//ul[@class = 'top-menu notmobile']/li"));
            topMenuList = topMenu;
        }
        //  Reporter.log("click on passed menu option" + selectMenu(menu));

        return getTextFromElement(By.xpath("//h1[contains(text()," + "'" + menu + "')]"));
    }
}