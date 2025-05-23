public class Quadrangle extends Figure {
    private Point a, b, c, d;
    public Quadrangle(Point a, Point b, Point c, Point d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        Segment ab = new Segment(a,b);
        Segment bc = new Segment(b,c);
        Segment cd = new Segment(c,d);
        Segment ad = new Segment(a,d);
        if ((ab.length()==0)||(bc.length()==0)||(cd.length()==0)||(ad.length()==0)) {
            System.out.println("This Quadrangle NOT Exist");
            Main.figureExist = false;
        }
    }

    @Override
    public double area(){
        double area1 = 0.5*((a.x*b.y + b.x*c.y + c.x*d.y + d.x*a.y) - (a.y*b.x + b.y*c.x + c.y*d.x + d.y*a.x));
        return Math.abs(area1);
    }

    @Override
    public Point centroid(){
        double Mx = (a.x+b.x+c.x+d.x)/4;
        double My = (a.y+b.y+c.y+d.y)/4;
        return new Point(Mx,My);
    }

    @Override
    public String toString(){
        return "\nQuadrangle [A"+ a +" B"+ b +" C"+ c +" D"+ d +"]";
    }
}
