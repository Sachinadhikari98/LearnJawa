class Add {
        void sum(int a, int b) {
            System.out.println(a + b);
        }

        void sum(int a, int b, int c) {
            System.out.println(a + b + c);
        }
    }

    class PolymorphismDemo {
        public static void main(String[] args) {
            Add a = new Add();
            a.sum(10, 20);
            a.sum(10, 20, 30);
        }
    }

