//Check whether input character is vowel or consonant
import java.util.Scanner;
class Q20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr any character:");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if(ch>='a' && ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }
        else{
            System.out.println("Inavalid character");
        }
        sc.close();
    }
}