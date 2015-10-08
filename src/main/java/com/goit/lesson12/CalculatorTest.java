package com.goit.lesson12;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public void setUp() throws Exception {
        calculator new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(3, calculator().add(1, 2));
    }

    @Test
    public void testAddSevenAndFive() {
        final int arg1 = 7;
        final int arg2 = 5;
        assertEquals(arg1 + arg2, calculator.add(arg1, arg2));
    }

    @Test
    public void testMult() throws Exception {
        final int arg1 = 2;
        final int arg2 = 5;
        assertEquals(arg1 + arg2, calculator.mult(arg1, arg2));
    }
}
