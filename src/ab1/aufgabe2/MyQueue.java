package ab1.aufgabe2;

import java.nio.BufferOverflowException;

/**
 * Created with IntelliJ IDEA.
 * ALP III - Julian
 * <p/>
 * User: Baka
 * Date: 24.10.12
 * Time: 17:35
 * To change this template use File | Settings | File Templates.
 */
public class MyQueue<E> implements Queue<E> {

    /**
     * defines the maximum size of the ringbuffer
     */
    private final int MAX_SIZE = 10;

    private int head = 0;
    private int tail = 0;
    private int size = 0;

    private E[] buffer;

    /**
     * ctor
     */
    public MyQueue(){
        this.buffer = (E[]) new Object[MAX_SIZE];
    }

    @Override
    /**
     * calculates the number of elements in the ring buffer
     */
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {
        // check if we overflow the buffer
        if (this.size == MAX_SIZE){
            throw new BufferOverflowException();
        }
        this.buffer[this.tail] = e;
        this.size += 1;
        this.tail = this.incrementPointer(this.tail);
    }

    @Override
    public E dequeue() throws EmptyQueueException {
        if (this.isEmpty()){
            throw new EmptyQueueException("The buffer is empty!");
        }
        E result = this.buffer[this.head];
        this.head = this.incrementPointer(this.head);
        this.size -= 1;
        return result;
    }

    /**
     * increments the pointer in circular way. That means that the pointer is
     * moved to the start of the array if it reaches the end of buffer
     * @param pointer
     * @return
     */
    private int incrementPointer(int pointer){
        return pointer == MAX_SIZE - 1 ?
                0 :             // if tail got at the end of buffer put to front
                pointer + 1;  // else just increment tail
    }
}
