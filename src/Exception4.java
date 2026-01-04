import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args){
        int salary;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary: ");
        salary=sc.nextInt();
        if (salary<50000){
            throw new ArithmeticException("You are not welcome");
        }else {
            System.out.println("Welcome my friends");
        }
    }
}
