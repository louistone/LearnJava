package Thread;

import java.util.LinkedList;
import java.util.Queue;

public class PrintServer implements Runnable {
    private final Queue<Integer> requests = new LinkedList<Integer>();

    public void print(Integer num) {
        requests.add(num);
    }

    public void run() {
        for(;;)
            if (!requests.isEmpty())
                System.out.println(requests.remove());
    }

    public static void main(String[] args) {
        Runnable printServer = new PrintServer();
        PrintServer p = (PrintServer) printServer;
        p.print(3);
        p.print(4);
        p.print(5);
        new Thread(printServer).start();
    }
}