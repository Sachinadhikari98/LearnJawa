enum Days{sunday,monday,tuesday,wednesday,thursday,friday,saturday};
public class EnumExample {
    static void main(String[] args) {
        Days d1=Days.sunday;
        switch (d1){
            case sunday:{
                System.out.println("today is sunday");
                break;
            }
            case monday:{
                System.out.println("today is monday");
            }
            case tuesday:{
                System.out.println("today is tuesday");
            }
            default:{
                System.out.println("today is a boring day");
            }
        }

    }
}
