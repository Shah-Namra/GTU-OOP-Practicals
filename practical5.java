//Write a program that prompts the user to enter three integers and display the integers in decreasing order. 
    import java.util.*;

public class practical5 {
    public static void main(String[] args) {
        int temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Integer :");
        int a = scan.nextInt();
        System.out.print("Enter Second Integer :");
        int b = scan.nextInt();
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.print("Enter Third Integer :");
        int c = scan.nextInt();
        if (c > b) {
            if (c > a) {
                temp = c;
                c = b;
                b = a;
                a = temp;
            } 
            else {
                temp = c;
                c = b;
                b = temp;
            }
        }
        System.out.print("Decreasing Order :" + a + " " + b + " " + c);
    }
}

