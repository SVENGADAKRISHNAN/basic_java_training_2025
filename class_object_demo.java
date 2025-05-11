import java.util.*;
public class class_object_demo {
    int count=0;
    int age;
    int height;
    String name;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        class_object_demo obj1= new class_object_demo();
        obj1.age=sc.nextInt();
        obj1.height=sc.nextInt();
        obj1.name=sc.nextLine();
    }
    public int calculatBMI(){
        return age*height;
    }
}
