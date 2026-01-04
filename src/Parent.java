
class Parent {
    int a = 10;

    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    int a = 20;

    void display() {
        System.out.println(super.a); // parent variable
        super.show();               // parent method
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
