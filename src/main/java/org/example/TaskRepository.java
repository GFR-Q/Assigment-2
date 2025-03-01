package org.example;

import org.springframework.scheduling.config.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private List<Task> tasks= new ArrayList<>();
    public List<Task> addTask() {
        tasks.add(tasks);
    }
    public List<Task> getTasks() {
        return tasks;
    }
}
