package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class BasicTaskService implements TaskService {
    private final TaskRepository repository;

    @Autowired
    public BasicTaskService(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addTask(String task) {
        repository.addTask(task);
    }

    @Override
    public List<String> getTasks() {
        return repository.getTasks();
    }
}
