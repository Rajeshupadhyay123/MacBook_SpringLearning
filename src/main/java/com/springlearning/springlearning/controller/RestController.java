package com.springlearning.springlearning.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Value("${team.name}")
    private String name;

    private static final HashMap<String,Integer> employeeMap = new HashMap<>();

    RestController(){
        employeeMap.put("Rajesh",101);
        employeeMap.put("Sahrish",102);
        employeeMap.put("Shalu", 103);
    }

    @GetMapping("/properties")
    public String getPropertiesValue(){
        System.out.println(name);
        return name;
    }

    @GetMapping("/check")
    public String beautiful(){
        return "Hi! Beautiful";
    }

    @GetMapping("/variable/{name}")
    public int getEmployeeId(@PathVariable String name){

        int employeeId = 0;
        System.out.println(name);
        for(Map.Entry<String, Integer> entry: employeeMap.entrySet()){
            String key = entry.getKey();
            if(key.equalsIgnoreCase(name)) {
                employeeId = entry.getValue();
            }
        }

        return employeeId;
    }

}
