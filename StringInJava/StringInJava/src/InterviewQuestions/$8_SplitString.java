package InterviewQuestions;

import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.lang.*;

public class $8_SplitString {
    /*
    Question How to split String
    Answer
    1.) String Split method
    2.) Pattern.compile(regex).splitAsStream(String)
    3.) String tokenizer
    4.) StringUtils.split(String,"exp")  requires 3rd party library
    5.) Splitter.on("-").split("1234") requires 3rd party library
     */
    public static void main(String[] args) {
//      String Split method
        String string = "010-67628";
        String[] split = string.split("-");
        printString(split,"Split method");
        System.out.println();

        //Pattern.compile(regex).splitAsStream(String)
        System.out.println(
        Pattern.compile("-").splitAsStream(string).collect(Collectors.toList()));

        // String tokenizer
        StringTokenizer stringTokenizer = new StringTokenizer(string,"-");
        while (stringTokenizer.hasMoreTokens()){
            String string1 = stringTokenizer.nextToken();
            System.out.print(string1);
        }
        System.out.println();
        // StringUtils.split(String,"exp") third party jar apche commons or spring framework




    }
    private static void printString(String string[],String approach){
        System.out.println("The approach is "+ approach);
        for (String s : string){
            System.out.print(s);
        }
    }
}
