import java.util.Scanner;

public class Buzz_no {
    public static void main(String[] args) {

        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number: ");
        a = sc.nextInt();
        if ((a % 7 == 0) && (a % 10 == 7)) {
            System.out.println("This no is Bazz no.");
        } else {
            System.out.println("This not buzz no.");
        }
    }

}
