import java.sql.SQLOutput;
import java.util.Scanner;

public class GreatestCommon {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tìm ước chung lớn nhất nhé");
        System.out.println("Nhập số thứ nhất: ");
        a = sc.nextInt();
        System.out.println("Nhập số thứ hai: ");
        b = sc.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        }
        while (a != b) {
            if (a>b){
                a = a-b;
            } else {
                b = b-a;
            }
        }
        System.out.println("Ước chung lớn nhất là: "+b);
    }
}
