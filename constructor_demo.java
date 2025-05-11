public class constructor_demo {
    public static void main(String[] args) {
        wooberUser wb= new wooberUser(230,"vkple",19,"anna nagar","1234567890");
        wooberUser wb2= new wooberUser(2223,"niku",19,"chennai","1234567890");
        //System.out.println(wb.id);
        System.out.println(wb2.getAge());
        wb2.setAge(12);
        System.out.println(wb2.getAge());        
    }
}
class wooberUser{//container class
    private int id;
    private String name;
    private int age;
    private String address;
    private String phno;
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<18){
            System.out.println("not possible");
        }
        else{
            this.age = age;}
    }
    wooberUser(){
        System.out.println("constructor called");
        id=10;
    }
    wooberUser(int id,String name,int age,String address,String phno){//overloading constructor
        this.name=name;//represents the current object that calls the constructor
        this.id=id;
        this.age=age;
        this.address=address;
        this.phno=phno;
        System.out.println(this.name);
    }
}

