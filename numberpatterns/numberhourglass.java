package numberpatterns;
import java.util.Scanner; 
public class numberhourglass {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = n;i>=0;i--){
            for(int j= 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int k= 0;k<=2*i+1;k++){
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int i = 0;i<n;i++){
            for(int j= 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int k= 0;k<=2*i+1;k++){
                System.out.print("* ");
            }
            System.out.println();

        }
        scan.close();

}

    
}
