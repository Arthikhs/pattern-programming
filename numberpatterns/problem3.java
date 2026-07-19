
    
package numberpatterns;
import java.util.Scanner;
public class problem3  {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =n-1;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i);

            }
            System.out.println();
        }
        scan.close();

    }
    
}

    