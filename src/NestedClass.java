class Ac{
    int x=10;
    static class Bc{
        int y=20;
    }
}
public class NestedClass {
    static void main(String[] args){
        Ac a1=new Ac();
        System.out.println(a1.x);
        Ac.Bc b1=new Ac.Bc();
        System.out.println(b1.y);;
    }

}
