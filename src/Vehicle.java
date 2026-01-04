abstract class Vehicle {
    abstract void run();
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running");
    }
}

class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.run();
    }
}
