import java.util.*;

public class pratical10 {
    public static void reverse(int numbers[]) {
        int j = 0, temp;
        while (j <= numbers.length / 2) {
            temp = numbers[j];
            numbers[j] = numbers[numbers.length - 1 - j];
            numbers[numbers.length - 1 - j] = temp;
            j++;
        }
    }
    public static void main(String[] args) {
        int i = 0;
        int num_array[] = new int[10];
        Scanner scan = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.print("Enter at Position " + (i + 1) + " : ");
            num_array[i] = scan.nextInt();
        }
        reverse(num_array);
        System.out.println(" reversing numbers Array :");
        for (i = 0; i < 10; i++) {
            System.out.println("Value at Position " + (i + 1) + " : " + num_array[i]);
        }
    }
}

