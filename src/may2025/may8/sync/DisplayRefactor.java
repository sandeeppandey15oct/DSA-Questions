package may2025.may8.sync;

public class DisplayRefactor {
    public synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning.." + name);
        }
    }
    public  void wishMe(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning..wishMe" + name);
        }
    }
}

class MyThread2 extends Thread {
    DisplayRefactor display;
    String name;

    public MyThread2(DisplayRefactor display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        display.wish(name);
       // display.wishMe(name);
    }
}

class Demo2 {
    public static void main(String[] args) {
        DisplayRefactor display = new DisplayRefactor();
        MyThread2 t1 = new MyThread2(display, "Dhoni");
        MyThread2 t2 = new MyThread2(display, "Yuvraj");
        t1.start();
        t2.start();
    }
}