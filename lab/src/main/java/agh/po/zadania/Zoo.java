package agh.po.zadania;

import java.util.ArrayList;
import agh.po.animals.*;
import java.util.Random;

public class Zoo {
    public static void main(String[] args)
    {
        Animal[] animals = new Animal[100];
        Random random = new Random();
        for (int i = 0; i < 100; i += 1) {
            int animalType = random.nextInt(1, 4);
            switch (animalType) {
                case 1: {
                    animals[i] = new Dog("Dog" + Integer.toString(i));
                }

                case 2: {
                    animals[i] = new Parrot("Parrot" + Integer.toString(i));
                }

                case 3: {
                    animals[i] = new Snake("Snake" + Integer.toString(i));
                }
            }
        }
        for (int i = 0; i < 100; i++)
        {
            System.out.println(animals[i]);
        }
    }
}
