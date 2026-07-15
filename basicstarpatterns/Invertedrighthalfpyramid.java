
package basicstarpatterns;
import java.util.Scanner;
public class  Invertedrighthalfpyramid{
    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =0;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" x ");
            }
            System.out.println();
        }
       
    
    scan.close();
    }
}
