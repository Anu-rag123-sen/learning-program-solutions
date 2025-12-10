//to find factorial of a number
import java.util.Scanner;
class Q5{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int p = 1;
        if(a==0){
            System.out.println("Factorial is 1");
        }
        else if(a>0){
             for(int i=1; i<=a; i++){
                p= p*i;
             }
             System.out.println("Factorial is:"+p);
        }
        else{
            System.out.println("Invalid number");
        }
        sc.close();
    }
}