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
public class Drache extends Viereck {

    public Drache(Point a, Point b, Point c, Point d){
        super(a,b,c,d);
        // is Drache?
        if (this.getAB() != this.getAD() ||
            this.getBC() != this.getCD()){
            throw new IllegalArgumentException("neighbor lines must have the same length");
        }
    }

    public double flaeche(){
        return ((this.getDiagonalAC() * this.getDiagonalBD()) / 2);
    }

    public double umfang(){
        return 2 * (this.getAB() + this.getBC());
    }

}
