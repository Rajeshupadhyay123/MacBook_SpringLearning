package com.springlearning.springlearning.controller;

import com.springlearning.springlearning.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    @Qualifier("swimCoach")
    private Coach coach;


    @GetMapping("/cricketCoach")
    public ResponseEntity<String> getCricketCoach(){

        return new ResponseEntity<>(coach.getDailyWorkout(), HttpStatus.OK);
    }

}











