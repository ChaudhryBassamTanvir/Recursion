import java.util.Scanner;

public class Print_Sum_Natural_Numbers_Recursion {

public static void printSumOfNaturalNumbers(int n, int sum){
if (n==0) {
    System.out.println("The sum of your natural numbers are "+ sum);
    return;
    
}
sum+=n;
printSumOfNaturalNumbers(n-1, sum);



}

    public static void main(String[] args) {
        

Scanner sc = new Scanner(System.in);
System.out.println("Please enter the value of n ");
int n= sc.nextInt();

int sum=0;
printSumOfNaturalNumbers(n,sum);
        
    }
}
