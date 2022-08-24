package C13;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberToListTest {
    @Test
    public void testNumberIntoList(){
        int number = 2342;
        int[] x = new int[]{number};

        List<Integer> list = NumberToList.numberList(x);
        assertEquals(list, list);
    }
}