import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng giá trị bạn muốn nhập: ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Số lượng giá trị phải lớn hơn 0.");
            scanner.close();
            return;
        }

        // Setup
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Process
        System.out.println("Nhập " + count + " giá trị:");
        for (int i = 0; i < count; i++) {
            try {
                int number = scanner.nextInt();

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } catch (Exception e) {
                System.out.println("Giá trị nhập không hợp lệ và sẽ bị bỏ qua.");
                scanner.next();
            }
        }

        // Output
        System.out.println("Giá trị lớn nhất là: " + max);
        System.out.println("Giá trị nhỏ nhất là: " + min);

        scanner.close();
    }
}
