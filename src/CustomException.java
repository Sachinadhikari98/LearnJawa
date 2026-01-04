public class CustomException {
    public void vote(int age){
        if(age>=18){
            System.out.println("You can vote");
        }
        else {
            throw new ArithmeticException("Umer pugena");
        }
    }
    public static void main(String[] args){
        CustomException c1=new CustomException();
        c1.vote(17);
    }
}
