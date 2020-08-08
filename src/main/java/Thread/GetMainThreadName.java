package Thread;

public class GetMainThreadName {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread name: " + t.getName());

        t.setName("Pairui");
        System.out.println("Thread name after setting: " + t.getName());
    }
}
