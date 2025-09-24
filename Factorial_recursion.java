import java.util.Scanner;

public class Factorial_recursion {


    public static int factorial(int n){


if (n==0 || n==1) {

    return 1;
}
if (n<0) {
    System.out.println("Factorial of Negative number is not possible ");
    
}

int fact_num1= factorial(n-1);
int fact_n= n*fact_num1;
return fact_n;



    }
    public static void main(String[] args) {
      
        
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the value of n to cal fictorial ");
int n= sc.nextInt();
System.out.println(factorial(n));

    }
}
