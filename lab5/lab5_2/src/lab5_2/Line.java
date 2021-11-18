package lab5_2;
import java.awt.geom.Point2D;
import static java.lang.Double.NaN;
public class Line {
    private double x = NaN ;
    private double m = NaN ;
    private double b = NaN ;
    public Line(double x1, double y1,double x2,double y2){
        this.m=(y2-y1)/(x2-x1);
        this.b=y1-m*x1;
    }
    public Line(double x, double y,double m){

        this.m=m;
        this.b=y-m*x;
    }
    public Line (double m,double b){
        this.b=b;
        this.m=m;
    }
    public Line(double a){
        this.x=a;
    }
    public boolean isEquals(Line line){
        return this.m==line.m;
    }
    public boolean isParallel(Line line){
        return this.m==line.m;
    }
    public boolean isIntersect(Line line){
        return this.m!=line.m;
    }
    public Point2D.Double getIntersectionPoint(Line line)
    {
        Double linemObject = line.m;
        Double mObject = m;
        Double X;
        Double Y;
        if (mObject.isNaN())
        {
            X = this.x;
        }
        else if (linemObject.isNaN())
        {
            X = line.x;
        }
        else
        {
            X = b-line.b/line.m-m;
        }
        Y = m*X+b;

        Point2D.Double point = new Point2D.Double(X,Y);
        if (X.isInfinite() || Y.isInfinite() || X.isNaN() || Y.isNaN())
        {
            return null;
        }
        else
        {
            return point;
        }
    }
}