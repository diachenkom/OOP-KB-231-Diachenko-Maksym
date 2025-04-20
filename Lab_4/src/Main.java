public class Main {
    public static boolean figureExist = true;
    public static void main(String[] args) {

//  Створення обєкта Circle (коло) по заданій точці-центру кола і радіусу:
        Point centre = new Point(1, 2);
        Circle circle = new Circle(centre, 3);
// Якщо Фігура не існує - програма припиняє роботу.
        if (!figureExist){
            System.exit(0);
        }
        System.out.println(circle);
        System.out.println("Area of Circle is: " + circle.area());
        System.out.println("Centroid of Circle: " + circle.centroid());

//  Створення обєкта Triangle (3-кутник) по 3-х заданих точках:
        Point a = new Point(0,0);
        Point b = new Point(1,2);
        Point c = new Point(2,0);
        Triangle triangle = new Triangle(a, b, c);
        if (!figureExist){
            System.exit(0);
        }
        System.out.println(triangle);
        System.out.println("Area of Triangle is: " + triangle.area());
        System.out.println("Centroid of Triangle: " + triangle.centroid());

//  Створення обєкта Quadrangle (4-кутник) по 4-х заданих точках:
        Point a1 = new Point(0,0);
        Point b1 = new Point(1,2);
        Point c1 = new Point(2,0);
        Point d1 = new Point(1,-2);
        Quadrangle quadrangle = new Quadrangle(a1, b1, c1, d1);
        if (!figureExist){
            System.exit(0);
        }
        System.out.println(quadrangle);
        System.out.println("Area of Quadrangle is: " + quadrangle.area());
        System.out.println("Centroid of Quadrangle: " + quadrangle.centroid());
    }
}