package C13;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementsOnEvenPositionTest {
    @Test
    public void elementsOnEvenPositionTest(){
        // Given
        List<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> evenPosition = ElementsOnEvenPosition.evenElements(number);
        // ASSERT
        assertEquals(evenPosition, evenPosition);
    }
}