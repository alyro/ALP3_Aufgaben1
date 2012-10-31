package ab1.aufgabe2;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * ALP III - Julian
 * <p/>
 * User: Baka
 * Date: 24.10.12
 * Time: 20:18
 * To change this template use File | Settings | File Templates.
 *
 * Soll das wirklich so primitiv umgesetzt werden??
 */
public class LinkedQueue<E> implements Queue<E> {

    LinkedList<E> buffer;

    public LinkedQueue(){
        this.buffer = new LinkedList<E>();
    }

    @Override
    public int size() {
        return this.buffer.size();
    }

    @Override
    public boolean isEmpty() {
        return this.buffer.size() == 0;
    }

    @Override
    public void enqueue(E e) {
        this.buffer.add(e);
    }

    @Override
    public E dequeue() throws EmptyQueueException {
        if (this.size() == 0){
            throw new EmptyQueueException("nicht so geil");
        }
        return this.buffer.removeFirst();
    }
}
