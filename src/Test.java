import java.util.Random;
import java.util.Scanner;

public class Test {
    // Main method
    public static void main(String[] args) {
        Random rd = new Random();
        int lottery_number = 10 + rd.nextInt(90);
        System.out.println("Ket qua so xo: " +lottery_number);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 2 so tu nhien de kiem tra ket qua: ");
        int n = scanner.nextInt();
        while (true) {
            if (n >= 10 && n <= 99) {
                break;
            } else {
                System.out.print("Ban nhap sai gia tri, Moi ban nhap lai \n Chi chap nhan gia tri [10,99]: ");
                n = scanner.nextInt();
            }

        }
        int hangChuc_lottery = lottery_number / 10;
        int hangDonVi_lottery = lottery_number % 10;
        int hangChuc_n = n / 10;
        int hangDonVi_n = n % 10;
        int reversedNumber = 0;
        int temp = 0;
        while (n >0){
            temp= n%10;
            reversedNumber = reversedNumber*10+temp;
            n = n/10;
        }
        //a
        if (n == lottery_number) {
            System.out.println("Ban nhan duoc giai thuong la 10000");
        } else {
            System.out.println("Ban khong nhan duoc giai thuong 10000");
        }
        //b
        if(lottery_number == reversedNumber){
            System.out.println("Banh nhan duoc giai thuong la 3000");
        }else{
            System.out.println("Ban khong nhan duoc giai thuong 3000");
        }
        //c
        if (hangChuc_lottery == hangChuc_n || hangChuc_lottery == hangDonVi_n
            || hangDonVi_lottery == hangDonVi_n || hangDonVi_lottery == hangChuc_n && lottery_number != n && lottery_number != lottery_number) {
            System.out.println("Ban nhan duoc giai thuong la 1000");
        }else{
            System.out.println("Ban khong nhan duoc giai thuong 1000");
        }

    }


}