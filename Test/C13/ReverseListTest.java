package C13;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {
    @Test
    public void testReverseList(){
        List<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> reverse = ReverseList.reverseList(number);
        assertEquals(reverse, reverse);

    }
}