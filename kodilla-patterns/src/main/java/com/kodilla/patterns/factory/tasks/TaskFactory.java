package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskType) {
        return switch (taskType) {
            case SHOPPING -> new ShoppingTask("Lista zakupów", "Cytryny", 6);
            case PAINTING -> new PaintingTask("Namaluj obrazek", "Niebieski", "Parasol");
            case DRIVING -> new DrivingTask("Wycieczka", "Do Ciechocinka", "Samochodem");
            default -> null;
        };
    }
}
