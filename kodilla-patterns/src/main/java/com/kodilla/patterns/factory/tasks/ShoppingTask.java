package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String executeTask() {
        this.quantity = 0;
        return "Zakupy zrobione";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return this.quantity == 0;
    }
}