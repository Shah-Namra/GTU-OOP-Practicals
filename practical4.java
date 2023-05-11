// body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your 
// weight in kilograms and dividing by the square of your height in meters. Write a program that 
// prompts the user to enter a weight in pounds and height in inches and displays the BMI. 
// Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters
import java.util.Scanner;

public class practical4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your weight in pounds: ");
        float w1 = scanner.nextFloat();
        float w2 = w1 * 0.45359f;
        
        System.out.print("Enter your height in inches: ");
        float h1 = scanner.nextFloat();
        float h2 = h1 * 0.0254f;
        
        float bmi = w2/(h2*h2);
        System.out.printf("Your BMI is :" +bmi);
        
        scanner.close();
    }
}
// Weight in kgs = w1 
// Weight in pounds = w2 

// Height in meters = h2
// Height in inches = h1
