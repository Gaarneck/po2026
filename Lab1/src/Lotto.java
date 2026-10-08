import java.util.Random;
import java.util.ArrayList;

public class Lotto {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            boolean ident = false;
            int n = rand.nextInt(49) + 1;
            for (int j = 0; j < arr.size(); j++)
            {
                if (n == arr.get(j))
                {
                    ident = true;
                }
            }
            if (ident == true)
            {
                i = i - 1;
                continue;
            }
            arr.add(n);
        }
        System.out.println(arr);
    }
}
