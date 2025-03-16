package task_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task №2");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter coordinates of first segment\n");
        System.out.print("Enter first point x: ");
        double x1 = scan.nextDouble();
        System.out.print("Enter first point y: ");
        double y1 = scan.nextDouble();
        Point firstPoint1 = new Point(x1, y1);

        System.out.print("Enter second point x: ");
        double x2 = scan.nextDouble();
        System.out.print("Enter second point y: ");
        double y2 = scan.nextDouble();
        Point secondPoint1 = new Point(x2, y2);

        System.out.print("\nEnter coordinates of second segment\n");
        System.out.print("Enter first point x: ");
        double x3 = scan.nextDouble();
        System.out.print("Enter first point y: ");
        double y3 = scan.nextDouble();
        Point firstPoint2 = new Point(x3, y3);

        System.out.print("Enter second point x: ");
        double x4 = scan.nextDouble();
        System.out.print("Enter second point y: ");
        double y4 = scan.nextDouble();
        Point secondPoint2 = new Point(x4, y4);

        Segment segment1 = new Segment(firstPoint1, secondPoint1);
        Segment segment2 = new Segment(firstPoint2, secondPoint2);

        System.out.println("\nLength of segment1: " + segment1.length(firstPoint1, secondPoint1));
        System.out.println("Middle point of segment1. " + segment1.middle(firstPoint2, secondPoint2));
        System.out.println("Intersection of segments. " + segment1.intersectSegm(segment2));
    }
}