//Write a program that solves the following equation and displays the value x and y: 3.4x+50.2y=44.5 ; 2.1x+.55y=5.9 
//(Assume Cramer’s rule to solve equation ax+by=e x=ed-bf/ad-bc cx+dy=f y=af-ec/ad-bc )
public class practical2 {
    public static void main(String[] args){
        float a = 3.4f, b = 50.2f, c = 2.1f, d = 0.55f, e = 44.5f, f = 5.9f;
          
          
          float x = ((e*d)  - (b*f))    /   ((a*d)  -   (b*c));
          float y = ((a*f)  -   (e*c))   /   ((a*d) -(b*c));
          
          // display the values of x and y
          System.out.println("x = " + x);
          System.out.println("y = " + y);
    }
}
