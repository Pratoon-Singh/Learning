package program.excercise;

import java.util.ArrayList;

public class DuplicateInString {
    public static void main(String[] args) {

        String string = "aabccs";

        System.out.println(duplicateString(string));

    }

    private static String duplicateString(String string) {

        ArrayList<Character> arrayList = new ArrayList<>();
        for (char c : string.toCharArray()){
            if(!arrayList.contains(c)){
                arrayList.add(c);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Object c1 : arrayList) {
            stringBuilder.append(c1);
        }
        return stringBuilder.toString();
    }
}
