package com.allAboutSpringBoot.springProject.service.impl;

import com.allAboutSpringBoot.springProject.service.Coach;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    public BasketballCoach() {
        System.out.println("in Basketball");
    }

    @Override
    public String getDailyWorkout() {
        return "This is a basketball coach giving daily workout.";
    }

}
