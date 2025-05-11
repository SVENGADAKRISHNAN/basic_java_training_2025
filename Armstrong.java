import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int sum=0;
        int c=0;
        while(temp!=0){
            int x=temp%10;
            c+=1;
            temp=temp/10;
        }
        temp=n;
        while(temp!=0){
            int x=temp%10;
            sum=sum+(int)Math.pow(x,c);
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not armstrong");
        }
    }
}
