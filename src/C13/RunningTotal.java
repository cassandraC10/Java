package C13;

public class RunningTotal {
    public static void main(String[] args) {
//        List<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int[] number = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 1; i < number.length; i++) {
            System.out.println(number[i] += number[i - 1]);
        }
    }

    public static int[][] listTotal(int[] number) {
        int[] total = new int[]{};
        for (int i = 1; i < number.length; i++) {
            System.out.println(number[i] += number[i - 1]);
        }
        return new int[][]{total};
//        return new int[0][];
    }
}