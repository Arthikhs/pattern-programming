
package numberpatterns;
import java.util.Scanner;
public class numberhourglass4 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j= 0;j<i;j++){
                System.out.print("  ");

            }
            for(int k = n;k>=i+1;k--){
                 System.out.print(k + " ");

            }
            for(int l =i+1;l<=n;l++){
                 System.out.print(l + " ");
            }
       System.out.println();
    }
    for (int i = n - 2; i >= 0; i--) {

    for (int j = 0; j < i; j++) {
        System.out.print("  ");
    }

    for (int k = n; k >= i + 1; k--) {
        System.out.print(k + " ");
    }

    for (int l = i + 1; l <= n; l++) {
        System.out.print(l + " ");
    }

    System.out.println();
}
   sc.close();
}
}

