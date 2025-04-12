
public class Main {
    public static boolean figureExist = true;
    public static void main(String[] args) {

//  Створення обєкта Circle по заданій точці-центру кола і радіусу:
        Point centre = new Point(1, 2);
        Circle circle = new Circle(centre, 3);
        if (!figureExist){
            System.exit(0);
        }
        System.out.println(circle);
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Centroid of Circle is (" + centre.x + ", " + centre.y + ")");

//  Створення обєкта Triangle по 3-х заданих точках:
        Point a = new Point(0,0);
        Point b = new Point(1,2);
        Point c = new Point(2,0);
        Triangle triangle = new Triangle(a, b, c);
        if (!figureExist){
            System.exit(0);
        }
        System.out.println(triangle);
        System.out.println("Area of Triangle: " + Triangle.getArea(a, b, c));
        Point centroid1 = triangle.getCentroid(a, b, c);
        System.out.println("Centroid of Triangle: " + "(" + centroid1.x + ", "+ centroid1.y + ")");

//  Створення обєкта Quadrangle по 4-х заданих точках:
        Point a1 = new Point(0,0);
        Point b1 = new Point(1,2);
        Point c1 = new Point(2,0);
        Point d1 = new Point(1,-2);
        Quadrangle quadrangle = new Quadrangle(a1, b1, c1, d1);
        if (!figureExist){
            System.exit(0);
        }
        System.out.println(quadrangle);
        System.out.println("Area of Quadrangle is: " + Quadrangle.getArea(a1, b1, c1, d1));
        Point centroid2 = quadrangle.getCentroid(a1, b1, c1, d1);
        System.out.println("Centroid of Quadrangle is: (" + centroid2.x + ", " + centroid2.y + ")");
    }
}