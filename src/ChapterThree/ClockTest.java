package ChapterThree;

public class ClockTest {
    public static void main( String args[] ){
        Clock sandraClock = new Clock();

        System.out.print( "The initial universal time is: " );
        System.out.println( sandraClock.toUniversalString() );
        System.out.print( "The initial standard time is: " );
        System.out.println( sandraClock.toString() );
        System.out.println();

        sandraClock.setClock( 13, 27, 6 );
        System.out.print( "Universal time after setTime is: " );
        System.out.println( sandraClock.toUniversalString() );
        System.out.print( "Standard time after setTime is: " );
        System.out.println( sandraClock.toString() );
        System.out.println();

        sandraClock.setClock( 99, 99, 99 );
        System.out.println( "After attempting invalid settings:" );
        System.out.print( "Universal time: " );
        System.out.println( sandraClock.toUniversalString() );
        System.out.print( "Standard time: " );
        System.out.println( sandraClock.toString() );
    }
}