package jan2026;

public class Test1 {
    public static void main(String[] args) {
        Math m= (a,b, c)-> (a+b+c);
        System.out.println(m.sum(1,2,4));
        Runnable r= ()-> System.out.println("I am runnable");
        r.run();
        Abs abs= d->d>0?d:-d;
        System.out.println(abs.mod(0));
    }
}

interface Math{
    int sum(int a, int b, int c);
}

interface Abs{
    int mod(int a);
}