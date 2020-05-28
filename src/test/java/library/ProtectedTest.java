package library;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class ProtectedTest {
    @Test
    public void testProtectedLength() {
        // as the test class is under the same packege with target class
        // you can directly call the protected function to test them
        LinkedList l = new LinkedList();
        assertEquals(0, l.protectedLength());
        l.add("abc");
        assertEquals(1, l.protectedLength());
        l.add("def");
        assertEquals(2, l.protectedLength());
    }
}