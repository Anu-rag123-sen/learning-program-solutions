//Display All Prime Numbers from 1 to N
import java.util.Scanner;
class Q14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit value:");
        int n = sc.nextInt();
        for(int i=2; i<=n; i++){
            int c = 0;
            for(int j=1; j<=i; j++){
                if(i % j ==0){
                    c++;
                }
            }
            if(c==2){
                System.out.println("The prime numbers are:" + i);
            }
        }
        sc.close();
    }
}