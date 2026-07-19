package numberpatterns;
import java.util.Scanner;
public class problem6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();;
   
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print(j);
                
            }
            System.out.println();
        }
        scan.close();
    }
    
}
