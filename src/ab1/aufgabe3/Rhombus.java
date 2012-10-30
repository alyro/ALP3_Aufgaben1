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
public class Rhombus extends Drache {

    public Rhombus(Point a, Point b, Point c, Point d){
        super(a,b,c,d);
        if (this.getAB() != this.getCD()){
            throw new IllegalArgumentException("All lines must have the same Length for a Rhombus");
        }
    }

    public double flaeche(){
        return (1/2)*this.getDiagonalAC()*this.getDiagonalBD();
    }

    public double umfang(){
        return 4 * this.getAB();
    }
}
