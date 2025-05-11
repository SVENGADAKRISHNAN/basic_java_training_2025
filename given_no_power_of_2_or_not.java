import java.util.*;
public class given_no_power_of_2_or_not {
    public static void main(String[] args) {
        int n=8;
        // System.out.println(Integer.toBinaryString(a));
        if((n & (n-1))==0) System.out.println("true");
        else System.out.println("false");
    }
}
