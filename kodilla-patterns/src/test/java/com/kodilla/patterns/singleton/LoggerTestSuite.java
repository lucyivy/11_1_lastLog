package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;


public class LoggerTestSuite {
    private static Logger logger;

    @Test
    public void testGetLastLog(){
        //Given
        Logger.getInstance().log("Example log");
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Example log", lastLog);
    }



}
