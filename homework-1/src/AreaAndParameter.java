import java.util.Scanner;

public class AreaAndParameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please introduce length");
        int length = sc.nextInt();
        System.out.println("Please introduce width");
        int width = sc.nextInt();

        if ((length > 0) || (width > 0)) {
            int perimeter = 2 * length + 2 * width;
            int area = length * width;
            System.out.println("The perimeter is: "+ perimeter);
            System.out.println("The area is "+ area);
        } else {
            System.out.println("Please introduce values that are greater than 0");
        }

    }
}
