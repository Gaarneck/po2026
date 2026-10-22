package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class AutoLotto
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> correct = new ArrayList<>();
        Random r = new Random();
        int num;
        int n = 0;
        long counter = 0;

        for(int j = 0; j < 6; j++) {
            num = r.nextInt(1, 50);
            if(!arr.contains(num))
            {
                arr.add(num);
            }
            else
            {
                j -= 1;
            }
        }

        long startTime = System.currentTimeMillis();
        while(!correct.containsAll(arr)) {
            counter++;
            correct.clear();
            while (correct.size() < 6) {
                num = r.nextInt(1, 50);
                if (!correct.contains(num)) {
                    correct.add(num);
                }
            }
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;

        System.out.println("Znaleziono wszystko.");
        System.out.println("Liczba prób: " + counter);
        System.out.println("Czas wykonania: " + time + " ms");
        System.out.println("Typy programu: " + correct);
        System.out.println("Wylosowane liczby: " + arr);
    }
}