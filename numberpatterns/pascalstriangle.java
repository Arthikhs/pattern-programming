

package numberpatterns;

import java.util.Scanner;

public class pascalstriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            int num = 1;

          
            for (int j = 0; j <= i; j++) {
                System.out.print(num + "   ");

                
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }

        scan.close();
    }
}