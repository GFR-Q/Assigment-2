package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        TaskService taskService = context.getBean(TaskService.class);
        taskService.addTask("Doing assigment task for back end");
        System.out.println("Tasks: " + taskService.getTasks());
        TaskService importantService = context.getBean("importantTaskService", TaskService.class);
        importantService.addTask("Narxoz course");
        System.out.println("Tasks: " + importantService.getTasks());
        UseText useText = context.getBean(UseText.class);

    }
}