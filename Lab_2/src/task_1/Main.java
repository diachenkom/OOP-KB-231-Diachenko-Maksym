package task_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task №1");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first line k1: ");
        double k1 = scan.nextDouble();
        System.out.print("Enter first line b1: ");
        double b1 = scan.nextDouble();
        System.out.println("First line is: y=" + k1 + "x+" + b1);
        Line line1 = new Line(k1, b1);

        System.out.print("\nEnter second line k2: ");
        double k2 = scan.nextDouble();
        System.out.print("Enter second line b2: ");
        double b2 = scan.nextDouble();
        System.out.println("Second line is: y=" + k2 + "x+" + b2);
        Line line2 = new Line(k2, b2);
        System.out.println("\nIntersection point. " + line1.intersection(line2));
    }
}