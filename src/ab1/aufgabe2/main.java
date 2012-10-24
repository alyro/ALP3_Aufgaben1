package ab1.aufgabe2;

/**
 * Created with IntelliJ IDEA.
 * ALP III - Julian
 * <p/>
 * User: Baka
 * Date: 24.10.12
 * Time: 16:34
 * To change this template use File | Settings | File Templates.
 */
public class main {
    public static void main(String[]args){

        Queue<Integer> q = new LinkedQueue<Integer>(); //new MyQueue<Integer>();

        System.out.println("SIZE: " + q.size() + "| isEmpty? " + q.isEmpty());

        for(int i = 0; i <= 9; i++){
            try{
            q.enqueue(i);
            }catch (Exception e){
                System.out.println("error! at " + i);
            }
        }

        System.out.println("dequeue");
        for (int i = 0; i <= 4; i++){
            System.out.println(q.dequeue());
        }

        for(int i = 0; i <= 4; i++){
            try{
                q.enqueue(i);
            }catch (Exception e){
                System.out.println("error! at " + i);
            }
        }

        System.out.println("dequeue");
        for (int i = 0; i <= 9; i++){
            System.out.println(q.dequeue());
        }

        try{
            System.out.println(q.dequeue());
        }catch (Exception e){
            System.out.println("err at dequeue");
        }

        System.out.println("SIZE: " + q.size() + "| isEmpty? " + q.isEmpty());



    }
}
