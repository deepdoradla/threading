/**
 * Created by deepdoradla on 10/03/2016.
 */
public class HelloThread implements Runnable {
    int i;
    public HelloThread(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        for (int j=0; j<i; j++)
        {
            System.out.println("Hello word " + j);
        }

    }
}
