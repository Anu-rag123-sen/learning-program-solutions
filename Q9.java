//Fibonacci Series
import java.util.Scanner;
class Q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        int finsum = 0;
        int next = 0;
        for(int i=1; i<=n; i++){
            sum =  a ;
            finsum = finsum + sum ;
            next = a+b;
            a = b;
            b = next;
        }
        System.out.println("Sum of Fibonacci Series:"+ finsum);
        sc.close();
    }
}