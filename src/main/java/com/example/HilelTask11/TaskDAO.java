package com.example.HilelTask11;

import java.util.List;

public interface TaskDAO {
    void addTask(Task task);
    Task getTask(int taskId);
    List<Task> getAllTasks();
    void updateTask(Task task);
    void deleteTask(int taskId);
}