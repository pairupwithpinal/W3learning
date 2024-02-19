import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean b1 = s.hasNextInt();
        System.out.println(b1);

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter num 1");
        int a = s1.nextInt();

        System.out.println("Enter num 2");
        int b = s1.nextInt();

        int sum = a +b;
        System.out.println("Sum of two number is :"+ sum);
        Scanner s2 = new Scanner(System.in);
        String str = s2.nextLine();
        System.out.println(str);


    }


}

