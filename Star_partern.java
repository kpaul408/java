import java.util.Scanner;

public class Star_partern {
    public static void main(String[] args) {

        int i, j;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int no = sc.nextInt();

        for (i = 1; i <= no; i++) {

            for (j = 1; j <= i; j++) {

                System.out.print(i + "");
            }

            System.out.println();
        }

    }
}
