import java.util.*;

public class practical6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Character : ");
        char ch = scan.next().charAt(0);
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.print(ch + " is vowel");
                break;
            default:
                System.out.print(ch + " is constant");
        }
    }
}


