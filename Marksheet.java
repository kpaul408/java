import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int num = sc.nextInt();

        if ((num >= 90) && (num <= 100)) {
            System.out.println("A+");
        } else if ((num >= 80) && (num < 90)) {
            System.out.println("A");

        } else if ((num >= 70) && (num < 80)) {
            System.out.println("B");

        } else if ((num >= 60) && (num < 70)) {
            System.out.println("C");

        } else if ((num >= 50) && (num < 60)) {
            System.out.println("D");

        } else if (num < 50) {
            System.out.println("You are FAil");

        }

    }

}
