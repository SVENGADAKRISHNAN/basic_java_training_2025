public class Inheritance {
    public static void main(String[] args) {
        Driver driver=new Driver();
        driver.name="boosan";
        driver.welcome();
        driver.Parentwelcome();
    }
}
class wooberUser{
    int id;
    String name;
    int age;
    String address;
    String phno;
    public void welcome(){
        System.out.println("welcome woober user");
    }
}
class User extends wooberUser{
    String petname;
    String petId;
    public void welcome(){
        System.out.println("welcome User");
    }
}
class Driver extends wooberUser{
    String vehicleName;
    String vehicleNumber;
    public void welcome(){
        System.out.println("welcome Driver");
    }
    public void Parentwelcome(){
        super.welcome();
    }
}