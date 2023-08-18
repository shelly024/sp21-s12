package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple1() {
        IntList lst = IntList.of(13, 12, 2, 15, 17);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("169 -> 12 -> 4 -> 15 -> 289", lst.toString());
        assertTrue(changed);
    }
    @Test
    public void testSquarePrimesSimple2() {
        IntList lst = IntList.of(6, 12, 4, 15, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("6 -> 12 -> 4 -> 15 -> 18", lst.toString());
    }
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

}
