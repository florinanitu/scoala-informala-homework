import java.util.Scanner;

public class DisplayBiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce first number");
        int firstNumber = sc.nextInt();

        System.out.println("Introduce second number");
        int secondNumber = sc.nextInt();

        System.out.println("Introduce third number");
        int thirdNumber = sc.nextInt();

        if ((firstNumber == secondNumber) && (secondNumber == thirdNumber)) {
            System.out.println("The numbers are even");
        }
        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println(firstNumber + " is the greatest");
        } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println(secondNumber + " is the greatest");
        } else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
            System.out.println(thirdNumber + " is the greatest");
        }

    }
}
