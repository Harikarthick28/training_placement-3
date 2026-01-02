import java.util.Scanner;

public class RangeMapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result;

        if (n < 0 || n > 101) {
            result = -1;
        } else if (n <= 5) {
            result = 0;
        } else if (n <= 12) {
            result = 1;
        } else if (n <= 19) {
            result = 2;
        } else if (n <= 50) {
            result = 3;
        } else if (n <= 60) {
            result = 4;
        } else {
            result = 5;
        }

        System.out.println("Mapped value: " + result);
    }
}
