import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        int num;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number: ");
        num = sc.nextInt();
        if (num < 2) {
            System.out.println("This number is not prime");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("This number is prime");
            } else {
                System.out.println("This number is not prime");
            }
        }
    }
}
