import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int triNumber = 5;
//        for (int i = 0; i < triNumber; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j < triNumber - i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        for (int i = 0; i < triNumber; i++) {
            for (int j = i; j <= triNumber/2+1; j++) {
                System.out.print(" ");
            }
            for (int j = triNumber/2-i; j < triNumber/2+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    }
