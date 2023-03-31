package day01;

import java.util.Arrays;
import java.util.Random;

public class S03_Random {
    public static void main(String[] args) {
        //Örnek 13: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
        //arasında rasgele sayılar atayın. Oluşturduğunuz Array içerisindeki en büyük 2. sayıyı bulun.
        //(Array.sort kullanılmayacak)


        int arr[] = new int[500];
        Random random = new Random();
        int enBuyuk1 = 0;
        int enBuyuk2 = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(21) + 120;


        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > enBuyuk1) {
                enBuyuk2 = enBuyuk1;
                enBuyuk1 = arr[i];
            } else if (arr[i] > enBuyuk2 && arr[i] != enBuyuk1) {
                enBuyuk2 = arr[i];

            }
        }

        System.out.println(enBuyuk2);

    }

}
