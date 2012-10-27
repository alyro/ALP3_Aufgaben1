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
public class Quadrat extends Rechteck{

    protected static Point calculateB(Point d, int length){
        return new Point((int)d.getX() + length, (int)d.getY() - length);
    }

    public Quadrat(Point d, int length){
        super(d,Quadrat.calculateB(d, length));
    }

    public double flaeche(){
        return Math.sqrt(this.getAB());
    }

    public double umfang(){
        return 4 * this.getAB();
    }
}
