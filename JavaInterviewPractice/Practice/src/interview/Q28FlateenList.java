package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q28FlateenList {
    public static void main(String[] args) {
        ArrayList<Object> nestedArray = new ArrayList<>(Arrays.asList(1, 2,
                new ArrayList<>(Arrays.asList(3, 4, new ArrayList<>(Arrays.asList(5, 6, 7)), 8)), 9));

//        System.out.println(array);
        ArrayList<Object> flattenedArray = new ArrayList<>();
        flatten(nestedArray, flattenedArray);

        System.out.println(flattenedArray);

    }
    public static void flatten(List<Object> nestedList, List<Object> flatList) {
        for (Object element : nestedList) {
            if (element instanceof List) {
                flatten((List<Object>) element, flatList);
            } else {
                flatList.add(element);
            }
        }
    }
}
