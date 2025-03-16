package task_3;

public class Triangle {
    public Point a, b, c;
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String toString(){
        return ("Corner A = "+ a + ", Corner B = " + b + ", Corner C = "+ c);
    }
    public static double area(Segment ab, Segment bc, Segment ac){
        double AB = ab.length();
        double BC = bc.length();
        double AC = ac.length();
        double p = (AB + BC + AC)/2;
        return Math.sqrt(p*(p-AB)*(p-BC)*(p-AC));
    }
    public static Point centroid(Point a, Point b, Point c){
        double Mx = (b.x + c.x)/2;
        double My = (b.y + c.y)/2;
        Point M = new Point(Mx,My);
        System.out.println("Point M (mediana AM): " +M);
        double Ox = a.x + (Mx - a.x) * 2.0/3.0;
        double Oy = a.y + (My - a.y) * 2.0/3.0;
        return new Point(Ox,Oy);
    }

}
