package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void shouldReturnOne() {
        assertEquals(1, App.testOne());
    }

    @Test
    public void shouldReturnTwo() {
        assertEquals(2, App.testTwo());
    }

    public void shouldReturnThree() {
        assertEquals(3, App.testThree());
    }
}
