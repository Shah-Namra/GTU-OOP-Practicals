//3 Write a program that reads a number in meters, converts it to feet, and displays the result.
import java.util.*;
public class practical3 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in)
        System.out.println("Enter the length in meters");
        float meters = scan.nextFloat();

        float feet = meters * 3.28084f;
    
        System.out.println(meters + " meters is equal to " + feet + " feet.");
    }    
}
