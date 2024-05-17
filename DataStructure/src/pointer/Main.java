package pointer;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int num1 =11;
        int num2 = num1;

        num1 = 22; // if we change num1 then num2 is not changed
        System.out.println(num1);
        System.out.println(num2);


        // With HashMap
        HashMap map1 = new HashMap<>();
        HashMap map2 = new HashMap<>();

        map1.put("Value",11);
        map2=map1;

        map1.put("Value",22);
        System.out.println(map1);
        System.out.println(map2);

    }
}
