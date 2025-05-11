import java.util.*;
public class string_demo {
    public static void main(String[] args) {
        String str="hi im vkple";// a memory is created
        str="hi im venkat";//another memory is created and reference is transfered
        System.out.println(str);


        String s1="apple";
        String s2="apple";//s1 and s2 are put in the same pool as because of same data(SAME MEMORY)[[[same reference]]]
        //POOL MEANS WHEN TWO ADDRESS POINT TO TE SAME MEMORY THEN IT IS CALLED POOL ADDRESS
        System.out.println(s1==s2);//checks for reference
        //now both s1 and s2 will share the same memory


        System.out.println(s1="apple");///checks for reference

        System.out.println("Address of s1="+ System.identityHashCode(s1));
        System.out.println("Address of s2="+ System.identityHashCode(s2));



        //now once memory is shared and i want to change s1
        s1="samsung";
        //now new memory is created for s1
        System.out.println(s1);


        String str1="mercedes";
        //NOW IF I WANT TO CREATE ANOTHER STRING WITH SAME DATA BUT DO NOT WANT TO SHARE MEMORY
        //USE NEW 
        String str2=new String("mercedes");//str2 is put in new pool as we have used new keyword
        System.out.println(str1==str2);//now address is not same
        System.out.println("new");
        System.out.println(str1==new String("mercedes"));
        System.out.println(str1.equals(str2));//only this checks for the value




        //to print the hashcode(ADDRESS)
        System.out.println("Address of s1="+ System.identityHashCode(s1));
        System.out.println("Address of s2="+ System.identityHashCode(s2));
        System.out.println("Address of str1="+ System.identityHashCode(str1));
        System.out.println("Address of str2="+ System.identityHashCode(str2));
    }
    
}
