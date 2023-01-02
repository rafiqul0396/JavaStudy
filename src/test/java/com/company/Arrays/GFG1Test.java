package com.company.Arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class GFG1Test {
    /**
     * Method under test: {@link GFG1#maxAbsDiff(int[], int)}
     */
    @Test
    public void testMaxAbsDiff() {
        int[] actualMaxAbsDiffResult = GFG1.maxAbsDiff(new int[]{1, 1, 1, 1}, 1);
        assertEquals(2, actualMaxAbsDiffResult.length);
        assertEquals(1, actualMaxAbsDiffResult[0]);
        assertEquals(1, actualMaxAbsDiffResult[1]);
    }

    /**
     * Method under test: {@link GFG1#maxAbsDiff(int[], int)}
     */
    @Test
    public void testMaxAbsDiff2() {
        int[] actualMaxAbsDiffResult = GFG1.maxAbsDiff(new int[]{1, 1, 1, 1}, 2);
        assertEquals(2, actualMaxAbsDiffResult.length);
        assertEquals(1, actualMaxAbsDiffResult[0]);
        assertEquals(1, actualMaxAbsDiffResult[1]);
    }

    /**
     * Method under test: {@link GFG1#maxAbsDiff(int[], int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testMaxAbsDiff3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        //       at com.company.Arrays.GFG1.maxAbsDiff(GFG1.java:18)
        //   See https://diff.blue/R013 to resolve this issue.

        GFG1.maxAbsDiff(new int[]{1, 1, 1, 1}, 5);
    }

    /**
     * Method under test: {@link GFG1#maxAbsDiff(int[], int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testMaxAbsDiff4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        //       at com.company.Arrays.GFG1.maxAbsDiff(GFG1.java:15)
        //   See https://diff.blue/R013 to resolve this issue.

        GFG1.maxAbsDiff(new int[]{}, 1);
    }
}

