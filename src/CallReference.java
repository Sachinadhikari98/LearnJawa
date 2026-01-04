public class CallReference {
    int x,y;
    public void sum(CallReference r1){
        r1.x=10;
        r1.y=20;
        System.out.println(r1.x+r1.y);
    }
    static void main(String[] args){
        CallReference r1=new CallReference();
        CallReference r2=new CallReference();
        r2.sum(r1);
    }
}
