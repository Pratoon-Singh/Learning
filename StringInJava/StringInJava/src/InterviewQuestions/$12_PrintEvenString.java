package InterviewQuestions;

public class $12_PrintEvenString {
    public static void main(String[] args) {
        String s = "this '' is ganesh '' he is from gorakhpur";
        String[] t = s.split(" ");
        for (String w : t){
            if(w.length()%2==0 && !w.equals("''")){

                System.out.println(w);

            }
        }
    }
}
