public class CountDemo {
    public static void main(String[] args) {
        count(100);
        System.out.println("Count completed!");
    }

    public static void count(int to) {
        for (int i = 0; i < to; i++) {
            System.out.println("Current number: " + i);
        }
    }
}
