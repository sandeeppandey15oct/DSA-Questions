package may2025.may7;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable1());
        thread.start();
        thread.join();
        System.out.println("Main thread completed ..");
    }
}

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        Thread thread = new Thread(new MyRunnable2());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("I am child thread with MyRunnable1, main thread is going to wait for me  ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        Thread thread = new Thread(new MyRunnable3());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("I am child thread with MyRunnable2, main thread is going to wait for me  ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyRunnable3 implements Runnable {
    @Override
    public void run() {
        System.out.println("I am child thread with MyRunnable3, main thread is going to wait for me  ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}