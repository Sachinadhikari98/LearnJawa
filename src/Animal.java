sealed class Animal permits Dog, Cat {
}

final class Dog extends Animal {
}

final class Cat extends Animal {
}

class SealedDemo {
    public static void main(String[] args) {
        System.out.println("Sealed class example");
    }
}

