import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a, b, cal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num :");
        a = sc.nextInt();
        System.out.println("Enter the second num :");
        b = sc.nextInt();
        System.out.println(" 1-> Add 2-> Subsract 3-> Multiply 4-> Divide \n Enter your choice:");
        cal = sc.nextInt();
        if (cal == 1)
            System.out.println("Addition = " + (a + b));
        else if (cal == 2)
            System.out.println("Substraction = " + (a - b));
        else if (cal == 3)
            System.out.println("Multiplication = " + (a * b));
        else if (cal == 4)
            System.out.println("Devison = " + (a / b));
        else
            System.out.println("Invalid Choice");

        {


        }
        {

        }
        {

        }


    }
}
