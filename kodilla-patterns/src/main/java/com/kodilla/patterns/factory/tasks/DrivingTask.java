package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task{

    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getWhere() {
        return where;
    }

    @Override
    public String executeTask() {
        this.where = null;
        return "Podróż zakończona";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return this.where == null;
    }
}
