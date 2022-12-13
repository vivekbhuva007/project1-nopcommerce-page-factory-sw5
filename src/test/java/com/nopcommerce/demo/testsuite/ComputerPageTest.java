package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {

    ComputerPage computerPage;

    @BeforeMethod
    public void inIt() {
        computerPage = new ComputerPage();
    }


    @Test(groups = {"sanity", "regression"})

    public void verifyProductArrangeInAlphabeticalOrder() {

        computerPage.clickOnComputerTab();
        computerPage.clickOnDesktopTab();
        computerPage.clickOnPositionTab();
    }

    @Test(groups = {"smoke", "regression"})

    public void verifyProductAddedToShoppingCartSuccessFully() {
        computerPage.clickOnComputerMenu();
        computerPage.clickOnDesktopTabb();
        computerPage.clickOnPositionTabb();
        computerPage.clickOnAddToCart();
        String expectedText = "Build your own computer";
        String actualText = computerPage.verifyMessage();
        Assert.assertEquals(actualText, expectedText, "message is not displayed");
        computerPage.selectFirstOptionFromDropDown("2.2 GHz Intel Pentium Dual-Core E2200");
        computerPage.selectThirdOptionFromDropDown("8GB [+$60.00]");
        computerPage.clickOnRadioButton();
        computerPage.clickOnRadioButtonn();
        computerPage.clickOnCheckBox();
        String expectedText1 = "$1,475.00";
        String actualText1 = computerPage.verifyMessagee();
        computerPage.setClickOnAddToCartButton();
        String expectedText2 = "The product has been added to your shopping cart";
        String actualText2 = computerPage.verifyMessage1();
        Assert.assertEquals(actualText2, expectedText2, "Message not displayed");
        computerPage.clickOnCrossButton();
        computerPage.MouseHoverAndClickOnAddToCart();
        String expectedText3 = "Shopping cart";
        String actualText3 = computerPage.verifyMessage2();
        Assert.assertEquals(actualText3, expectedText3, "Message not displayed");
        computerPage.updateBasket();
        computerPage.updateOnShoppingCart();
        String expectedText4 = "$2,950.00";
        String actualText4 = computerPage.verifyMessage3();
        Assert.assertEquals(actualText4, expectedText4, "Message not displayed");
        computerPage.checkBox();
        computerPage.checkOut();
        String expectedText5 = "Welcome, Please Sign In!";
        String actualText5 = computerPage.verifyMessage4();
        Assert.assertEquals(actualText5, expectedText5, "Message not displayed");
        computerPage.checkOutAsGuesttab();
        computerPage.enterFirstName("Ganpati");
        computerPage.enterLastName("Kailash");
        computerPage.enterEmailId("ganpati@gmail.com");
        computerPage.selectCounty("United Kingdom");
        computerPage.enterCityField("London");
        computerPage.enterAddress1("10 Downing St");
        computerPage.enterzipCode("OV16 7BH");
        computerPage.enterPhoneNumber("07900 200004");
        computerPage.clickOnContinue();
        computerPage.clickOOnRadioButton();
        computerPage.clickOnContinuee();
        computerPage.clickOnButton();
        computerPage.selectCC();
        computerPage.clickCardType();
        computerPage.selectMasterC("Master card");
        computerPage.selectCardHolderName("MR G K Patel");
        computerPage.enterCardNumber("0759 2136 2156 5987");
        computerPage.clickOnExpireMonth();
        computerPage.selecttExpireMonth("04");
        computerPage.clickOnExpireYear();
        computerPage.selecttExpireYear("2026");
        computerPage.enterCardCode("859");
        computerPage.clickOnContinueee();
        String expectedText6 = "Payment Method:";
        String actualText6 = computerPage.verifyMessage5();
        Assert.assertEquals(actualText6, expectedText6, "Message not displayed");
        String expectedText7 = "Credit Card";
        String actualText7 = computerPage.verifyMessage6();
        Assert.assertEquals(actualText7, expectedText7, "Message not displayed");
        String expectedText8 = "Shipping Method:";
        String actualText8 = computerPage.verifyMessage7();
        Assert.assertEquals(actualText8, expectedText8, "Message not displayed");
        String expectedText9 = "Next Day Air";
        String actualText9 = computerPage.verifyMessage8();
        Assert.assertEquals(actualText9, expectedText9, "Message not displayed");
        String expectedText10 = "$2,950.00";
        String actualText10 = computerPage.verifyMessage9();
        Assert.assertEquals(actualText10, expectedText10, "Message not displayed");
        computerPage.clickOnConfirm();
        String expectedText11 = "Thank you";
        String actualText11 = computerPage.verifyMessage10();
        Assert.assertEquals(actualText11, expectedText11, "Message not displayed");
        String expectedText12 = "Your order has been successfully processed!";
        String actualText12 = computerPage.verifyMessage11();
        Assert.assertEquals(actualText12, expectedText12, "Message not displayed");
        computerPage.clickOnConttinue();
        String expectedText13 = "Welcome to our store";
        String actualText13 = computerPage.verifyMessage12();
        Assert.assertEquals(actualText13, expectedText13, "Message not displayed");

    }
}



