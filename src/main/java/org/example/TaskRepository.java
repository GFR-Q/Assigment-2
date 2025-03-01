package org.example;

import org.springframework.scheduling.config.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private List<String> tasks= new ArrayList<>();
    public void addTask(String task) {
        tasks.add(task);
    }
    public List<String> getTasks() {
        return tasks;
    }
}
