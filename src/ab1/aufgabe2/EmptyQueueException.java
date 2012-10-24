package ab1.aufgabe2;

/**
 * Created with IntelliJ IDEA.
 * ALP III - Julian
 * <p/>
 * User: Baka
 * Date: 24.10.12
 * Time: 17:33
 * To change this template use File | Settings | File Templates.
 */
public class EmptyQueueException extends RuntimeException {

    /**
     * ctor
     * @param s
     */
    public EmptyQueueException(String s){
        super(s);
    }
}
