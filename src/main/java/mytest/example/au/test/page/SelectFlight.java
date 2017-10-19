//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package mytest.example.au.test.page;

import mytest.example.au.test.base.ExtendedPage;

public class SelectFlight extends ExtendedPage {
    private Integer departNumber = Integer.valueOf(1);
    private Integer returnNumber = Integer.valueOf(1);
    private String submit = "reserveFlights";

    public String getSubmit() {
        return this.submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    public SelectFlight(Integer departNumber, Integer returnNumber) {
        this.departNumber = departNumber;
        this.returnNumber = returnNumber;
    }

    public String departTable(int number) {
        int result = number + number + 1;
        return "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[" + result + "]/td[1]/input";
    }

    public String returnTable(int number) {
        int result = number + number + 1;
        return "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[" + result + "]/td[1]/input";
    }

    public void init() {
        this.selectWithXpath(this.departTable(this.departNumber.intValue()));
        this.selectWithXpath(this.returnTable(this.returnNumber.intValue()));
    }
}

