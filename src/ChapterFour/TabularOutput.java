package ChapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N   10*N    100*N   1000*N");
        for (int i = 1; i < 5; i++) {
            System.out.println();

            for (int j = 1; j < 5; j++) {
                double number = Math.pow(i, j);
                //System.out.printf("%d   %d      %d      %d\n", i, i * 2, i * 4, i * 8);
                System.out.print(number + "\t\t ");
            }
        }
    }
}
