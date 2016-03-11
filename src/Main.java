/**
 * Created by deepdoradla on 10/03/2016.
 */
public class Main{

    static int i = 100;
    static Thread t;
    static Thread t1;


    public static void main(String args[]) {
        Box box = new Box();

        Producer p1 = new Producer(box);
        Consumer c1 = new Consumer(box);
        Producer p2 = new Producer(box);
        Consumer c2 = new Consumer(box);

        p1.start();
        c1.start();
        p2.start();
        c2.start();
    }


}




