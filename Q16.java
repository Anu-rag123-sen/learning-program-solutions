//Check Armstrong Number between Two Integers
import java.util.Scanner;
class Q16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt();
        int n=a;
        int s=0;
        while(n!=0){
            int d=n%10;
            s=s+(d*d*d);
            n = n/10;
        }
        if(s==a){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not");
        }
        sc.close();
    }
}