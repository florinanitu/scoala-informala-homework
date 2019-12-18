public class CalculateSum {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        for (i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of the first 100 numbers higher than 0 is: " + sum);
    }
}

