package library;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;


public class EdgeCoverage {
    // showing the decision test coverage on toString
    @Test
    public void testAllDecision() {
        LinkedList l = new LinkedList();
        assertEquals("[]", l.toString());           // test edge 1
        l.add("abc");
        assertEquals("[abc]", l.toString());        // test edge 2
        l.add("def");
        assertEquals("[abc, def]", l.toString());   // test edge 3
    }
}