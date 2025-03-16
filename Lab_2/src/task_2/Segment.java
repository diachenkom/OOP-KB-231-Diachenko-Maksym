package task_2;
import static java.lang.Math.*;

public class Segment {
    Point firstPoint, secondPoint;
    public Segment(Point firstPoint, Point secondPoint){
        if (firstPoint.x == secondPoint.x && firstPoint.y == secondPoint.y) {
            System.out.println("This Segment NOT exist: start Point and end Point must be different");
            return;
        }
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public double length(Point firstPoint, Point secondPoint){
        return sqrt(pow((firstPoint.x - secondPoint.x), 2) + pow((firstPoint.y - secondPoint.y), 2));
    }

    public Point middle(Point firstPoint, Point secondPoint){
        double xMid = (firstPoint.x + secondPoint.x) / 2;
        double yMid = (firstPoint.y + secondPoint.y) / 2;
        return new Point(xMid, yMid);
    }

    public Point intersectSegm(Segment another){
        Line line1 = new Line((secondPoint.y - firstPoint.y) / (secondPoint.x - firstPoint.x),
                firstPoint.y - ((secondPoint.y - firstPoint.y) / (secondPoint.x - firstPoint.x)) * firstPoint.x);
        Line line2 = new Line((another.secondPoint.y - another.firstPoint.y) / (another.secondPoint.x - another.firstPoint.x),
                another.firstPoint.y - ((another.secondPoint.y - another.firstPoint.y) / (another.secondPoint.x - another.firstPoint.x)) * another.firstPoint.x);

        Point intersectionPoint = line1.intersection(line2);
        if (intersectionPoint == null) {
            return null;
        }
        if (isPointOnSegment(intersectionPoint, this) && isPointOnSegment(intersectionPoint, another)) {
            return intersectionPoint;
        }
        return null;
    }

    private boolean isPointOnSegment(Point p, Segment segment) {
        return min(segment.firstPoint.x, segment.secondPoint.x) <= p.x && p.x <= max(segment.firstPoint.x, segment.secondPoint.x) &&
                min(segment.firstPoint.y, segment.secondPoint.y) <= p.y && p.y <= max(segment.firstPoint.y, segment.secondPoint.y);
    }
}