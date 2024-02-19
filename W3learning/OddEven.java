import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number :");
        b = sc.nextInt();
        if (a % 2 == 0 && b % 2 == 0)
            System.out.println("Numbers are even");
        else if (a % 2 != 0 && b % 2 != 0)
            System.out.println("Numbers are odd");
        else
            System.out.println("one number is even and other is odd");


    }


}
