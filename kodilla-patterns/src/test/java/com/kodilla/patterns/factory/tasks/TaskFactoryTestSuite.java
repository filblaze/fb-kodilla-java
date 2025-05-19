package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("Lista zakupów", shopping.getTaskName());
        assertEquals("Zakupy zrobione", shopping.executeTask());
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.createTask(TaskFactory.PAINTING);

        //Then
        assertEquals("Namaluj obrazek", painting.getTaskName());
        assertEquals("Obrazek namalowany", painting.executeTask());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.createTask(TaskFactory.DRIVING);

        //Then
        assertEquals("Wycieczka", driving.getTaskName());
        assertEquals("Podróż zakończona", driving.executeTask());
        assertTrue(driving.isTaskExecuted());

    }
}
