package go.g2academy.MultithreadingDay12;

public class MultiThreadInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        MultiThreadInterface m = new MultiThreadInterface();
        Thread thread = new Thread(m);
        thread.start();
    }
}
