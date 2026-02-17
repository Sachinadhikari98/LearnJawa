import java.util.Scanner;

public class StringPalindrome {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.next();
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        String str3=new String(sb);
        if (str.equals(str3))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
