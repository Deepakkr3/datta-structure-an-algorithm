public class Nov25Class1 {
    public static void main(String[] args) {
        print0ton(0);
    }

    public static  void print0ton(int n){
          if(n>5){
              return;
          }
          System.out.println(n);
          print0ton(n+1);
    }
}
