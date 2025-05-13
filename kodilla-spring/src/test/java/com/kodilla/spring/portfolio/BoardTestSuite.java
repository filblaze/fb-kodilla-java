package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
class BoardTestSuite {

    @Test
    void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = (Board) context.getBean("board");
        String doZrobienia = "Zadanie do zrobienia";
        String inProgress = "Zadanie w trakcie wykonania";
        String zrobione = "Zrobione zadanie";
        //When
        board.addTaskToDo(doZrobienia);
        board.addTaskToInProgress(inProgress);
        board.addTaskToDone(zrobione);
        //Then
        board.printBoard();
    }
}
