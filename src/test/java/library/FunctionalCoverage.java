package library;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class FunctionalCoverage {
    // call all function once and make sure it works fine is already 100% functional coverage
    @Test
    public void testFunctions() {
        LinkedList l = new LinkedList();        // test constructor
        l.add("abc");                           // test add(Object)
        assertEquals(1, l.length());            // test length()
        assertEquals("abc", l.get(0));          // test get(int)
        assertEquals("[abc]", l.toString());    // test toString()
        Object obj = l.remove("abc");           // test remove()
        assertEquals("abc", obj);
        assertEquals(0, l.protectedLength());

    }
}