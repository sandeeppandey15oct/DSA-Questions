package may2025.may14;

public class RecursionName {
    public static void main(String[] args) {
        printName("Sandeep", 10);
    }

    static void printName(String name, int count) {
        if (count <= 0) {
            return;
        }
        System.out.println(name);
        printName(name, --count);
    }
}