package com.learnmaven.linux;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @BeforeAll
    static void initAll(){}

    @BeforeEach
    void init(){}

    @Test
    public void testAdd(){
        assertEquals(10 , new Calculator().add(5,5));
    }

    @Test
    public void testSub(){
        assertEquals(5, new Calculator().substract(10, 5));
    }

    @Test
    public void testMulti(){
        assertEquals(25, new Calculator().muliiply(5,5));
    }

    @Test
    public void testDivide(){
        assertEquals(1.0, new Calculator().divide(5,5));
    }

    @AfterEach
    void teardown(){}

    @AfterAll
    static void tearDownALL(){}

}
