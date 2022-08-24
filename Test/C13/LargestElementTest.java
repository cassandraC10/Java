package C13;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LargestElementTest {
    @Test
    public void testLargestElement(){
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer largestElement = 0;

        List<Integer> largest = LargestElement.largeElements(arrayList);
        // ASSERT
        assertEquals(largest, largestElement);
//        assertEquals(largestElement, largest);
    }
}