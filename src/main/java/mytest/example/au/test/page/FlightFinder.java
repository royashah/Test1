//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package mytest.example.au.test.page;

import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;
import java.util.Set;
import mytest.example.au.test.base.ExtendedPage;

public class FlightFinder extends ExtendedPage {
    private String type = "oneway";
    private String passengers = "1";
    private String[] airLineList = new String[]{"No Preference", "Blue Skies Airlines", "Unified Airlines", "Pangea Airlines"};
    private String airLine = "Blue Skies Airlines";
    private String[] departingFromList = new String[]{"Acapulco", "Frankfurt", "London", "New York", "Paris", "Portland", "Seattle", "Sydney", "Zurich"};
    private String departingFrom = "Frankfurt";
    private String monthFrom = "January";
    private String monthTo = "January";
    private Set<Integer> daySet = ContiguousSet.create(Range.closed(Integer.valueOf(1), Integer.valueOf(31)), DiscreteDomain.integers());
    private String dayFrom = "1";
    private String dayTo = "10";
    private String serviceClass = "Business";
    private String submit = "findFlights";

    public FlightFinder() {
    }

    public String getSubmit() {
        return this.submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassengers() {
        return this.passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public String[] getAirLineList() {
        return this.airLineList;
    }

    public void setAirLineList(String[] airLineList) {
        this.airLineList = airLineList;
    }

    public String getAirLine() {
        return this.airLine;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }

    public String[] getDepartingFromList() {
        return this.departingFromList;
    }

    public void setDepartingFromList(String[] departingFromList) {
        this.departingFromList = departingFromList;
    }

    public String getDepartingFrom() {
        return this.departingFrom;
    }

    public void setDepartingFrom(String departingFrom) {
        this.departingFrom = departingFrom;
    }

    public Set<Integer> getDaySet() {
        return this.daySet;
    }

    public void setDaySet(Set<Integer> daySet) {
        this.daySet = daySet;
    }

    public String getServiceClass() {
        return this.serviceClass;
    }

    public void setServiceClass(String serviceClass) {
        this.serviceClass = serviceClass;
    }

    public String getMonthFrom() {
        return this.monthFrom;
    }

    public void setMonthFrom(String monthFrom) {
        this.monthFrom = monthFrom;
    }

    public String getMonthTo() {
        return this.monthTo;
    }

    public void setMonthTo(String monthTo) {
        this.monthTo = monthTo;
    }

    public String getDayFrom() {
        return this.dayFrom;
    }

    public void setDayFrom(String dayFrom) {
        this.dayFrom = dayFrom;
    }

    public String getDayTo() {
        return this.dayTo;
    }

    public void setDayTo(String dayTo) {
        this.dayTo = dayTo;
    }

    public void init() {
        this.selectNameWithSpecificValue("tripType", this.getType());
        this.selectDropDownList("passCount", this.getPassengers());
        this.selectDropDownList("fromPort", this.getDepartingFrom());
        this.selectDropDownList("fromMonth", this.getMonthFrom());
        this.selectDropDownList("fromDay", this.getDayFrom());
        this.selectDropDownList("toPort", this.getDepartingFrom());
        this.selectDropDownList("toMonth", this.getMonthTo());
        this.selectDropDownList("toDay", this.getDayTo());
        this.selectNameWithSpecificValue("servClass", this.getServiceClass());
        this.selectDropDownList("airline", this.getAirLine());
    }

    public static enum serviceClassList {
        Coach,
        Business,
        First;

        private serviceClassList() {
        }
    }

    public static enum monthList {
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December;

        private monthList() {
        }
    }

    public static enum typeList {
        roundtrip,
        oneway;

        private typeList() {
        }
    }
}
