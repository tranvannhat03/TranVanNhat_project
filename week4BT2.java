import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner (System.in);
        System.out.println("Nhap n: "); 
        n = input.nextInt();
        if(n % 2 == 0) System.out.println("n la so chan");
        else System.out.println("n la so le");
    }
}
