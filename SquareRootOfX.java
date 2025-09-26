import java.util.Scanner;

public class SquareRootOfX {

    public static double SquareRootOfXToN(int x , int n){
return Math.pow(x, n);

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of x ");
        int x = sc.nextInt();
        int n = sc.nextInt();



        System.out.println(SquareRootOfXToN(x, n));




    }
}
