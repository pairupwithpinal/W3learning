import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number :");
        a = sc.nextInt();
        System.out.println("Enter the second number :");
        b = sc.nextInt();
        System.out.println("enter the third number :");
        c = sc.nextByte();
        if (a > b && a > c)
            System.out.println("Max number is: " + a);
        else if (b > a && b > c)
            System.out.println("Max number is : " + b);
        else
            System.out.println("Max number is : " + c);


    }
}
