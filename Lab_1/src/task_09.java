import java.util.Scanner;
import static java.lang.Math.sqrt;

public class task_09 {
    public static void main(String[] argv){
        System.out.println("Task 9");
        Scanner scan = new Scanner(System.in);
        System.out.println("The quadratic equation has the form ax^2+bx+c=0.");
        System.out.println("Enter a:");
        float a = scan.nextFloat();
        System.out.println("Enter b:");
        float b = scan.nextFloat();
        System.out.println("Enter c:");
        float c = scan.nextFloat();

        float d = b*b - 4*a*c;
        if (d < 0){
            System.out.println("No root");
        }
        else if (d == 0){
            float x1 = (-b) / 2*a;
            System.out.println("ONE root: " + x1);
        }
        else if (d > 0){
            float x1 = ((-b) + (float)sqrt(d)) / (2*a);
            float x2 = ((-b) - (float)sqrt(d)) / (2*a);
            System.out.println("TWO roots: " + x1 + " and " + x2);
        }
    }
}