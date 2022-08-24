package C13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementOccursInList {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//        List<Integer> number2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//        if (number == number2)
//            System.out.println("element occurs");
//        else
//            System.out.println("element does not occur");

        if (number.contains(number))
            System.out.println("elements occurs");
        else
            System.out.println("element does not occur");
    }

    public static List<Integer> checkOccured(List<Integer> number, List<Integer> number2) {
        List<Integer> occuredList = new ArrayList<>();

        if (number.contains(number))
            System.out.println("elements occurs");
        else
            System.out.println("element does not occur");
        return occuredList;
    }
}
