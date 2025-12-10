//Check whether the input number is a Neon Number
import java.util.Scanner;
class Q17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int a = sc.nextInt();
        int b = a*a;
        int s = 0;
        while(b!=0){
            int d = b%10;
            s = s+d;
            b = b/10;
        }
        if(a==s){
            System.out.println("Neon number");
        }
        else{
            System.out.println("Nope");
        }
        sc.close();
    }
}