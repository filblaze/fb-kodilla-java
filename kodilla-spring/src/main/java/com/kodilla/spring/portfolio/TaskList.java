package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {

    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(final String task) {
        tasks.add(task);
    }

    @Override
    public String toString() {
        return tasks.toString();
    }

}
