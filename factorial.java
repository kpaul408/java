import java.util.*;

public class factorial {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i, fact = 1;

        System.out.println("Enter the no: ");

        int number = sc.nextInt();

        for (i = 1; i <= number; i++) {

            fact = fact * i;
        }
        System.out.println("Ans is " + number + " is: " + fact);
    }

}
