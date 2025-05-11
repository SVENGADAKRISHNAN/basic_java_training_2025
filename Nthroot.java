import java.util.*;
public class Nthroot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double num=sc.nextDouble();
        double r=sc.nextDouble();
        double left=0;
        double right=num;
        double mid=0;
        double error=0.01;
        while((right-left)>error){
            mid=(left+right)/2;
            if(multiply(mid,r)>num){
                right=mid;
            }
            else{
                left=mid;
            }

        }
        System.out.println("The root is "+mid);
    }
        public static double multiply(double midd,double r){
            double multval=1;
            for (int i = 0; i < r; i++) {
                multval*=midd;
            }
            return multval;
        }
     
}
