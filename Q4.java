//To convert interger numbers to binary numbers
import java.util.Scanner;
class Q4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Binary is : 0");
        }
        else{
            String binary = "";
            while(n>0){
                int remainder = n % 2;
                binary = remainder+binary;
                n = n/2;
            }
            System.out.println("Binary is:"+ binary);
        }
        sc.close();
    }
}