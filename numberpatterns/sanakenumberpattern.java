

package numberpatterns;
import java.util.Scanner;
public class sanakenumberpattern {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int num =1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
            for(int j=1;j<=m;j++){
                System.out.print(num +" ");
                num++;
            }
        }
            else{int start = num + m - 1;

                for (int j = start; j >= num; j--) {
                    System.out.print(j + " ");
                }

                num += n;
            

            }
        
            System.out.println();
        }
        scan.close();
    }
    
}
