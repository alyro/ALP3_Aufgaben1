package ab1.aufgabe3;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * ALP III - Julian
 * <p/>
 * User: Baka
 * Date: 24.10.12
 * Time: 16:35
 * To change this template use File | Settings | File Templates.
 */
public class main {
    public static void main(String[]args){

        Point d = new Point(0,5);
        Point b = new Point(5,0);

        double dist1 = Viereck.calculateDistance(d,b);
        double dist2 = Viereck.calculateDistance(b, d);
        double dist3 = d.distance(b);

        System.out.println("#1: " + dist1 + " - #2: " + dist2 + " - #3: " + dist3);

    }
}
