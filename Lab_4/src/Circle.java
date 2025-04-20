public class Circle extends Figure {
    private final Point centre;
    private final double radius;
    public Circle(Point centre, double radius) {
        this.centre = centre;
        this.radius = radius;
        if (radius <=0){
            System.out.println("This Circle not exist: Radius=" + radius);
            Main.figureExist = false;
        }
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public Point centroid() {
        return centre;
    }
    @Override
    public String toString(){
        return "Circle [" + centre + ", " + radius + "]";
    }
}
