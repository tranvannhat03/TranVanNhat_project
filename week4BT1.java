import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        float a,b;
        Scanner inp = new Scanner (System.in);
        System.out.println(("Nhap vao 2 so a va b:"));;
        a = inp.nextFloat();
        b = inp.nextFloat();
        System.out.println("Tong 2 so la " + (a + b));
        System.out.println("Hieu 2 so la " + (a - b));
        System.out.println("Tich 2 so la " + (a * b));
        System.out.println("Thuong 2 so la " + (a / b));
        System.out.println("Chia lay du 2 so la " +  (a % b));
        if (a > b) System.out.println("A lon hon B");
        else System.out.println("B lon hon A");
    }
}
