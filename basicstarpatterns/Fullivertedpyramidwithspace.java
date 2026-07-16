
package basicstarpatterns;
import java.util.Scanner;
public class Fullivertedpyramidwithspace {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =n;i>=1;i--){
            for(int j = 0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k =0;k<i;k++){
                System.out.print("* ");
            }



        
        System.out.println();

        }
        scan.close();
    
    }

    
}

