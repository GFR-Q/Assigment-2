package org.example;

import org.springframework.scheduling.config.Task;

import java.util.List;

public interface TaskService {
    void addTask(Task task);
    List<Task> getTasks();
}
