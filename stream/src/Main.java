import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
       Thread t = new Thread(()->{
           System.out.println("Thread 2");
       });
       t.start();
       //predicate
//        Predicate<Integer> isEven=(a)->a%2==0;
//        System.out.println(isEven.test(4));

        Predicate<String> isStartWithA=(str)->str.startsWith("A");
        System.out.println(isStartWithA.test("SApple"));
    }
}