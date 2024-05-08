package com.example.HilelTask11;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TaskManagementExceptionAspect {

    @AfterThrowing(pointcut = "execution(* com.example.HilelTask8.TaskService.*(..))", throwing = "ex")
    public void logTaskServiceException(Exception ex) {
        System.out.println("Exception occurred in TaskService: " + ex.getMessage());
    }
}