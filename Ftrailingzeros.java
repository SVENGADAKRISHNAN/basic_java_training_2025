import java.util.*;
class Ftrailingzeros{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int temp=1;
        int count=0;
        while(true){
            temp=temp*5;
            if(n<temp){
                temp=temp/5;
                break;
            }
        }
        for(int j=temp;j!=1;j=j/5){
            count=count+n/j;
        }
        System.out.println(count);
}
}