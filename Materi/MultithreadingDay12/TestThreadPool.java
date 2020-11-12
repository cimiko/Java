package go.g2academy.MultithreadingDay12;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args) {
        //Jumlah Thread
        ExecutorService executor = Executors.newFixedThreadPool(10);

        //Jumlah Task Queue
        for (int i = 0; i < 100; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }

        executor.shutdown();

        while (!executor.isTerminated()){
        }

        System.out.println("Finished all threads");
    }
}
