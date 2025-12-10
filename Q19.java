//Calculate Compound Interest
import java.util.Scanner;
class Q19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle, rate of interest and time:");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double ci = (p*Math.pow(1+r/100,t)) - p;
        System.out.println("Compound Interest:" + ci);
        sc.close();
    }
}