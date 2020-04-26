package library;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class FullTest {
    @Test
    public void testAdd2() {
        LinkedList l = new LinkedList();
        l.add("abc");
        l.add("def");
        l.add("ghi");
        assertEquals("the length is not 3", 3, l.length());
        assertEquals("[abc, def, ghi]", l.toString());
    }
    @Test
    public void testRemove() {
        LinkedList l = new LinkedList();
        Object obj = l.remove("123");
        assertEquals("remove from a null list", null, obj);
        l.add("abc");
        l.add("def");
        l.add("g");
        assertEquals("the length is not 3", 3, l.length());
        obj = l.remove("ghi");
        assertEquals("remove non exist element", null, obj);
        assertEquals(3, l.length());
        obj = l.remove("def");
        assertEquals("remove second element", "def", obj);
        assertEquals(2, l.length());
        obj = l.remove("abc");
        assertEquals("remove first element", "abc", obj);
        assertEquals(1, l.length());
        obj = l.remove("g");
        assertEquals("remove remaining element", "g", obj);
        assertEquals(0, l.length());
    }
    @Test
    public void testGet() {
        LinkedList l = new LinkedList();
        l.add("abc");
        l.add("def");
        l.add("ghi");
        assertEquals(null, l.get(-1));
        assertEquals("abc", l.get(0));
        assertEquals("def", l.get(1));
        assertEquals("ghi", l.get(2));
        assertEquals(null, l.get(3));
    }
    @Test
    public void testLength() {
        LinkedList l = new LinkedList();
        assertEquals(0, l.length());
        l.add("abc");
        assertEquals(1, l.length());
        l.add("def");
        assertEquals(2, l.length());
    }
    @Test
    public void testToString() {
        LinkedList l = new LinkedList();
        assertEquals("[]", l.toString());
        l.add("abc");
        assertEquals("[abc]", l.toString());
        l.add("def");
        assertEquals("[abc, def]", l.toString());
    }
    //@Test
    public void testLogicalError() {
        LinkedList l = new LinkedList();
        l.add(null);
        l.remove(null);
    }
}