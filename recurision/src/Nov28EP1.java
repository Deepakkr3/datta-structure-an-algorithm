import java.util.ArrayList;
import java.util.List;

public class Nov28EP1 {
    public static void main(String[] args) {
    // 0 1 1 2 3 5 8
//        System.out.println(nthFeb(6));
//
//        int arr[]={1,8,55,60,62,66,69,82};
//        int x=fun2(0,arr.length-1,66,arr);
//        System.out.println(x);
//        int fact=fun3(5);
//        System.out.println(fact);
//       int sum=fun4(13428,0);
//       System.out.println(sum);
//
//       int test[]={
//               1,2,3,5,9,12,15,16,20
//       };
//       boolean isSorted=fun5(test,0);
//       System.out.println(isSorted);

       int test1[]={1,5,9,3,5,7,55,5,15};
       ArrayList<Integer> resultx=fun6(test1,0,5);
       System.out.println(resultx);

    }

    public  static ArrayList<Integer> fun6(int arr[],int i,int target){
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(i==arr.length){
            return result;
        }
        if(arr[i]==target){

            result.add(i);


        }

        ArrayList<Integer> bellowResult= fun6(arr,i+1,target);
        result.addAll(bellowResult);
        return result;


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

    public static  int fun2(int s,int e,int t,int arr[]){
        if(s>=e){
            return -1;
        }
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==t){
                return mid;
            }
            else if(arr[mid]<t){
               return fun2(mid+1,e,t,arr);
            }
            else{
             return    fun2(s,mid-1,t,arr);
            }
        }
        return -2;
    }
    public static int fun3(int n){
        if(n==1){
            return n;
        }
        return n*fun3(n-1);
    }
    public static int fun4(int n,int sum){
        if(n%10==0){
            return n+sum;
        }
        return fun4(n/10,sum+n%10);



    }
    public static boolean fun5(int arr[],int i){
        if(i>=arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return fun5(arr,i+1);
    }

}
