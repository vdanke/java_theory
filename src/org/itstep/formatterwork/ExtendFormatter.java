package org.itstep.formatterwork;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class ExtendFormatter {

    public static void main(String[] args) {
        numberFormat();
        dateFormat();
    }

    private static void dateFormat() {
        Date date = new Date();
        DateFormat dateInstance = DateFormat.getDateInstance();
        DateFormat dateInstance1 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINA);
        String format = dateInstance1.format(date);
        System.out.println(format);
        Calendar calendar = dateInstance.getCalendar();
        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        System.out.println(firstDayOfWeek);
    }

    private static void numberFormat() {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.CANADA);
        String format = currencyInstance.format(123);
        System.out.println(format);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String format1 = china.format(123);
//        Currency currency = china.getCurrency();
        System.out.println(format1);
    }
}
