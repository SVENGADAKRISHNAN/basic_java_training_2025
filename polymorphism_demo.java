public class polymorphism_demo {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        System.out.println(calculate(a, b));
        System.out.println(calculate(a));
    }
    //OVERLOADING
    public static int calculate(int a,int b){
        return a+b;
    }
    public static int calculate(int a){
        return a*a;
    }
    // public static String calculate(int a,int b){
    //     return a+b;
    // }


    //OVERRIDING
    
}
