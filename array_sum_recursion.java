public class array_sum_recursion {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sum(arr,arr.length-1));

    }
    public static int sum(int[] arr,int l){
        if(l==0) return 0;
        else{
            return arr[l]+sum(arr, l-1);
        }
    }
}
