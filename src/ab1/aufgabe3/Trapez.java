package ab1.aufgabe3;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created with IntelliJ IDEA.
 * ALP III - Julian
 * <p/>
 * User: Baka
 * Date: 27.10.12
 * Time: 16:26
 * To change this template use File | Settings | File Templates.
 */
public class Trapez extends Viereck {

    protected double h;

    public Trapez(Point a, Point b, Point c, Point d){
        super(a,b,c,d);
        // check if is Trapez
        Line2D ab = new Line2D.Float(a,b);
        Line2D cd = new Line2D.Float(c,d);
        if (this.calculateSlope(ab) == this.calculateSlope(cd)){
            this.h = ab.ptLineDist(d);
        }else{
            Line2D ad = new Line2D.Float(a,d);
            Line2D bc = new Line2D.Float(b,c);
            if (this.calculateSlope(ad) == this.calculateSlope(bc)){
                this.h = ad.ptLineDist(c);
            }else{
                throw new IllegalArgumentException("At least 2 lines must be parallel to form a Trapez");
            }
        }
    }

    @Override
    public double flaeche(){
        return ((this.getAB() + this.getCD())/2) * this.h;
    }

    /**
     * calulates the slope of a line
     * @param line
     * @return
     */
    private double calculateSlope(Line2D line){
        double x1 = line.getP1().getX();
        double y1 = line.getP1().getY();
        double x2 = line.getP2().getX();
        double y2 = line.getP2().getY();
        return (y2 - y1)/(x2 - x1);
    }
}
