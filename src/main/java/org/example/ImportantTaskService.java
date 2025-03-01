package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("importantTaskService")
public class ImportantTaskService implements TaskService {
    private final TaskRepository repository;

    @Autowired
    public ImportantTaskService(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addTask(String task) {
        repository.addTask("[IMPORTANT] "+task);
    }

    @Override
    public List<String> getTasks() {
        return repository.getTasks();
    }
}