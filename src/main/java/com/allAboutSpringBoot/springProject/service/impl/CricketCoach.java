package com.allAboutSpringBoot.springProject.service.impl;

import com.allAboutSpringBoot.springProject.service.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("in Cricket");
    }

    @Override
    public String getDailyWorkout() {
        return "This is a cricket coach giving daily workout.";
    }

}
