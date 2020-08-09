package Thread;

public class PingPongRunnable implements Runnable {
    private String word;
    private int delay;

    PingPongRunnable(String whatToSay, int delayTime) {
        word = whatToSay;
        delay = delayTime;
    }

    public void run() {
        try {
            for (;;) {
                System.out.println(word);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            return;
        }
    }

    public static void main(String[] args) {
        Runnable ping = new PingPongRunnable("ping", 33);
        Runnable pong = new PingPongRunnable("pong", 100);
        new Thread(ping).start();
        new Thread(pong).start();
    }
}




