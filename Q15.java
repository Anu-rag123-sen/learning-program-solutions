//Check Leap Year
import java.util.Scanner;
class Q15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the year:");
        int year = sc.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not");
        }
        sc.close();
    }
}