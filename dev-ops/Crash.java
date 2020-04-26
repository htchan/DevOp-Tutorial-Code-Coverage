package library;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class Crash {
    @Test
    public void testCheckRange3() {
        LinkedList l = new LinkedList();
        l.add(null);
        l.remove(null);
    }
}