//Given a number, check whether the number is ugly number. Ugly number is a number which has no prime factors other than 2,3 or 5.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int flag = 0;
        while (number != 1) {
            if (number % 5 == 0) {
                number /= 5;
            } else if (number % 3 == 0) {
                number /= 3;
            } else if (number % 2 == 0) {
                number /= 2;
            } else {
                System.out.println("NO");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("YES");
        }
    }
}
