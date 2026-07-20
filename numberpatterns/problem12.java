package numberpatterns;
import java.util.Scanner;

public class problem12 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int k =0;k<(2*i+1);k++){
                 if(k== 0||  k == 2*i|| i==n-1){
                System.out.print((i+1) + " ");
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
    

