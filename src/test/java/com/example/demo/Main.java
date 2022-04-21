package com.example.demo;

import org.junit.runner.JUnitCore;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Main {

    public static void main(String[] args) throws ParseException {
        //the Date and time at which you want to execute
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormatter.parse("2022-03-31 20:21:05");

        //Now create the time and schedule it
        Timer timer = new Timer();

        //Use this if you want to execute it once
        timer.schedule(new CustomTask(), date);
        //the Date and time at which you want to execute
//        Date date2 = dateFormatter.parse("2022-01-04 19:05:05");
//
//        //Now create the time and schedule it
//        Timer timer2 = new Timer();
//
//        //Use this if you want to execute it once
//        timer2.schedule(new CustomTask(), date2);

    }
}
