package com.example.security.utils;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    @Test
    public void test1(){
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);

        instance.setTime(new Date());
        System.out.println(instance);

        instance.add(Calendar.DAY_OF_MONTH,+10);
        System.out.println(instance);

        System.out.println(instance.getTime());

    }
}
