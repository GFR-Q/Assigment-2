package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("advancedTaskService")
public class AdvancedTaskService implements TaskService {
    private final TaskRepository repository;

    @Autowired
    public AdvancedTaskService(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addTask(String task) {
        repository.addTask("[ADVANCED] " + task);
    }

    @Override
    public List<String> getTasks() {
        return repository.getTasks();
    }
}