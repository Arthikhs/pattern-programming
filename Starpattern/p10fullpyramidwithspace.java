
package Starpattern;
import java.util.Scanner;
public class p10fullpyramidwithspace {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = n;i>0;i--){
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");

            }
            for(int k = 0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        scan.close();
    }
}
