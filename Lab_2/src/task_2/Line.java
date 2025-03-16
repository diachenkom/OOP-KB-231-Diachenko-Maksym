package task_2;

public class Line {
    public double k, b;
    public Line(double k, double b){
        this.k = k;
        this.b = b;
    }
    public Point intersection(Line other) {
        if (this.k == other.k) {
            return null;
        }
        double x = (other.b - this.b) / (this.k - other.k);
        double y = this.k * x + this.b;
        return new Point(x, y);
    }
}