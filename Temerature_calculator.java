import java.util.Scanner;

public class Temerature_calculator {
    public static void main(String[] args) {
        int celsius;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Degree celsius: ");

        celsius = sc.nextInt();
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println(fahrenheit + " Degree Fahrenheit");

    }
}
