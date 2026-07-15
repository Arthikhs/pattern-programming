package basicstarpatterns;
import java.util.Scanner;
public class Hollowrectangle {
    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i == 1||  i == n|| j ==1 || j ==m){
                System.out.print("x ");
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

    

