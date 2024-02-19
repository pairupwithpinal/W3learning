import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num upto you want to print :");
        n = sc.nextInt();
        i = 1;
        while (i <= n) {
            System.out.println(i);
            i = i + 1;


        }


    }


}


