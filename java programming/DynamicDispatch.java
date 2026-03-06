class Vehicle {
    void move() {
        System.out.println("Vehicle moves");
    }
}
class Car extends Vehicle {
    void move() {
        System.out.println("Car moves 0n road");
    }
}
class DynamicDispatch {
    public static void main(String[]args) {
        Vehicle v = new Car();  // dynamic method dispatch
        v.move();
    }
}