package ChapterThree;

import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {

        double price1 = 100 ;

        double price2 = 300 ;

        double newPrice1, newPrice2;



        Scanner scan = new Scanner(System.in);

        Car car1 = new Car ("BMW", "1992", 250000);

        Car car2 = new Car ("Honda", "2003", 306000 );



        // display information of the cars

        System.out.printf( "My first car   %s   %s    %.2f\n"  , car1.getModelType(), car1.getYearType(), car1.getPrice());

        System.out.printf( "My second car  %s   %s    %.2f\n"  , car2.getModelType(), car2.getYearType(), car2.getPrice());



        newPrice1 = car1.getPrice();

        newPrice1 = newPrice1 - (newPrice1 * 0.05);

        System.out.println("My first car is sold at 5% discount for $" + newPrice1);


        newPrice2 = car2.getPrice();

        newPrice2 = newPrice2 - (newPrice2 * 0.07);

        System.out.println("My second car is sold at 7% discount for $" + newPrice2);

    }
// To display each car's price again.
}

