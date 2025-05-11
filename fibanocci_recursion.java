public class fibanocci_recursion {
    public static void main(String[] args) {
        int num=10;
        for(int i=0;i<num;i++){
            System.out.print(fibo(i)+ " ");
    }
}
    public static int fibo(int num){
        if (num<=1){
            return num;
        }
        else return fibo(num-1) + fibo(num-2);
    }
}
