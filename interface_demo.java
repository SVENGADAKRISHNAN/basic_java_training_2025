public class interface_demo {
    public static void main(String[] args) {
        serviceManager s1=new serviceManager();
        s1.cleanLocation();
    }

    
}
interface location {// can contain oly abstract methods
    public void cleanLocation();
    public void hourlyMessage();//objects cannot be created


}
interface defaultUser {//for using public create a seperate java file for each class

    public void showId();
    public default void hourlyMessage(){//by using default or static we can include logic in abtsract methods
        System.out.println("hello world");
    }
}

class serviceManager implements location, defaultUser{
    //object can be created only for this class
    @Override
    public void cleanLocation() {//abstract methods of the interface must be overridden
        // TODO Auto-generated method stub
        System.out.println("hello boosrith bo");
    }

    @Override
    public void hourlyMessage() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void showId() {
        // TODO Auto-generated method stub
        
    }
    //this solves the diamond problem in mmultiple inheritance
    //even though these methods are present in both interfaces when the class implements these intefaces THE METHOD DEFINITION IS GIVEN INSIDE THE CLASS
    //SO DIAMOND PROBLEM IS SOLVED  
}
