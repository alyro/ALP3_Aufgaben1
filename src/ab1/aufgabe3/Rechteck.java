package ab1.aufgabe3;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * ALP III - Julian
 * <p/>
 * User: Baka
 * Date: 27.10.12
 * Time: 16:27
 * To change this template use File | Settings | File Templates.
 */
public class Rechteck extends Parellelogramm {

    private static Point calculateC(Point d, Point b){
        return new Point((int)b.getX(), (int)d.getY());
    }

    private static Point calculateA(Point d, Point b){
        return new Point((int)d.getX(), (int)b.getY());
    }

    /**
     * ctor
     * @param d Top-Left
     * @param b Bottom-Right
     */
    public Rechteck(Point d, Point b){
        super(Rechteck.calculateA(d,b),b,Rechteck.calculateC(d,b),d);
        // is Rechteck?
        if(this.getDiagonalAC() != this.getDiagonalBD() || // diagonalen müssen gleich-lang sein
            this.getAngle(this.calculateSlope(this.a, this.d),  // delta ist nicht 90°
                this.calculateSlope(this.d, this.c))
                   != 90.0  ||
           this.getAngle(this.calculateSlope(this.a, this.b), // beta ist nicht 90°
                   this.calculateSlope(this.b, this.c))
                   != 90.0
                ){
            throw new IllegalArgumentException("diagonales must have same length and all angles must be 90° (Rechteck)");
        }
    }

    public double flaeche(){
        return this.getAD() * this.getAB();
    }
}
