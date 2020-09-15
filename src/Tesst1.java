import java.util.Random;
import java.util.Scanner;

public class Tesst1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int number = scanner.nextInt();
//        System.out.println(" hang chuc : " + n/10);
//        System.out.println(" hang don vi : " + n%10);

        int reversedNumber = 0;
        int temp = 0;
        while (number >0){
            temp= number%10;
            reversedNumber = reversedNumber*10+temp;
            number = number/10;
        }
        System.out.println("Số ngược lại của n là: " + reversedNumber);
    }

}
