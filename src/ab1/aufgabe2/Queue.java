package ab1.aufgabe2;

/**
 * Created with IntelliJ IDEA.
 * ALP III - Julian
 * <p/>
 * User: Baka
 * Date: 24.10.12
 * Time: 17:34
 * To change this template use File | Settings | File Templates.
 */
public interface Queue<E> {
    public int size();
    public boolean isEmpty();
    public void enqueue(E e);
    public E dequeue() throws EmptyQueueException;
}
