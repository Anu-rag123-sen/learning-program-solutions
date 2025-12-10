//Find GCD or HCF of 2 numbers
import java.util.Scanner;
class Q13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD is:" + a);
        sc.close();
    }
}