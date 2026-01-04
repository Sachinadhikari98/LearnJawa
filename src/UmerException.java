public class UmerException {
    public void vote(int age){
        if(age>18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You are too young");
        }
    }
    static void main(String[] args){
        UmerException e1=new UmerException();
        try{
            e1.vote(15);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
