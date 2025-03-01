package org.example;

import java.util.List;

public interface TaskService {
    void addTask(String task);
    List<String> getTasks();
}
