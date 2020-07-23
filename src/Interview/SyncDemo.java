package Interview;

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class SyncDemo {

    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                c.increment();
            }
        });
        t1.start();
        t2.start();

        Thread.sleep(20);
        System.out.println(c.count);
    }

}
