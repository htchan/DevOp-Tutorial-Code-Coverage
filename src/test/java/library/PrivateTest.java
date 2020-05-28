package library;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class PrivateTest {
    @Test
    public void testPrivateLength() {
        // private function cannot be tested by simple call
        //int actual = l.privateLength(); // error
        // but you can find some public function make internal call to private function
        LinkedList l = new LinkedList();
        assertEquals(null, l.get(0));   // test for privatLength() gives 0 (lines 62-64)
        l.add("abc");
        assertEquals("abc", l.get(0));  // test for privateLength() gives 1 (lines 65, 66)
        l.add("def");
        assertEquals("def", l.get(1));  // test for privateLength() gives larger than 1 (lines 67-69)
    }
}