package C13;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementOccursInListTest {
    @Test
    void elementsOccursInListTest(){
        // GIVEN
        List<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> number2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> occurredList = ElementOccursInList.checkOccured(number, number2);
        // ASSERT
        assertEquals(occurredList, occurredList);
    }
}