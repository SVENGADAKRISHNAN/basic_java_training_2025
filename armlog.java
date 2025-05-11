import java.util.Scanner;
public class armlog {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int sum=0;
        int c=(int)Math.log10(n)+1;
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
