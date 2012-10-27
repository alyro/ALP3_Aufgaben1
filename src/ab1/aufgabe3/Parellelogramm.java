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
public class Parellelogramm extends Trapez {

    public Parellelogramm(Point a, Point b, Point c, Point d){
        super(a,b,c,d);
        if(super.calculateSlope(a,d) != super.calculateSlope(b,c) ||
           super.calculateSlope(a,b) != super.calculateSlope(d,c)){
            throw new IllegalArgumentException("all sides must be parallel (Parallelogramm)");
        }
    }
}
