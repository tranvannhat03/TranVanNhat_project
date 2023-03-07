import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        String name;
        int year;
        Scanner input = new Scanner (System.in);
        System.out.println("Nhap Ten:");
        name = input.nextLine();
        System.out.println("Nhap Nam Sinh:");
        year = input.nextInt();
        if(2023 - year  < 16) System.out.println("Ban " + name + " o do tuoi vi thanh nien");
        else if(2023 - year < 18) System.out.println("Ban " + name + " o do tuoi truong thanh");
        else System.out.println("Ban " + name + " da gia");
    }
}
