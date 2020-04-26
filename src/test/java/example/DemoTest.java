package example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class DemoTest {
    @Test
    public void testSumArray() {
        Demo demo = new Demo();
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 55;
        int actual = demo.sumArray(inputArray, 0);
        assertEquals("sum array test failed", expected, actual);
    }
    @Test
    public void testSumArraySimple() {
        Demo demo = new Demo();
        int[] inputArray = {1};
        int expected = 1;
        int actual = demo.sumArray(inputArray, 0);
        assertEquals("sum array test failed", expected, actual);
    }
    
    @Test
    public void testCheckRange1() {
        // 5 is inside the range
        Demo demo = new Demo();
        boolean expected = true;
        boolean actual = demo.checkInRange(5, 0, 10);
        assertEquals("1 is not between 0 and 10", expected, actual);
    }
    @Test
    public void testCheckRange2() {
        // 0 is smaller than the range
        Demo demo = new Demo();
        boolean expected = false;
        boolean actual = demo.checkInRange(0, 5, 10);
        assertEquals("0 is not smaller than 5 to 10", expected, actual);
    }
    @Test
    public void testCheckRange3() {
        // 10 is larger than the range
        Demo demo = new Demo();
        boolean expected = false;
        boolean actual = demo.checkInRange(10, 0, 5);
        assertEquals("10 is not larger than 0 to 5", expected, actual);
    }
}