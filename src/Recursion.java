public class Recursion {
    public int sum(int num){
        if(num>=1)
        return num+sum(num-1);
        else
            return num;
    }
    public static void main(String[] args){
        Recursion r1=new Recursion();
        System.out.println(r1.sum(10));
    }
}
