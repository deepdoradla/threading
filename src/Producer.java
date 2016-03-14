import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by deepdoradla on 11/03/2016.
 */
public class Producer extends Thread {

    String items[] = {"Hello", "Deep", "How", "are", "you", "I", "am", "Doing", "fine", "Great!"};

    private Box box;

    public Producer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        int count = 0;
        for(String item : items){
            this.box.put(item);
            count++;
        }
        box.put("Done");
    }
}
