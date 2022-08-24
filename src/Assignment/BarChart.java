package Assignment;

import java.util.Scanner;
public class BarChart {
    public static void main(String[] args){

        BarChart asterik = new BarChart();

        int nb[]=new int[5];
        Scanner input = new Scanner (System.in);
        for(int i=0; i<5; i++)
        {
            System.out.println("Please, Enter a number between 1 - 30 ");
            nb[i]=input.nextInt();
        }
        input.close();
        asterik.asteriskGenerator(nb);
    }
    void asteriskGenerator(int nb[])
    {
        for(int i = 0; i <  nb.length; i++)
        {
            for(int j=1; j<=nb[i]; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
