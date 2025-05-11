public class array_increasingornot {
    public static void main(String[] args) {
        int[] arr={1,5,9,21,63};
        int i=1;
        int flag=0;
        while (arr.length>0){
            if(arr[i]<arr[i-1])
                flag=1;
                break;
        }
        if(flag==1)
            System.out.println("The array is not sorted");
        else
            System.out.println("The array is sorted");
    }
}
