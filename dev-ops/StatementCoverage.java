package library;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class StatementCoverage {
    // showing statement in get(int) 
    @Test
    public void testAllStatement() {
        LinkedList l = new LinkedList();
        l.add("abc");
        l.add("def");
        l.add("ghi");
        assertEquals(null, l.get(-1));    // test on line 51 - 54
        assertEquals("def", l.get(1));    // test on line 55 - 59
    }
}