package ChapterFour;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args)

    {
        int i,j,n;
        System.out.print("Input number of rows : ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}
