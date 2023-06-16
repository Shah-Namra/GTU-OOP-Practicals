import java.util.*;
public class practical8 {
    public static void main(String[] args) {
        int div = 2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Integer Value : ");
        int number = scan.nextInt();
        while (number > 1) {
            if (number % div == 0) {
                System.out.print(div + ",");
                number = number / div;
            } else {
                div++;
            }
        }
    }
}
