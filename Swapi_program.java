import java.util.*;
import java.util.Scanner;

public class Swapi_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Fist no: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second no; ");
        int b = sc.nextInt();

        // int a = 20;
        // int b = 30;
        int c;

        c = a;
        a = b;
        b = c;
        System.out.println("The Swaip Rasult is: ");
        System.out.println("The Fist no is: " + a);
        System.out.println("The Second no is: " + b);

    }

}
