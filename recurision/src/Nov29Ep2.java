public class Nov29Ep2 {
    public static void main(String[] args) {
        int arr[]={2,5,8,12,16,23,38,56,72,91};
        int key=26;
//        int index=fun1(arr,0,arr.length-1,key);
//        System.out.println(index);
        fun2(4,0);

    }
    public  static  int fun1(int arr[],int s,int e, int key){
        if(s>=e){
            return -1;
        }

            int mid=s+(e-s)/2;
            if(arr[mid]==key){
                return mid;
            }
             if(arr[s]<=arr[mid]){
                 if(key>=arr[s] && key<=arr[mid]){
                     return fun1(arr,s,mid-1,key);
                 }
                 else{
                     return fun1(arr,mid+1,e,key);
                 }
             }
             else if(key<=arr[mid] && key>=arr[e]){
                 return fun1(arr,mid+1,e,key);
             }
             else{
                 return fun1(arr,s,mid-1,key);
             }


    }
    public static void fun2(int r,int c){
        if(r==0){
            return;
        }
       if(r>c){
           System.out.print("* ");
           fun2(r,c+1);
       }
       else{
           System.out.println();
           fun2(r-1,0);
       }

    }
}
