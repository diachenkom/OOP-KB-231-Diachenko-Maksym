public class Circle extends Figure {
    public double radius;

    public Circle(Point point1, double radius) {
        super(point1);
        this.radius = radius;
        if (radius <=0){
            System.out.println("This Circle not exist: Radius=" + radius);
            Main.figureExist = false;
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString(){
        return "Circle[(" + x + "," + y + ") " + radius + "]";
    }
}
