package numberpatterns;


import java.util.Scanner;

public class binarytriangle{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            int binary = (i % 2 == 0) ? 0 : 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(binary + " ");
                binary = 1 - binary; 
            }

            System.out.println();
        }

        scan.close();
    }
}