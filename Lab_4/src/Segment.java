import static java.lang.Math.*;

public class Segment {
    public Point firstPoint, secondPoint;
    public Segment(Point firstPoint, Point secondPoint) {
        if (firstPoint.x == secondPoint.x && firstPoint.y == secondPoint.y) {
            System.out.println("This Segment is NOT exist: start Point and end Point must be different");
        }
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public double length() {
        return sqrt(pow(secondPoint.x - firstPoint.x, 2) + pow(secondPoint.y - firstPoint.y, 2));
    }
}