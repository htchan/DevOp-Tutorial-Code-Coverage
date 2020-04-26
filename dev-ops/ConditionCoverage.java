package library;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;


public class ConditionCoverage {
    // show condition coverage on remove
    @Test
    public void testCondifion() {
        LinkedList l = new LinkedList();
        l.remove("123");    // test predicate 0 (true)
        l.add("abc");
        l.add("def");
        l.add("ghi");
        assertEquals("[abc, def, ghi]", l.toString());
        l.remove("jkl");    // test predicate 0 (false), 1 (false), 2 (true & false), 3 (false)
        l.remove("def");    // test predicate 1 (true), 3(true), 4 (false), 5 (false)
        assertEquals("[abc, ghi]", l.toString());
        l.remove("ghi");    // test predicate 5 (true)
        assertEquals("[abc]", l.toString());
        l.remove("abc");    // test predicate 4 (true)
        assertEquals("[]", l.toString());
    }
}