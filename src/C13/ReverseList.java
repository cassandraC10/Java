package C13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.print("The reverse of the list is: ");
        Collections.reverse(number);
        System.out.println(number);
    }

    public static List<Integer> reverseList(List<Integer> number) {
        List<Integer> reverse = new ArrayList<>();
        Collections.reverse(number);
        return reverse;
    }
}
