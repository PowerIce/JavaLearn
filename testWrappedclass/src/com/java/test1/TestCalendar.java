package com.java.test1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
//        c.set(2001,Calendar.FEBRUARY,10,12,13,56);
        c.set(Calendar.YEAR,2011);
        c.set(Calendar.MONTH,11);
        c.set(Calendar.DATE,11);
        c.add(Calendar.YEAR,10);
        Date d = c.getTime();
        System.out.println(d);
    }
}
