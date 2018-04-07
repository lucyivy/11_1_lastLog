package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        String toDoTask = "Example to do task";
        String inProgressTask = "Example in progress task";
        String doneTask = "Example done task";

        //When
        board.getToDoList().getTasks().add(toDoTask);
        board.getInProgressList().getTasks().add(inProgressTask);
        board.getDoneList().getTasks().add(doneTask);

        //Then
        Assert.assertEquals(toDoTask, board.getToDoList().getTasks().get(0));
        Assert.assertEquals(inProgressTask, board.getInProgressList().getTasks().get(0));
        Assert.assertEquals(doneTask, board.getDoneList().getTasks().get(0));

        System.out.println(board.getToDoList());
        System.out.println(board.getInProgressList());
        System.out.println(board.getDoneList());
    }
}
