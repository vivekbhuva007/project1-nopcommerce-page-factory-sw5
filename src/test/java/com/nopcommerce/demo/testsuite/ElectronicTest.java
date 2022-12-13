package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)


public class ElectronicTest extends BaseTest {
    ElectronicsPage electronicsPage;

    @BeforeMethod
    public void inIt() {
        electronicsPage = new ElectronicsPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void TestNameVerifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        electronicsPage.electronicsPage();
        electronicsPage.electronicsPage();
        electronicsPage.setMouseHooverOnCellPhone();
        String expectedMessage = "Cell phones";
        Assert.assertEquals(electronicsPage.cellPhone(), expectedMessage, "Message is not displayed");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        electronicsPage.electronicsPage();
        electronicsPage.electronicsPage();
        electronicsPage.setMouseHooverOnCellPhone();
        String expectedMessage = "Cell phones";
        Assert.assertEquals(electronicsPage.cellPhone(), expectedMessage, "Message is not displayed");
        electronicsPage.listView();
        electronicsPage.nokiaLumia();
        String expectedMessage2 = "Nokia Lumia 1020";
        Assert.assertEquals(electronicsPage.nokiaLumia1(), expectedMessage2, "Message is not displayed");
        String expectedMessage3 = "$349.00";
        Assert.assertEquals(electronicsPage.verifyText1$349(), expectedMessage3, "Message is not displayed");
        electronicsPage.changeQuntity1();
        electronicsPage.addToCart();
        String expectedMessage4 = "The product has been added to your shopping cart";
        Assert.assertEquals(electronicsPage.message1(), expectedMessage4, "Message is not displayed");
        electronicsPage.closeButton();
        electronicsPage.clickOnShoppingCart();
        String expectedMessage5 = "Shopping cart";
        Assert.assertEquals(electronicsPage.verifyShoppingCart(), expectedMessage5);
        String expectedMessage6 = "$698.00";
        Assert.assertEquals(electronicsPage.totalText698(), expectedMessage6);
        electronicsPage.checkBox();
        electronicsPage.checkOut();
        String expectedMessage7 = "Welcome, Please Sign In!";
        Assert.assertEquals(electronicsPage.welcomeMessage1(), expectedMessage7);
        electronicsPage.registerTab();
        String expectedMessage8 = "Register";
        Assert.assertEquals(electronicsPage.registerText(), expectedMessage8);
        electronicsPage.clickOnRadioButton();
        electronicsPage.enterFirstname("Prime");
        electronicsPage.enterLastname("Testing");
        electronicsPage.enterEmail1("test12@gmail.com");
        electronicsPage.enterPassword("william123");
        electronicsPage.enterConfirmPassword("william123");
        Thread.sleep(500);
        electronicsPage.registerButton1();
        String expectedText0 = "Your registration completed";
        String actualText0 = electronicsPage.verifyMessaage();
        Assert.assertEquals(actualText0, expectedText0, "Message not displayed");
        electronicsPage.continueB();
        String expectedMessage10 = "Shopping cart";
        Assert.assertEquals(electronicsPage.shoppingCart1(), expectedMessage10);
        electronicsPage.setCheckBox2();
        electronicsPage.checkout3();
        electronicsPage.enterCountry("United Kingdom");
        electronicsPage.enterCity("London");
        electronicsPage.enterAddress1("50 high RD");
        electronicsPage.enterZipPostalCode("Wd10 5td");
        electronicsPage.enterPhoneNumber("0700400700");
        electronicsPage.continue3();
        electronicsPage.setRadiobutton1();
        electronicsPage.continue4();
        electronicsPage.setRadiobutton2();
        electronicsPage.paymentMethodButton();
        electronicsPage.selectCreditCard("Visa");
        electronicsPage.selectCardHolderName("xyz");
        electronicsPage.enterCardNumber("3252 7814 7648 5333");
        electronicsPage.selecttExpireMonth("01");
        electronicsPage.selecttExpireYear("2030");
        electronicsPage.enterCardCode("111");
        electronicsPage.clickOnCheckOut();
        String expectedText1 = "Credit Card";
        String actualText1 = electronicsPage.verifyMessage1();
        Assert.assertEquals(actualText1, expectedText1, "Message not displayed");
        String expectedText2 = "2nd Day Air";
        String actualText2 = electronicsPage.verifyMessage2();
        Assert.assertEquals(actualText2, expectedText2, "Message not displayed");
        String expectedText3 = "$698.00";
        String actualText3 = electronicsPage.verifyMessage3();
        Assert.assertEquals(actualText3, expectedText3, "Message not displayed");
        electronicsPage.clickOnConfirm();
        String expectedText4 = "Thank you";
        String actualText4 = electronicsPage.verifyMessage4();
        Assert.assertEquals(actualText4, expectedText4, "Message not displayed");
        String expectedText5 = "Your order has been successfully processed!";
        String actualText5 = electronicsPage.verifyMessage5();
        Assert.assertEquals(actualText5, expectedText5, "Message not displayed");
        electronicsPage.clickOnContinue();
        String expectedText6 = "Welcome to our store";
        electronicsPage.clickOnLogOut();
        String Url = driver.getCurrentUrl();
        Assert.assertEquals("https://demo.nopcommerce.com/", Url);


    }
}
