import java.util.*;
public class array_demo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // char[] vowels=new char[] {'a','e','i','o','u'};
        // String[] names= new String[5];
        // names[0]="lc";
        // names[1]="aasrith";
        // names[2]="ahsan";
        // names[3]="raja";
        // names[4]="tatun";
        // for(int i =0;i<5;i++){
        //     System.out.println(names[i]);
        // }
        // System.out.println(names.length);
        // System.out.println(vowels);
        // String[] defaultNames= new String[10];
        // Arrays.fill(defaultNames,"helloo");
        // System.out.println(defaultNames[0]);
        // int[][] dates=new int[10][10];
        // int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int age=24;
        incr(age);
        System.out.println(age);
    }
    public static void incr(int age){
        age+=1;
        System.out.println(age);
    }
}
