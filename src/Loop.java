import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("menu");
            System.out.println("1. Say hello");
            System.out.println("2. Say hi");
            System.out.println("3. Say goodbye");
            System.out.println("0. Exit");
            System.out.println("your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Hi");
                    break;
                case 3:
                    System.out.println("Goodbye");
                    break;
                case 0:
                    System.out.println("See ya again");
                    break;
                default:
                    System.out.println("Choose again");
            }

        } while (choice !=0);
    }
}
