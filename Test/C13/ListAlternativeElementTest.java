package C13;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListAlternativeElementTest {

    @Test
    void testListAlterNativeElements(){
        //given
        List<String> y = Arrays.asList("a", "b", "c");
        List<Integer> x = Arrays.asList(1,2,3);
        //when
        List<String> alternateMergeList = Arrays.asList("1", "a", "2", "b","3","c");
        List<String> mergedList = ListAlternativeElement.concat(x, y);
        System.out.println(mergedList);
        //assert
        assertEquals(alternateMergeList, mergedList);
    }

}