public class StringEx1 {
    static void main(String[] args) {
        String s1="Ram";
        String s2=new String("Ramesh");
        System.out.println(s2.length());
        s1=s1.concat(s2);
        System.out.println(s1);
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());

    }
}
