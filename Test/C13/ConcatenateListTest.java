package C13;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConcatenateListTest {
    @Test
    void testConcatenateLists(){
        //given
        List<String> list1= new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        List<Integer> list2 = Arrays.asList(1,2,3,4);
        //when
        List<String> listAfterMerge = Arrays.asList("a", "b", "c", "1","2","3","4");
        List<String> mergedList =ConcatenateList.concat(list1, list2);
        System.out.println(mergedList);
        //assert
        assertEquals(listAfterMerge, mergedList);
    }
}