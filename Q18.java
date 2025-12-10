//Find the Perimeter of a Rectangle
import java.util.Scanner;
class Q18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int peri = 2*(l+b);
        System.out.println("The perimeter is" +peri);
        sc.close();
    }
}
