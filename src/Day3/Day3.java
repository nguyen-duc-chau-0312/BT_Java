package Day3;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        String lotteryNumber = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        System.out.print("Nhap 2 so ticket: ");
        System.out.println("So Lottery: "+ lotteryNumber);

        char lotteryDigit1 = lotteryNumber.charAt(0);
        char lotteryDigit2 = lotteryNumber.charAt(1);
        char numberDigit1 = number.charAt(0);
        char numberDigit2 = number.charAt(1);


        if (lotteryNumber.equals(number)) {
            System.out.println("Ban trung 10000");
        } else if (lotteryDigit1 == numberDigit2 && lotteryDigit2 == lotteryDigit2) {
            System.out.println("Ban trung 3000");
        } else if (lotteryDigit1 == numberDigit1 || lotteryDigit1 == numberDigit2 || lotteryDigit2 == numberDigit1
                || lotteryDigit2 == numberDigit2) {
            System.out.println("Ban trung 1000");
        }else{
            System.out.println("Ban khong trung giai nao!");

        }

    }
}
