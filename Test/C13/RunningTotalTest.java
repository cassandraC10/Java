package C13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RunningTotalTest {
    @Test
    public void testToRunTotal(){
        int[] number = new int[] { 1, 2, 3, 4, 5, 6 };

        int[][] total = RunningTotal.listTotal(number);

        assertEquals(total, total);
    }
}