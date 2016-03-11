import java.util.List;

/**
 * Created by deepdoradla on 11/03/2016.
 */
public class Box {
    Boolean empty = true;
    String item;


    public synchronized String take()
    {
        while(empty){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("I have sucessfully taken the item");
        empty = true;
        notifyAll();
        return this.item;
    }

    public synchronized void put(String item)
    {
        while (!empty){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("I have sucessfully inserted the item");
        empty = false;
        this.item = item;
        notifyAll();
        return;
    }
}
