import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String input = scanner.nextLine();

        // Setup

        // Process
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                count++;
            }
        }

        // Output
        System.out.println("Số lần ký tự 'a' xuất hiện trong chuỗi là: " + count);

        scanner.close();
    }
}
