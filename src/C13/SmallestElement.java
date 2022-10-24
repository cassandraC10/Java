package C13;

import java.util.Arrays;
import java.util.List;

public class SmallestElement {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 7, 6);
        Integer minimum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
//            if (arrayList.get(i) > minimum)
//                minimum = arrayList.get(i);
            if (minimum != arrayList.get(i))
                minimum = arrayList.get(i);
        }
        System.out.println("The maximum value is: " + minimum);
    }
}
