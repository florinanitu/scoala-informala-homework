
import java.util.Scanner;

public class DisplayNumbersFromStartToFinish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce start number");
        int start = sc.nextInt();
        System.out.println("Introduce finish number");
        int finish = sc.nextInt();
        int index;
        if (start < finish)
            for (index = start; index <= finish; index++)
                System.out.println(index);
        else
            for (index = finish; index <= start; index++)
                System.out.println(index);
    }
}
