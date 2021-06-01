import java.util.*;

public class Suqure {
    public static void main(String[] args) {
        int sq, bs;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base no: ");
        bs = sc.nextInt();
        System.out.print("Enter the exponent : ");
        sq = sc.nextInt();

        for (int i = 1; i < sq; i++) {
            bs = bs * bs;
        }
        System.out.println("The Ans is: " + bs);

    }

}
