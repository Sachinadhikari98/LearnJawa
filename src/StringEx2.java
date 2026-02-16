public class StringEx2 {
    static void main(String[] args) {
        String r1="Sachin";
        String r2="Sachin";
        String r3=new String ("Sachin");
        System.out.println(r1==r2);
        System.out.println(r1.charAt(3));
        System.out.println(r1==r3);
        System.out.println(r1.equals(r3));
        System.out.println(r1.equalsIgnoreCase(r3));
        String r4="Rakesh";
        System.out.println(r4.trim());
        System.out.println(r1.contains("r"));
    }
}
