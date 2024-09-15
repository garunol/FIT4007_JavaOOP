public class Main {
    public static void main(String[] args) {
                int tong = 0;
                for (int i = 1; i <= 100; i++) {
                    if (i % 7 == 0) {
                        tong += i;
                    }
                }
                System.out.println("Tổng các số là bội số của 7 từ 1 đến 100 là: " + tong);


    }
      }