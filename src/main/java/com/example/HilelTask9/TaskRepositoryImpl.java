package com.example.HilelTask11;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("jpa")
public class TaskRepositoryImpl implements TaskRepository {

    private final Map<Integer, Task> tasks = new HashMap<>();

    @Override
    public List<Task> findAllByTaskStatus(TaskStatus status) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks.values()) {
            if (task.getTaskStatus() == status) {
                result.add(task);
            }
        }
        return result;
    }

    @Override
    public <S extends Task> S save(S entity) {
        tasks.put(entity.getTaskId(), entity);
        return entity;
    }

    @Override
    public <S extends Task> Iterable<S> saveAll(Iterable<S> entities) {
        for (Task task : entities) {
            tasks.put(task.getTaskId(), task);
        }
        return entities;
    }

    @Override
    public Task findById(Integer integer) {
        return tasks.get(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return tasks.containsKey(integer);
    }

    @Override
    public Iterable<Task> findAll() {
        return tasks.values();
    }

    @Override
    public Iterable<Task> findAllById(Iterable<Integer> integers) {
        List<Task> foundTasks = new ArrayList<>();
        for (Integer id : integers) {
            Task task = tasks.get(id);
            if (task != null) {
                foundTasks.add(task);
            }
        }
        return foundTasks;
    }

    @Override
    public long count() {
        return tasks.size();
    }

    @Override
    public void deleteById(Integer integer) {
        tasks.remove(integer);
    }

    @Override
    public void delete(Task entity) {
        tasks.remove(entity.getTaskId());
    }

    @Override
    public void deleteAll(Iterable<? extends Task> entities) {
        for (Task task : entities) {
            tasks.remove(task.getTaskId());
        }
    }

    @Override
    public void deleteAll() {
        tasks.clear();
    }
}