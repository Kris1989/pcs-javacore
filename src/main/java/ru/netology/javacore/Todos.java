package ru.netology.javacore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Todos {
    private List<String> tasks = new ArrayList<>();

    public List<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public String getAllTasks() {
        Collections.sort(tasks);
        StringBuilder builder = new StringBuilder();
        builder.append(tasks).append(" ");
        return builder.toString();
    }
}
