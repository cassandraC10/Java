package ChapterSeventeen;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class DuplicateWordRemover {
    public static void main(String[] args) {

        String input = new Scanner(System.in).nextLine();

        input = input.toLowerCase();
        String[] elements = input.split(" ");

       List<String> stringList = Stream.of(elements)
                .sorted()
               .distinct().toList();

        System.out.println(stringList);
    }
}
