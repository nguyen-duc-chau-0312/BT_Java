package Bai_6;

import java.util.Random;

public class Bai_6 {
    public static void main(String[] args) {
        /*
        6. Viết chương trình mô phỏng việc lấy ngẫu nhiên một lá bài từ bộ bài 52 lá và
            chương trình phải hiển thị lá bài đó là lá bài gì. Ví dụ đầu ra của chương trình như sau:

             "Lá bài bạn vừa rút ra là Q cơ"
         */
        // cach nay bai 6 em lam chua dung 
        int i, j;
        String[] a = {"Rô, Cơ, Bích, Tép"};
        String[] b = {"Át, Hai, Ba, Bốn, Năm, Sáu, Bảy, Tám, Chín, Mười , J, Q, K"};
        Random random = new Random();
        int chat = random.nextInt(3) + 1;
        int quan = random.nextInt(12) + 1;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                i = chat;
                j = quan;
                System.out.println("Lá bài bạn vừa rút ra là " + a[i] + " " + b[j]);
            }
        }


    }
}
