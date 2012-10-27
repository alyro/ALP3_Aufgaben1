package ab1.aufgabe3;

import java.awt.*;

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
        return this.a.distance(this.b);
    }

    protected double getBC(){
        return this.b.distance(this.c);
    }

    protected double getCD(){
        return this.c.distance(this.d);
    }

    protected double getAD(){
        return this.a.distance(this.d);
    }


    @Override
    public double flaeche() {
         if (this.flaeche < 0){
             // we only need to calculate this once (lazy loading)
             // gaußsche Trapezformel:
             this.flaeche =
                     (1/2) * Math.abs(
                        ((this.a.getY() - this.c.getY())*
                        (this.d.getX() - this.b.getX()))+
                        ((this.b.getY() - this.d.getY())*
                        (this.a.getX() - this.c.getX()))
                     );
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
        return Double.compare(this.flaeche(), o.flaeche());
    }
}
