package com.example.HilelTask11;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TaskManagementLoggingAspect {

    @Before("execution(* com.example.HilelTask8.TaskService.addTask(..)) && args(task)")
    public void logTaskAddition(Task task) {
        System.out.println("Task added: " + task.getTaskTitle());
    }

    @Before("execution(* com.example.HilelTask8.TaskService.assignTask(..)) && args(taskId, username, userService)")
    public void logTaskAssignment(int taskId, String username, UserService userService) {
        System.out.println("Task assigned: TaskId=" + taskId + ", Username=" + username);
    }

}