

package numberpatterns;
import java.util.Scanner;
public class  zigzagnumberpattern {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();;
        int num =1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
            for(int j=1;j<=i;j++){
                System.out.print(num +" ");
                num++;
            }
        }
            else{int start = num + i - 1;

                for (int j = start; j >= num; j--) {
                    System.out.print(j + " ");
                }

                num += i;
            

            }
        
            System.out.println();
        }
        scan.close();
    }
    
}
