public class CountDemo {
    public static void main(String[] args) {
        System.out.println("Args: " + args[0]);
        count(100);
        HomeWork homeWork = new HomeWork(327);
        homeWork.doHomeWork();
        System.out.println("Count completed!");
    }

    public static void count(int to) {
        for (int i = 0; i < to; i++) {
            System.out.println("Current number: " + i);
        }
    }
}
