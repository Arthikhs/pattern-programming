package numberpatterns;
import java.util.Scanner;
public class problem14 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        for(int i =0;i<n;i++){
            int logic = (i%2==0) ?1:0;
            for(int j= 0;j<m;j++){
                System.out.print(logic+" ");
                logic = 1-logic;

            }
             System.out.println();
        }
        scan.close();
    }
    
}
