//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package mytest.example.au.test.page;

import mytest.example.au.test.base.ExtendedPage;

public class BookAFlight extends ExtendedPage {
    private String passFirst = "Roye";
    private String lastname = "Shah";
    private String number = "123456789";
    private String submit = "buyFlights";

    public BookAFlight() {
    }

    public String getSubmit() {
        return this.submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    public String getPassFirst() {
        return this.passFirst;
    }

    public void setPassFirst(String passFirst) {
        this.passFirst = passFirst;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void init() {
        this.setTextBoxWithName("passFirst0", this.getPassFirst());
        this.setTextBoxWithName("passLast0", this.getLastname());
        this.setTextBoxWithName("creditnumber", this.getNumber());
    }
}
