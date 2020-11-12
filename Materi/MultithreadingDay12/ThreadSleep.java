package go.g2academy.MultithreadingDay12;

public class ThreadSleep extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println(getName() + " is sleeping for " + i + " times");
        }

    }

    public static void main(String[] args) {
        ThreadSleep t1 = new ThreadSleep();
        ThreadSleep t2 = new ThreadSleep();

        t1.start();
        t2.start();
    }
}
