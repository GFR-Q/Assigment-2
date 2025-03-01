package org.example;

import org.springframework.scheduling.config.Task;

import java.util.List;

public interface TaskService {
    void addTask(String task);
    List<String> getTasks();
}
