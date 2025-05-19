package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task{

    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    @Override
    public String executeTask() {
        this.whatToPaint = null;
        return "Obrazek namalowany";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return this.whatToPaint == null;
    }
}
