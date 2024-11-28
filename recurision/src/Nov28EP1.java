public class Nov28EP1 {
    public static void main(String[] args) {
    // 0 1 1 2 3 5 8
        System.out.println(nthFeb(6));

    }
    public static int nthFeb(int n){
        if(n<=0){
            throw new IllegalArgumentException("n must be a positive integer ");
        }
        if(n<=2){
            return 1;
        }
        return nthFeb(n-1) + nthFeb(n-2);
    }
}
