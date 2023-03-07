import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhap n:");
            n = input.nextInt();
        } while(n < 1 || n > 12);
        System.out.println("Thang " + n);
    }
}
