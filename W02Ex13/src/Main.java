import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên n: ");
        int n = scanner.nextInt();

        // Setup
        int sum = 0;

        // Process
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Output
        System.out.println("Tổng của các số từ 1 đến " + n + " là: " + sum);
    }
}
