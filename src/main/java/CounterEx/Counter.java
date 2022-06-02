package CounterEx;

public class Counter {

    private int count;
    private Lock lock;

    public int getAndAddOne() {
        lock.lock();
        try {
            int ret = count;
            count += 1;
            return ret;
        } finally {
            lock.unlock();
        }
    }
}
