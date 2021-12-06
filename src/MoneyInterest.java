import java.util.Scanner;

public class MoneyInterest {
    public static void main(String[] args) {
//        System.out.println("HelloWorld");
        double tienGui, tienLai;
        double laiSuat;
        int thangGui;
        Scanner sc = new Scanner(System.in);
        System.out.println("Số tiền bạn muốn gửi ngân hàng: ");
        tienGui = sc.nextDouble();
        System.out.println("Số tháng muốn gửi: ");
        thangGui = sc.nextInt();
        System.out.println("Lãi suất ngân hàng theo năm(%): ");
        laiSuat = sc.nextDouble();

        tienLai = tienGui * (laiSuat / 100 / 12) * thangGui;
        System.out.println("Lãi bạn nhận được sau " + thangGui + " là: " + tienLai);

    }
}
