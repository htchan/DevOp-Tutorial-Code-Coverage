package example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class MainTest {
    @Test
    public void mainTest() {
        Main m = new Main();
        Main.main(null);
    }
}