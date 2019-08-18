package zmienne;

import java.util.LinkedList;
import java.util.Random;

public class operationOnVariables {
    public static void main(String[] args) {

        System.out.println("Hello!");


        LinkedList m = new LinkedList();
        Random generator = new Random();

        for(int i = 0; i < 1; i++){

            m.add(generator.nextInt(50));
        }

        int x = generator.nextInt(30);
        int y = generator.nextInt(30);
        System.out.println("Wylosowana liczba x: "+x);
        System.out.println("Wylosowana liczka y: "+y);

        boolean result = x > y;
        System.out.println(result);

        boolean result2 = x*2 > y;
        System.out.println(result2);

        boolean result3 = (y < x+3) && (y > x-2);
        System.out.println(result3);

        boolean result4 = ((x + y) % 2 == 0);
        System.out.println(result4);

    }

}
