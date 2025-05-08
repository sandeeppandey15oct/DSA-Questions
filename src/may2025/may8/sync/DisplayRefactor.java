package may2025.may8.sync;

public class DisplayRefactor {
    public synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning.." + name);
        }
    }
}

class MyThread extends Thread {
    DisplayRefactor displayRefactor;
    String name;

    public MyThread(DisplayRefactor displayRefactor, String name) {
        this.displayRefactor = displayRefactor;
        this.name = name;
    }

    @Override
    public void run() {
        displayRefactor.wish(name);
    }
}

class Demo {
    public static void main(String[] args) {
        DisplayRefactor displayRefactor = new DisplayRefactor();
        MyThread t1 = new MyThread(displayRefactor, "Dhoni");
        MyThread t2 = new MyThread(displayRefactor, "Yuvraj");
        t1.start();
        t2.start();
    }
}