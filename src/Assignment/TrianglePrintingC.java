package Assignment;

public class TrianglePrintingC {
    public static void main(String[] args) {
        for (int count = 0; count < 10; count++) {
            for(int index=1; index < count+1; index++)
                System.out.print(" ");
            for(int star=10; star > count; star--)
                System.out.print("*");
            System.out.println();
        }
    }
}
