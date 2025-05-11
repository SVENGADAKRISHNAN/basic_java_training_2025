import java.util.*;
public class exception_handling{
    public static void main(String[] args){
        int a=24;
        int b=0;
        int div;
        try{
            div=a/b;
        }catch(ArithmeticException exception){
            System.out.println("dont divide by zero");
        }finally{
            System.out.println("the finally block has been executed");
        }
    }
}