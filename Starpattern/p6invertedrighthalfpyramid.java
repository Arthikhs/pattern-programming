

package Starpattern;
import java.util.Scanner;
public class p6invertedrighthalfpyramid{
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = n;i>=0;i--){
            for(int j = 0;j<=i;j++){
    
                System.out.print(" x ");
            
            }
            System.out.println();


        }
        scan.close();
    }
    
}
