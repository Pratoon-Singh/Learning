package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
//        System.out.println(name);    // Writing output to STDOUT
        int[] arr = new int[Integer.parseInt(name)];
        String c = br.readLine();
        String trim = c.trim();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = trim.charAt(i);
        }
//        int[] arr = {1, 1, 2, 2, 4};
        System.out.println(arr);
        System.out.println(numberOfFavoriteSinger(arr));
    }

    public static int numberOfFavoriteSinger(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] == arr[i]){
                    count++;
                }
            }
        }
        return count;
    }
}

