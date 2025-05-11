
import java.util.Scanner;

public class menu_driven_switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int a=sc.nextInt(),b=sc.nextInt();
        while (num != 5) {
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println(add(a,b));
                    break;
                case 2:
                    System.out.println(sub(a,b));
                    break;
                case 3:
                    System.out.println(mul(a,b));
                    break;
                case 4:
                    System.out.println(div(a,b));
                    break;
                case 5:
                    break;                
            }
        
        }
        
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
}