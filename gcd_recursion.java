public class gcd_recursion {
    public static void main(String[] args) {
        int a=48;
        int b=18;
        System.out.println(gcd(a, b));
    }
    public static int gcd(int a,int b){// 35 and 49 
        if(b==0) return a;//even though this A value is lesser it will exchange
        return gcd(b,a%b);//first internal call will be 49,35  ((BECAUSE CALL OF SMALL % BIG == SMALL))
    }
}
