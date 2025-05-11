import java.util.*;
public class class_object_demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        class_object_demo obj2=new class_object_demo();
        obj2.age=sc.nextInt();
        obj2.height=sc.nextInt();
        obj2.name=sc.nextLine();
        System.out.println(obj2.calculatBMI());
    }
    }
    
