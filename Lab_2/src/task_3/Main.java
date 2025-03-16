package task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task №3");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter coordinates corners of the triangle\n");

        System.out.print("\nEnter first point x: ");
        double x1 = scan.nextDouble();
        System.out.print("Enter first point y: ");
        double y1 = scan.nextDouble();
        Point a = new Point(x1, y1);

        System.out.print("\nEnter second point x: ");
        double x2 = scan.nextDouble();
        System.out.print("Enter second point y: ");
        double y2 = scan.nextDouble();
        Point b = new Point(x2, y2);

        System.out.print("\nEnter third point x: ");
        double x3 = scan.nextDouble();
        System.out.print("Enter third point y: ");
        double y3 = scan.nextDouble();
        Point c = new Point(x3, y3);

        Triangle abc = new Triangle(a,b,c);
        System.out.println("\nTriangle: " + abc);
        Segment ab = new Segment(a,b);
        Segment bc = new Segment(b,c);
        Segment ac = new Segment(a,c);
        if ((ab.length()==0)||(bc.length()==0)||(ac.length()==0)){
            System.out.println("This Triangle NOT Exist");
            return;
        }
        if ((ab.length() >= (bc.length()+ac.length()))||(bc.length() >= (ab.length()+ac.length()))||(ac.length() >= (ab.length()+bc.length()))){
            System.out.println("This Triangle NOT Exist");
            return;
        }
        double sTriangle = Triangle.area(ab,bc,ac);
        System.out.println("Area of Triangle: " + sTriangle);
        System.out.println("Centroid of Triangle: " + Triangle.centroid(a, b, c));
    }
}
