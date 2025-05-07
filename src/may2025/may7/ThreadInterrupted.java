package may2025.may7;

public class ThreadInterrupted {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.setName("Child Thread");
        thread.start();
        Thread.sleep(4000);
        thread.interrupt();
        System.out.println("Main Thread execution is completed");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " is printing " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted..!!");
                break;
            }
        }
    }
}
