package com.springlearning.springlearning.config;

import com.springlearning.springlearning.Coach;
import org.springframework.context.annotation.Configuration;

public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("In Constructor:  "+getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Swim earlier!!!!!";
    }
}
