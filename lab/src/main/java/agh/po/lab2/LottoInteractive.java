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
        boolean is;

        for(int j = 0; j < 6; j++) {
            num = r.nextInt(1, 49);
            if(arr.contains(num))
                arr.add(r.nextInt(1,49));
            else {
                arr.add(num);
            }
        }

        ArrayList<Integer> argsArray = new ArrayList<>();

        for (String str: args){
            n = Integer.parseInt(str);
            argsArray.add(n);
            is = arr.contains(n);
            if (is) {
                int shots = (Boolean.compare(is, Boolean.TRUE) + 1) * n;
                correct.add(shots);
            }

        }

        System.out.println("Twoje typy: " + argsArray);
        System.out.println("Wylosowane liczby: " +arr);
        System.out.println("Liczba trafień: " + correct.size());
    }
}
