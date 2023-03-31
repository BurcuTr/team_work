package day01;

import java.util.Random;

public class S02_Random {
    public static void main(String[] args) {
        //  Örnek 12: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
        //  arasında rasgele sayılar atayın. Oluşturduğunuz Array in içerinde kaç adet 125 sayısı vardır?
        int arr[] = new int[500];
        Random random = new Random();
        int sayac=0;


        for (int i = 0; i < arr.length; i++) {
            arr[i]= random.nextInt(21)+120;
            if(arr[i]== 125){
                sayac++;
            }

        }
        System.out.println(sayac);
        }

    }
