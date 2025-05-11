public class polymorphism_overriding {
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.makeSound();
    }
}
class Animal{
    public void makeSound(){
        System.out.println("animallll");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("meow meow");
    }
}
