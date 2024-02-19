import java.util.Scanner;

public class ClassObject {
    int a, b;

    void getdate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  first num : ");
        a = sc.nextInt();
        System.out.println("Enter the second num : ");
        b = sc.nextInt();

    }

    void setdate() {
        System.out.println("Adition : " + (a + b));
    }

}
