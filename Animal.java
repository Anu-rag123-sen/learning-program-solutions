//Create an abstract class Animal with an abstract method sound() and a concrete method sleep(). Create a subclass Dog that implements sound().
abstract class Animal{
    abstract void sound();
    void sleep(){
        System.out.println("The animal is sleeping.");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks.");
    }
}
class Main{
    public static void main(String[] args){
        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}