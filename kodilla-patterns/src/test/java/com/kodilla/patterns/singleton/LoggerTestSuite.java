package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        //Given
        Logger logger = Logger.INSTANCE;
        //When
        logger.log("Hello World");
        String lastLog = logger.getLastLog();
        //Then
        Assertions.assertEquals("Hello World", lastLog);
    }
}
