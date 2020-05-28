package example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;


public class BranchCoverage {
    // show condition coverage on remove
    @Test
    public void testBranchesExample() {
        Demo d = new Demo();
        assertEquals(1, d.branchesExample(1,2,3));  // a==1, b==2, c==3
        assertEquals(0, d.branchesExample(0,1,2));  // a!=1, b!=2, c!=3
        assertEquals(0, d.branchesExample(1,2,4));  // test branch 1, 2, 4
        assertEquals(0, d.branchesExample(1,3,3));  // test branch 1, 5
        assertEquals(0, d.branchesExample(2,2,3));  // test branch 6
    }
}