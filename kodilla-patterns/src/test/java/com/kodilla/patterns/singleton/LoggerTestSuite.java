package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;


public class LoggerTestSuite {
    private static Logger logger;

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("Example log");
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Example log", lastLog);
    }

    @Test
    public void testGetSecondLog() {
        //Given
        Logger.getInstance().log("Example log");
        Logger.getInstance().log("Second example log");

        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Second example log", lastLog);
    }

}
