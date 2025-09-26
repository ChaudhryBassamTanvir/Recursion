import java.util.Scanner;

public class StackHeightLogn {

 public static int StackHeightLogNcomplexity(int x , int n){
        if (n==0) {
            return 1;

            
        }

        if (x==0) {
            return 0;
        }
    
    
    //if n==even
    if (n%2==0) {
     return   StackHeightLogNcomplexity(x, n/2) * StackHeightLogNcomplexity(x, n/2);
        
    }else{


        return StackHeightLogNcomplexity(x, n/2) * StackHeightLogNcomplexity(x, n/2) * x;
    }
    
    }
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the value of x ");
        int x = sc.nextInt();
        int n = sc.nextInt();


System.out.println(StackHeightLogNcomplexity(x, n));

    }
}
