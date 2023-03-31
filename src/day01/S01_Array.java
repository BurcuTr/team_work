package day01;

import java.util.Random;

public class S01_Array {
    public static void main(String[] args) {
       //       Örnek 11: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 50-80
       //    arasında rasgele sayılar atayın.

        int arr[] = new int[500];
        Random random = new Random();

        for (int i = 0; i < arr.length ; i++) {
            arr[i]= random.nextInt(31) + 50;

        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");

        }


            }



        }


