package C13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementsOnOddPosition {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.print("Elements on odd positions are : ");
        for (int i = 0; i <  6;  i++) {
            if (i % 2 == 0) {
                System.out.print(number.get(i) + " ");
            }
        }
    }

    public static List<Integer> oddElements(List<Integer> number) {
        List<Integer> oddPosition = new ArrayList<>();
        for (int i = 0; i <  6;  i++) {
            if (i % 2 == 0) {
                System.out.print(number.get(i) + " ");
            }
        }
        return oddPosition;
    }
}
