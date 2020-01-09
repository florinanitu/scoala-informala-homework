package d;

import java.util.Scanner;

public class CalculateMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the first number");
        int a = sc.nextInt();
        System.out.println("Introduce the second number");
        int b = sc.nextInt();
        System.out.println("Introduce the third number");
        int c = sc.nextInt();
        int firstMaxNr= getMax(a,b);
        int maxNr=getMax(firstMaxNr,c);
        System.out.println("The maximum of the three numbers is "+maxNr);

    }

    public static int getMax(int n1, int n2) {
        int max;
        if (n1 > n2)
            max = n1;
        else
            max = n2;

        return max;
    }


}

