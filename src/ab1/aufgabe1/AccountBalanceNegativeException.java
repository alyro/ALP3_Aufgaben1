package ab1.aufgabe1;

/**
 * Created with IntelliJ IDEA.
 * ALP III - Julian
 * <p/>
 * User: Baka
 * Date: 24.10.12
 * Time: 17:23
 * To change this template use File | Settings | File Templates.
 *
 * Rises when an account is negative though that is not allowed yet
 */
public class AccountBalanceNegativeException extends RuntimeException {

    /**
     * ctor
     * @param s
     */
    public AccountBalanceNegativeException(String s){
        super(s);
    }

    // blablal do even more stuff
}
