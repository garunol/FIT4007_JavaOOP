import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một giá trị nguyên: ");
        int number = scanner.nextInt();

        // Setup

        // Process
        if (number == 0) {
            System.out.println("Số 0");
        } else if (number % 2 == 0) {
            System.out.println("Số chẵn");
        } else {
            System.out.println("Số lẻ");
        }
        // Output

        scanner.close();
    }
}
