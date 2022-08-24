package ChapterFour;

import java.util.Scanner;

public class DecimalEquivalentOfBinaryNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int binary;
        int decimal = 0;
        int place = 0;

        System.out.print("Enter binary number to convert: ");
        binary = input.nextInt();

        while(binary != 0){
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, place);
            binary /= 10;
            place++;
        }
        System.out.printf("%d = %d\n", binary, decimal);
        System.out.printf("The decimal equivalent of %d is %d", binary, decimal);

    }


//        System.out.println("Enter the binary Number");
//        int binaryNumber = input.nextInt();
//        int duplicatedBinaryNumber = binaryNumber;

//        System.out.printf("The decimal equivalent of %d is %d",duplicatedBinaryNumber,decimalNumber);

}
