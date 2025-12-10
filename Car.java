//Create a class Car with a property color and a method drive(). Create an object of the class and call its method.
class Car{
    String color;
    void drive(){
        System.out.println("Car is driving.");
    }
    public static void main(String[] args){
        Car c1 = new Car();
        c1.drive();
        c1.color = "Red";
        System.out.println("Color: "+ c1.color);
    }
}