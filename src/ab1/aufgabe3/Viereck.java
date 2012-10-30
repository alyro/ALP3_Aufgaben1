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
public class Viereck implements Figur {

    protected final Point a;
    protected final Point b;
    protected final Point c;
    protected final Point d;
    protected double flaeche = -1;
    protected double umfang = -1;

    /**
     *
     * @param a Bottom-Left
     * @param b Bottom-Right
     * @param c Top-Right
     * @param d Top-Left
     */
    public Viereck(Point a, Point b, Point c, Point d){
        // check position of buttons
        // ATTENTION: Natural orientation is used ->
        // (0/0) is Bottom-Left and NOT Top-Left
        if (a.getY() >= d.getY() || a.getX() >= b.getX() ||// check Point a
            b.getY() >= c.getY() || // check Point b
            c.getX() <= d.getX() // check Point c
                // all checks for Point d are done
                ) {
            throw new IllegalArgumentException("The orientation of the Points is wrong. Check documentation");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    // Getter

    public Point getA(){
        return this.a;
    }

    public Point getB(){
        return this.b;
    }

    public Point getC(){
        return this.c;
    }

    public Point getD(){
        return this.d;
    }

    protected double getAB(){
        return this.calculateDistance(this.a,this.b);
    }

    protected double getBC(){
        return this.calculateDistance(this.b,this.c);
    }

    protected double getCD(){
        return this.calculateDistance(this.c,this.d);
    }

    protected double getAD(){
        return this.calculateDistance(this.a,this.d);
    }

    protected double getDiagonalAC(){
        return this.calculateDistance(this.a,this.c);
    }

    protected double getDiagonalBD(){
        return this.calculateDistance(this.b,this.d);
    }


    @Override
    public double flaeche() {
         if (this.flaeche < 0){
             // we only need to calculate this once (lazy loading)
             // Satz des Pythagoras
             double slopeD1 = this.calculateSlope(this.getA(),this.getC());
             double slopeD2 = this.calculateSlope(this.getB(),this.getD());
             double alpha = this.getAngle(slopeD1,slopeD2);
             this.flaeche = (1/2)*slopeD1*slopeD2*Math.sin(alpha);
         }
         return this.flaeche;
    }

    @Override
    public double umfang() {
        if (this.umfang < 0){
            // we only need to calculate this once (lazy loading)
            this.umfang = this.getAB() + this.getBC()+ this.getCD() + this.getAD();
        }
        return this.umfang;
    }

    @Override
    public int compareTo(Figur o) {
        ////return Double.compare(this.flaeche(), o.flaeche());
        double self = this.flaeche();
        double other = o.flaeche();
        return self > other ? 1 : self < other ? -1 : 0;
    }

    /**
     * Attention-> this method cannot calculated angles bigger than 90°!
     * (because m1 and m2 have infinite length)
     * @param m1 slope 1
     * @param m2 slope 2
     * @return
     */
    protected double getAngle(double m1, double m2){
        double a = Math.abs((m1-m2)/(1+(m1*m2)));
        a = Math.atan(a);
        a = Math.toDegrees(a);
        return Double.isNaN(a) ? 90.0 : a;
    }

    /**
     * calculate the slope
     * @param p1
     * @param p2
     * @return
     */
    protected double calculateSlope(Point p1, Point p2){
        Line2D line = new Line2D.Float(p1,p2);
        return calculateSlope(line);
    }

    /**
     * calulates the slope of a line
     * @param line
     * @return
     */
    protected double calculateSlope(Line2D line){
        double x1 = line.getP1().getX();
        double y1 = line.getP1().getY();
        double x2 = line.getP2().getX();
        double y2 = line.getP2().getY();
        return (y2 - y1)/(x2 - x1);
    }

    /**
     * calulates the distance between two points
     * @param p1
     * @param p2
     * @return distance between p1 and p2
     */
    private double calculateDistance(Point p1, Point p2){
        // using pythagorean theorem
        return Math.sqrt(
                Math.pow((p2.getX() - p1.getX()),2) +
                Math.pow((p2.getY() - p1.getY()),2));
    }
}
