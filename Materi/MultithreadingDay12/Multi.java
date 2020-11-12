package go.g2academy.MultithreadingDay12;

public class Multi extends Thread {
    @Override
    public void run() {
//        super.run();
        //Versi 1
//        System.out.println("thread is running...");
        //Versi 2
//        System.out.println(getName() + " is running...");

        //Versi 3
        int random = (int) (Math.random() * 10)* 1000;

        try {
            Thread.sleep(random);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(getName() + " is running... and was sleeping for " + random + "ms");

    }

    public static void main(String[] args) {
        //Versi 1
//        Multi t1 = new Multi();
//        t1.start();

        //Versi 2
        for (int i = 0; i < 100; i++) {
            Multi t1 = new Multi();
            t1.setName("thread " + i);
            t1.start();
        }
    }
}
