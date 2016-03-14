import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by deepdoradla on 11/03/2016.
 */
public class Box {
    String[] messagequeue;
    static int push = 0;
    static int pop = 0;

    public Box() {
        messagequeue = new String[10];

    }
    public synchronized void put(String message) {
        while(messagequeue[push]!=null) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        this.messagequeue [push]= message;
        push = (++push % 10);
        notifyAll();
        System.out.println("Item inserted " + message);
        return;

    }

    public String take() {
        synchronized(this) {
            while((push==pop)&& (messagequeue[pop]==null)) {
                try {
                    wait();
                } catch (InterruptedException e) {}
            }
            String itemTaken = messagequeue[pop];
            messagequeue[pop] = null;
            pop = (++pop) % 10;
            notifyAll();
            System.out.println("Return " +itemTaken);
            return itemTaken;
        }
    }

}
