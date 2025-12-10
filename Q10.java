//Check Even or Odd Integers
import java.util.Scanner;
class Q10{
    public static void main(String[ ]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int a = sc.nextInt();
        if(a<0){
            System.out.println("Invalid input");
        }
        else{
            if(a%2==0){
                System.out.println("Number is even");
            }
            else{
                System.out.println("Number is odd");
            }
        }
        sc.close();
    }
}