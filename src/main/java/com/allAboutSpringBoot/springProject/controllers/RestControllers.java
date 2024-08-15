package com.allAboutSpringBoot.springProject.controllers;

import com.allAboutSpringBoot.springProject.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

    private Coach coach;


    //Constructor injection
    @Autowired
    public void RestController(@Qualifier("hockeyCoach") Coach coach){
        System.out.println("In rest");
        this.coach = coach;
    }


    //Setter injection
    //instead of setCoach, we can use any method name
//    @Autowired
//    public void setCoach(@Qualifier("cricketCoach") Coach coach) {
//        this.coach = coach;
//    }

    //Field injection -- not recommended
    // makes it hard to unit test
//    @Autowired
//    private Coach coach;

    @GetMapping("/hello")
    public String hello() {
        return "Hellollooo";
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }
}
