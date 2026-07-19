package numberpatterns;
import java.util.Scanner;
public class problem8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();;
   
       for(int i= 1;i<=n;i++){
        System.out.println(i);
       }
       for(int i = n-2; i>=1;i--){
        System.out.println(i);
       }
            
            
        scan.close();
    }
    
}
