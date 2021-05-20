import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Alphabet");
        String ss = sc.nextLine();

        String re = new StringBuffer(ss).reverse().toString();

        System.out.println("String after reverse: " + re);
    }

}
