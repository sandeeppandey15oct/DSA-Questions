package april2025.april22;

public class JavaException {
    public static void main(String[] args) {
       try {
           show();
       }catch (MyExp2 exp2){
           exp2.printStackTrace();
       }
    }
    public static void show(){
        try {
            int x= 1/0;
        }catch (RuntimeException exp){
            throw new MyExp("myexp2");
        }
    }
}

class MyExp extends RuntimeException{
    String message;

    public MyExp(String message) {
        super(message);
    }
}

class MyExp2 extends RuntimeException{
    String message;

    public MyExp2(String message) {
        super(message);
    }
}
