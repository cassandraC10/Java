package C13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAlternativeElement {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<Integer> y = new ArrayList<>(Arrays.asList(1, 2, 3));
//        List<String> z = new ArrayList<>(); // ArrayList<String> z = new ArrayList();
//   i didnt use the general array type, i used list n it worked this time
        List<String> z =  concat(y, x);
        for (int i = 0; i < x.size(); i++) {
            z.add(String.valueOf(y.get(i)));
            z.add(x.get(i));
        }
        System.out.println(z);
    }

    public static List<String> concat(List<Integer> x, List<String> y) {
        List<String> mergedList = new ArrayList<>();
        for (int i = 0; i < y.size(); i++) {
            mergedList.add(String.valueOf(x.get(i)));
            mergedList.add(y.get(i));
        }
        System.out.println(mergedList);
        return mergedList;
    }

//    public static List<String> concat(List<String> listOne, List<Integer> listTwo) {
//        List<String> mergedList = new ArrayList<>();
////        for (int i = 0; i < listOne.size(); i++) {
////            mergedList.add(String.valueOf(listTwo.get(i)));
////            mergedList.add(listOne.get(i));
//        for (String s : listOne) {
//            mergedList.add(String.valueOf(s));
//        }
//        for (Integer integer : listTwo) {
//            mergedList.add(String.valueOf(integer));
//        }
//        return mergedList;
//    }
}
