import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int a, b, cal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th first num :");
        a = sc.nextInt();
        System.out.println("Enter the second num :");
        b = sc.nextInt();
        System.out.println("1-> Add 2-> substract 3-> multiply 4 -> devide \n Enter your choice :");
        cal = sc.nextInt();
        switch (cal) {
            case 1:
                System.out.println("Addition = " + (a + b));
                // break;
            case 2:
                System.out.println("Substraction = " + (a - b));
                // break;
            case 3:
                System.out.println("Multiplication = " + (a * b));
                //break;
            case 4:

                System.out.println("Division = " + (a / b));//break;
            default:
                System.out.println("Invalid choice");
                //  break;
        }

    }

}