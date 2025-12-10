//Add 2 complex numbers
import java.util.Scanner;
class Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first real and imaginary numbers:");
        int real1 = sc.nextInt();
        int imag1 = sc.nextInt();
        System.out.println("Enter the second real and imaginary numbers:");
        int real2 = sc.nextInt();
        int imag2 = sc.nextInt();
        int s1 = real1 + real2;
        int s2 = imag1 + imag2;
        System.out.println("Sum is "+ s1 + "+" + s2 +"i" );
        sc.close();
    }
}