//what will be output of this class? (Both classes in same package)
public class inheritanceexample {
    public static void main (String args[]){
        Vehicle obj1 = new Car ();
        obj1.print();
        Vehicle obj2 = new Vehicle ();
        obj2.print();
    }
}
class Vehicle {
    void print (){
        System.out.println("Base class (Vehicle)");
    }
}
class Car extends Vehicle {
    void print(){
        System.out.println("Derives class (Car)");
    }
}
