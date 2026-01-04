class A {
    A() {
        System.out.println("Constructor of A");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("Constructor of B");
    }
}

class ConstructorDemo {
    public static void main(String[] args) {
        B obj = new B();
    }
}
