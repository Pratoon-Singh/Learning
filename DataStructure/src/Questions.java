public class Questions
{
    public static void main(String[] args) {
        int [] array = {5, 56 ,76, 44, 12};

        System.out.println(getlargestElmentInArray(array));
        System.out.println(getSecondLargestInArray(array));
    }

    private static int getSecondLargestInArray(int[] array) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = array[i];
            } else if (array[i] > secondLargest && array[i] != firstLargest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    private static int getlargestElmentInArray(int[] array) {

        int temp = Integer.MIN_VALUE ;
        for (int i= 0 ; i<array.length;i++){
            if(array[i]>temp){
                temp=array[i];
            }
        }
        return temp;
    }
}
