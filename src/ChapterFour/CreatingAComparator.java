package ChapterFour;

import java.util.Scanner;

public class CreatingAComparator {
    public static void main( String args[] )
    {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.print( "Input first number: " );
        number1 = input.nextInt();

        System.out.print( "Input second number: " );
        number2 = input.nextInt();

        if ( number1 == number2 )
            System.out.printf( "%d == %d\n", number1, number2 );
        if ( number1 != number2 )
            System.out.printf( "%d != %d\n", number1, number2 );
        if ( number1 < number2 )
            System.out.printf( "%d < %d\n", number1, number2 );
        if ( number1 > number2 )
            System.out.printf( "%d > %d\n", number1, number2 );
        if ( number1 <= number2 )
            System.out.printf( "%d <= %d\n", number1, number2 );
        if ( number1 >= number2 )
            System.out.printf( "%d >= %d\n", number1, number2 );

//        print 0 if they are equal to each other, 1 if the first
//number is greater, and –1 if the second number is greater.
    }
}
