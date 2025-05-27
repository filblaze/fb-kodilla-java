package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaskListDaoTestSuite {

    private static final String TITLE = "Task List: To Do";
    private static final String DESCRIPTION = "This is a To Do Task List";

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(TITLE, DESCRIPTION);
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> taskLists = taskListDao.findByListName(name);

        //Then
        assertEquals(1, taskLists.size());

        //Cleanup
        int id = taskLists.get(0).getId();
        taskListDao.deleteById(id);
    }
}
