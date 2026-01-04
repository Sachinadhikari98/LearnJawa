class Student {
    int roll;
    String name;

    // Default constructor
    Student() {
        roll = 0;
        name = "Unknown";
    }

    // Parameterized constructor
    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1, "Sachin");

        s1.display();
        s2.display();
    }
}

