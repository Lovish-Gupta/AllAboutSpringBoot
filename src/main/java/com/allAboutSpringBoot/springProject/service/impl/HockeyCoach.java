package com.allAboutSpringBoot.springProject.service.impl;

import com.allAboutSpringBoot.springProject.service.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Primary to mark it as primary in case no qualifier is provided for dependency injection.
@Lazy // initialises the instance only when dependency injection krni hoye or when requested
public class HockeyCoach implements Coach {

    public HockeyCoach() {
        System.out.println("in Hockey");
    }

    public String getDailyWorkout() {
        return "This is a Hockey coach giving daily workout.";
    }

}
