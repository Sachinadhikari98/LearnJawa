public class StringBufferExample {
    static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Java");
        System.out.println(sb.capacity());
        System.out.println(sb.replace(4,18,"is a Programming"));
        sb.append("Language");
        System.out.println(sb);
        sb.insert(10,'c');
        sb.insert(10,"Raju");
        System.out.println(sb);
        sb.delete(10,11);
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
