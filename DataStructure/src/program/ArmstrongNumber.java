package program;


import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        String intToString = String.valueOf(number);
        char[] charArray = intToString.toCharArray();
        int temp = 0;
        for(char c: charArray){
            int i = Integer.parseInt(String.valueOf(c));
             temp = i*i*i;
        }
        System.out.println(temp);
        return true;
    }


}
