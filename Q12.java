//Find LCM of 2 numbers
import java.util.Scanner;
class Q12{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = (a > b) ? a : b;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
                break;
            }
            lcm++;
        }
        sc.close();
    }
}