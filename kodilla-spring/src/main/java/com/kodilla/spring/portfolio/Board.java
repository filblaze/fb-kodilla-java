package com.kodilla.spring.portfolio;

public final class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addTaskToDo(final String task) {
        toDoList.addTask(task);
    }

    public void addTaskToInProgress(final String task) {
        inProgressList.addTask(task);
    }

    public void addTaskToDone(final String task) {
        doneList.addTask(task);
    }

    public void printBoard() {
        System.out.println("To Do: " + toDoList);
        System.out.println("In Progress: " + inProgressList);
        System.out.println("Done: " + doneList);
    }
}
