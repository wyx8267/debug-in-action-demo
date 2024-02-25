public class MultiThreadDemo {
    public static void main(String[] args) {
        // 需求1：t2全部打印完，t1再打印
        // 需求2：t2打印到50，t1打印全部，t2再打印剩余
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        };

        Thread t1 = new Thread(task, "t1");
        Thread t2 = new Thread(task, "t2");
        t1.start();
        t2.start();
    }
}
