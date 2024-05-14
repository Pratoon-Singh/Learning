package InterviewQuestions;

public class $5_ReverseWords {
    /*
    Question :- Reverse the provided string word
    Answer:-
     */
    public static void main(String[] args) {

        String str1 = "This is the text";
        String[] splitArray = str1.split(" ");
        for (int i =splitArray.length-1 ; i>=0 ; i--){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(splitArray[i]).append(" ");
            System.out.print(stringBuilder);
        }
    }
}
