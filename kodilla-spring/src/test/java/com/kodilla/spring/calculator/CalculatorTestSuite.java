package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(2.5, 7.5);
        double subResult = calculator.sub(5.5, 1.0);
        double mulResult = calculator.mul(2.5, 2.5);
        double divResult = calculator.div(15.0, 3.0);

        //Then
        Assert.assertEquals(10, addResult, 0.00001);
        Assert.assertEquals(4.5, subResult, 0.00001);
        Assert.assertEquals(6.25, mulResult, 0.00001);
        Assert.assertEquals(5.0, divResult, 0.00001);

    }
}
