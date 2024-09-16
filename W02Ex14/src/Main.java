import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên n: ");
        int n = scanner.nextInt();

        //  Setup
        int sum = 0;

        // Process
        if (n % 2 == 0) {

            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
        } else {

            for (int i = 2; i <= n; i += 2) {
                sum += i;
            }
        }

        // Output
        System.out.println("Tổng là: " + sum);
    }
}
