package com.java.test1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 *
 *
 * //可视化日历程序
 *
 *
 * */
public class VisualCalender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
//        String temp = "2019-12 -18";
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse(temp);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            calendar.set(Calendar.DATE, 1);

            int maxDate = calendar.getActualMaximum(Calendar.DATE);


            System.out.println("日\t\t一\t\t二\t\t三\t\t四\t\t五\t\t六");



            int j = 0;
            for (int i = 1; i <= maxDate + calendar.get(Calendar.DAY_OF_WEEK)-1; i++) {

                if(i < calendar.get(Calendar.DAY_OF_WEEK)){
                    System.out.print("\t\t");
                }else {
                    j++;

                    System.out.print(j + "\t\t");
                    if ((j+calendar.get(Calendar.DAY_OF_WEEK)-1) % 7 == 0) {
                        System.out.print("\n");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
