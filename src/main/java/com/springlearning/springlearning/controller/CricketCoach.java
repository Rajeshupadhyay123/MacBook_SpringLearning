package com.springlearning.springlearning.controller;

import com.springlearning.springlearning.Coach;
import org.springframework.stereotype.Component;

//mark the class as spring bean
@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "practice the match daily";
    }
}
