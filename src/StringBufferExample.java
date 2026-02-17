public class StringBufferExample {
    static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Java");
        System.out.println(sb.capacity());
        System.out.println(sb.replace(4,18,"is a Programming"));
        System.out.println(sb.reverse());
    }
}
