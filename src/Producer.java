/**
 * Created by deepdoradla on 11/03/2016.
 */
public class Producer extends Thread {

    String items[] = {"Hello", "Deep", "How", "are", "you", "I", "am", "Doing", "fine", "Great!"};
    Box box;

    public Producer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {

        for(String item : items){
            this.box.put(item);
        }
        box.put("Done");
    }
}
