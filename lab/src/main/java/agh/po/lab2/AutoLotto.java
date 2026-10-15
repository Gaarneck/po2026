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
        boolean match = false;
        long counter = 0;

        for(int j = 0; j < 6; j++) {
            num = r.nextInt(1, 50);
            if(!arr.contains(num))
                arr.add(num);
        }

        long startTime = System.currentTimeMillis();
        while(!match) {
            counter++;
            correct.clear();
            // Losowanie pojedynczego zakładu (6 unikalnych liczb)
            while (correct.size() < 6) {
                num = r.nextInt(1, 50);
                if (!correct.contains(num)) {
                    correct.add(num);
                }
            }

            if(correct.containsAll(arr)) {
                match = true;
            }
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;

        System.out.println("Znaleziono wszystko.");
        System.out.println("Liczba prób: " + counter);
        System.out.println("Czas wykonania: " + time + " ms");
        System.out.println("Typy programu: " + correct);
        System.out.println("Wylosowane liczby: " +arr);
    }
}