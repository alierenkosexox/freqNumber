

// Ali Eren KÖSE 04/03/2024 05:16

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dizinin kaç elemanlı olacağını beliyleriniz : ");
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();

        int[] dizi = new int[arraySize];
        int[] dizi2 = new int[arraySize];

        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + "-Elemanı giriniz : ");
            dizi[i] = input.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println("Dizi : " + Arrays.toString(dizi));

        int repeat = 0;
        for (int r : dizi){
            int say=0;
            for ( int j = 0 ; j< dizi.length;j++){
                if( r==dizi2[j]){
                    say++;
                }
            }
            if (say==0){
                int say2=0;
                for (int i : dizi){
                    if (r== i ){
                        say2++;
                    }
                }
                dizi2[repeat] = r ;
                repeat++;
                System.out.println(r + " sayısı " + say2 + "kere tekrar edildi");
            }
        }
    }
}
