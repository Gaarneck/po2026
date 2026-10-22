package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;
public class LottoInteractive
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> correct = new ArrayList<>();
        Random r = new Random();
        int num;
        int n = 0;

        for(int j = 0; j < 6; j++) {
            num = r.nextInt(1, 50);
            if(arr.contains(num))
                arr.add(r.nextInt(1,50));
            else {
                arr.add(num);
            }
        }

        ArrayList<Integer> argsArray = new ArrayList<>();
        for (String str: args){
            n = Integer.parseInt(str);
            argsArray.add(n);
            if (arr.contains(n)) {
                correct.add(n);
            }
        }

        System.out.println("Twoje typy: " + argsArray);
        System.out.println("Wylosowane liczby: " +arr);
        System.out.println("Liczba trafień: " + correct.size());
    }
}
