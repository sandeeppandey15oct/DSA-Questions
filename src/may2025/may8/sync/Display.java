package may2025.may8.sync;

public class Display {
    public synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning.." + name);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread extends Thread {
    Display display;
    String name;

    public MyThread(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        display.wish(name);
    }
}

class Demo {
    public static void main(String[] args) {
        Display display = new Display();
        MyThread t1 = new MyThread(display, "Dhoni");
        MyThread t2 = new MyThread(display, "Yuvraj");
        t1.start();
        t2.start();
    }
}