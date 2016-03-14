/**
 * Created by deepdoradla on 11/03/2016.
 */
public class Consumer extends Thread {
    private Box box;

    public Consumer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        int count = 0;

        for(String item = this.box.take(); !item.equals("Done"); item = this.box.take())
        {
            System.out.println("Item taken is " + item);
            count++;
        }

    }
}
