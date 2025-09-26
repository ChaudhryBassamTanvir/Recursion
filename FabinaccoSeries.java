import java.util.Scanner;

public class FabinaccoSeries {


public static void fabinaccoSeries(int n ,int a, int b ){
    if (n==0) {
        return ;
        
    }


    System.out.print(a +" ");
  fabinaccoSeries(n-1, b, a+b);
//  int fabinacco_=a+b;
//  int temp = fabinacco_;
//  a=b;
//  b=temp;
//  return fabinacco_;


}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Please enter the value of n to cal fabinacco ");
int n= sc.nextInt();
int a=0;
int b=1;

fabinaccoSeries(n,a,b);
    }
}
