import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int remainder;
        int numberGiven;
        int reverse=0;
        int copy;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the number to check if it is palindrome");
        numberGiven = sc.nextInt();
        copy = numberGiven;
        while (numberGiven > 0) {
            remainder = numberGiven % 10;
            numberGiven = numberGiven / 10;
            reverse = reverse * 10 + remainder;
        }
        if (reverse == copy)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");
    }
}
