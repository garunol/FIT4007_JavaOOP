import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {


    public static void splitString(String s) {

        StringTokenizer tokenizer = new StringTokenizer(s, " ");
        
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi gốc: ");
        String input = scanner.nextLine();

        // Setup

        // Process
        splitString(input);

        // Output

        scanner.close();
    }
}
