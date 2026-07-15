package basicstarpatterns;
import java.util.Scanner;
public class  Righthalfpyramid{
    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" x ");
            }
            System.out.println();
        }
       
    
    scan.close();
    }
}
