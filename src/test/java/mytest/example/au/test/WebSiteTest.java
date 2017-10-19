//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package mytest.example.au.test;

import mytest.example.au.test.base.Communication;
import mytest.example.au.test.page.BookAFlight;
import mytest.example.au.test.page.FlightFinder;
import mytest.example.au.test.page.LoginPage;
import mytest.example.au.test.page.SelectFlight;
import org.junit.Assert;
import org.junit.Test;

public class WebSiteTest {
    public WebSiteTest() {
    }

    @Test
    public static void main(String[] args) {
        Communication communication = new Communication();
        LoginPage loginPage = new LoginPage("mercury", "mercury");
        loginPage.init();
        loginPage.continueAction(loginPage.getSubmit());
        communication.implicitWait("findFlights");
        Assert.assertTrue("Check Title", Communication.getDriver().getTitle().startsWith("Find a Flight:"));
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.init();
        flightFinder.continueAction(flightFinder.getSubmit());
        communication.implicitWait("reserveFlights");
        Assert.assertTrue("Check Title", Communication.getDriver().getTitle().startsWith("Select a Flight:"));
        SelectFlight selectFlight = new SelectFlight(Integer.valueOf(1), Integer.valueOf(2));
        selectFlight.init();
        selectFlight.continueAction(selectFlight.getSubmit());
        communication.implicitWait("buyFlights");
        Assert.assertTrue("Check Title", Communication.getDriver().getTitle().startsWith("Book a Flight:"));
        BookAFlight bookAFlight = new BookAFlight();
        bookAFlight.init();
        bookAFlight.continueAction(bookAFlight.getSubmit());
        Assert.assertTrue("Check Title", Communication.getDriver().getTitle().startsWith("Flight Confirmation:"));
        Communication.getDriver().close();
    }
}
