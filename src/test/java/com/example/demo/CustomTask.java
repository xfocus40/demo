package com.example.demo;

import org.junit.runner.JUnitCore;

import java.util.TimerTask;

public class CustomTask extends TimerTask {

    public CustomTask(){
    }

    public void run() {
        try {

            JUnitCore junit = new JUnitCore();
            junit.run(RulesEngine.class);

        } catch (Exception ex) {
            System.out.println("error running thread " + ex.getMessage());
        }
    }
}