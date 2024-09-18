import java.util.Scanner;

public class Main {

    // Input
    public static int countDigits(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String input = scanner.nextLine();

        // Setup

        // Process
        int digitCount = countDigits(input);

        // Output
        System.out.println("Số lượng ký tự số trong chuỗi là: " + digitCount);

        scanner.close();
    }
}
