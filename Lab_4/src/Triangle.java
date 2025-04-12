public class Triangle extends Figure {
    public Point a, b, c;
    public Triangle(Point a, Point b, Point c){
        super(a);
        this.a = a;
        this.b = b;
        this.c = c;
        Segment ab = new Segment(a,b);
        Segment bc = new Segment(b,c);
        Segment ac = new Segment(a,c);
        if ((ab.length()==0)||(bc.length()==0)||(ac.length()==0)){
            System.out.println("This Triangle NOT Exist");
            Main.figureExist = false;
        }
        if ((ab.length() >= (bc.length()+ac.length()))||(bc.length() >= (ab.length()+ac.length()))||(ac.length() >= (ab.length()+bc.length()))){
            System.out.println("This Triangle NOT Exist");
            Main.figureExist = false;
        }
    }

    public static double getArea(Point a, Point b, Point c){
        double AB = new Segment(a,b).length();
        double BC = new Segment(b,c).length();
        double AC = new Segment(a,c).length();
        double p = (AB + BC + AC)/2;
        return Math.sqrt(p*(p-AB)*(p-BC)*(p-AC));
    }

    public Point getCentroid(Point a, Point b, Point c){
        double Mx = (b.x + c.x)/2;
        double My = (b.y + c.y)/2;
        double Ox = a.x + (Mx - a.x) * 2.0/3.0;
        double Oy = a.y + (My - a.y) * 2.0/3.0;
        return new Point(Ox,Oy);
    }

    public String toString(){
        return "Triangle[A("+ a.x +","+ a.y +") B("+ b.x +","+ b.y +") C("+ c.x +","+ c.y +")]";
    }
}

