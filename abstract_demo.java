public class abstract_demo {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle();
        car volvo=new car();
        car.capacityCheck;
    }
}
abstract class Vehicle{//abstract class and abstract methods are just concepts IMPLEMENTED BY CHILD
    //we cannot create an object for abstract class
    int vehId;
    String name;
    String model;
    public abstract void complyReg();//abstract methodcannot have body
    public abstract void capacityCheck();
    //abstract class can have both concrete and abstract methods
    public void concrete(){
        System.out.println("hello");
    }

}  
class car extends Vehicle{

    @Override
    public void capacityCheck() {
        // TODO Auto-generated method stub
        System.out.println("checked for capacity");
        
    }

    @Override
    public void complyReg() {//concrete method ie it has logic
        // TODO Auto-generated method stub
        System.out.println("checked for regulation");
    }//this class should have all the methods ie all the abstract methods should be implemented
    
}
