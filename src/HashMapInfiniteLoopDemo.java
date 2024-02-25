import java.util.HashMap;

public class HashMapInfiniteLoopDemo {
    public static void main(String[] args) {
        final HashMap<Integer, Integer> map = new HashMap<>(4, 0.5f);
        map.put(1, 1);
        map.put(9, 9);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                map.put(13, 13);
            }
        };
        Thread t1 = new Thread(task, "hm-1");
        Thread t2 = new Thread(task, "hm-2");
        t1.start();
        t2.start();
    }
}
