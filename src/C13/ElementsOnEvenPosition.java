package C13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementsOnEvenPosition {
    public static void main(String[] args) {
            List<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
            System.out.print("Elements on odd positions are : ");
            for (int i = 1; i < 6; i = i + 2) {
                System.out.print(number.get(i) + " ");
            }//        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
//        for (int i = 1; i < arr.length; i = i + 2) {
//            System.out.println(arr[i]);
//        }
        }
    static List<Integer> evenElements(List<Integer> number) {
        List<Integer> evenPosition = new ArrayList<>();
        for (int i = 1; i < 6; i = i + 2) {
            System.out.print(number.get(i) + " ");
        } return evenPosition;
    }
}
