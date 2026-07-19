package numberpatterns;
import java.util.Scanner;
public class problem1numberdiamod {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        for(int i =0;i<n;i++){
            for(int j =0;j<n-i-1;j++){
                System.out.print("  ");
            }

                 for (int k = 1; k <=  i + 1; k++) {
                System.out.print(k);
            }
            for (int l = i; l >=1;l--) {
                System.out.print(l);
            }
                System.out.println();          
            }
            scan.close();

        }
    }

    

    

