package ab1.aufgabe1;

/**
 * Created with IntelliJ IDEA.
 * ALP III - Julian
 * <p/>
 * User: Baka
 * Date: 24.10.12
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 *
 * This Exception gets thrown when an amount that is supposed to be positive
 * is not
 */
public class BetragNotPositiveException extends RuntimeException {

    /**
     * ctor
     * @param s
     */
    public BetragNotPositiveException(String s){
        super(s);
    }

    // ... do stuff
}
