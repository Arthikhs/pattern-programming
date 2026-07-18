

package basicstarpatterns;
import java.util.Scanner;
public class fullinvetedholowpyramidwithpositive {
    
 public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =n-1;i>=0;i--){
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int k =0;k<(2*i+2);k++){
             
            if(k== 0||  k == 2*i+1||i == 0|| i== n-1){
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


