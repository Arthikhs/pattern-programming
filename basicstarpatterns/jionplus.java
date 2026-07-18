
package basicstarpatterns;


import java.util.Scanner;

public class jionplus{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            int width = 2 * i + 1;

            for (int k = 0; k < width; k++) {
                if(i==n-1 || k==width/2){

                
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }

            System.out.println();
        }

        
        for (int i = n - 2; i >= 0; i--) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            int width = 2 * i + 1;
            for (int k = 0; k < width; k++) {
                   if( k==width/2){

                
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }

            System.out.println();
        }

        scan.close();
    }
}
    

