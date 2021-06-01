
public class Combination_no {
    public static void main(String[] args) {
        int a, b, c;

        for (a = 1; a <= 3; a++) {

            for (b = 1; b <= 3; b++) {

                for (c = 1; c <= 3; c++) {

                    System.out.println("The combination is: " + a + b + c);

                    // Another way.. it's the difference process

                    // if ((a != b) && (a != c) && (b != c)) {

                    // System.out.println("The combination is: " + a + b + c);
                    // }
                }
            }
        }

    }
}
