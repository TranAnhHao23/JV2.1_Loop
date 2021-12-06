import java.util.Scanner;

public class PrimeLessThan100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;

        for (int i = 2; i < 100; i++) {
            count = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
