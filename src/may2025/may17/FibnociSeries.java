package may2025.may17;

public class FibnociSeries {
    public static void main(String[] args) {
       // for (int i = 0; i < 10; i++) {
            System.out.println(fibonaaci(5));
        //}
    }

    private static int fibonaaci(int i) {
        if(i<=1){
            return i;
        } else {
            return fibonaaci(i-1)+fibonaaci(i-2);
        }
    }
}
