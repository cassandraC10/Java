package C13;

import java.util.ArrayList;
import java.util.List;

public class NumberToList {
    public static void main(String[] args) {
        int number = 2342;
        int[] x = new int[]{number};

        List<Integer> list = new ArrayList<>(x.length);
        for (int i: x) { list.add(i); }
        System.out.println(list);
        }

    public static List<Integer> numberList(int[] x) {
        List<Integer> list = new ArrayList<>(x.length);
        for (int i: x) { list.add(i); }
        return list;
    }
}
