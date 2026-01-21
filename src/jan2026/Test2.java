package jan2026;

public class Test2 {
    public static void main(String[] args) {
        Testing testing = (a,b)-> (a+b);
        Testing testing1 = (a,b)-> {int c =a+b;

            return c;
        };
    }
}

interface Testing{
    int show(int a, int b);
}