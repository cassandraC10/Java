package C13;

import java.util.ArrayList;
import java.util.List;

public class ConcatenateList {
    public static void main(String[] args) {
        List<String> list1= new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(3);
       List<String> merged = concat(list1, list2);
        System.out.println(merged);
    }

    public static List<String> concat(List<String> listOne, List<Integer> listTwo) {
//        List<String> mergedList = new ArrayList<>();
//        for(int i=0;i< listOne.size();i++) {
//            mergedList.add(String.valueOf(listOne.get(i)));
//        }
//        for(int i=0;i< listTwo.size();i++) {
//            mergedList.add(String.valueOf(listTwo.get(i)));
//        }
//        return mergedList;
//        return  null;
        for (Integer number:listTwo) {
            listOne.add(String.valueOf(number));
        }
        return listOne;
    }
}
