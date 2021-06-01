import java.util.Scanner;

public class partern_print {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No: ");
        int no = sc.nextInt();

        for (i = 1; i <= no; i++) {

            for (j = no; j >= i; j--) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
