package Assignment;

public class NaturalNumberSum {
    public static void main(String[] args)
    {
//        int i, num = 10, sum = 0;
//
//        for(i = 1; i <= num; ++i)
//        {
//            sum = sum + i;
//        }
//
//        System.out.println("Sum of First 10 Natural Numbers is = " + sum);
        int number = 1;
        int sum = 0;
        while (number <= 10) {
            System.out.println(number);
            sum = sum + number;
            number = number + 1;
        }
        System.out.println("Sum = " + sum);

    }
}

