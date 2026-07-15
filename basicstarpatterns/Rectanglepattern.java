package basicstarpatterns;
import java.util.Scanner;
public class Rectanglepattern {
    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(" x ");
            }
            System.out.println();
        }
       
    
    scan.close();
    }
}