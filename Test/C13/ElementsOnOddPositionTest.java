package C13;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ElementsOnOddPositionTest {
    @Test
    public void testElementsOnOddPosition(){
        List<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> oddPosition = ElementsOnOddPosition.oddElements(number);
        // ASSERT
        assertEquals(oddPosition, oddPosition);
    }
}