package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenUsingStream {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        List<Integer> even =Arrays.stream(arr)
                .filter(i->i%2==0)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(even);
    }
}
