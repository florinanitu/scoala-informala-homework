package a;

import java.util.Scanner;

public class AverageCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the array?");
        int n=sc.nextInt();
        int[] m= arrayLength(n);
        calculateAverage(m,n);
    }
    public static int[] arrayLength(int a){
        Scanner scanner=new Scanner(System.in);
        int [] array= new int [a];
        for (int i=0;i<a;i++){
            System.out.println("Please introduce the elements of the array["+ i +"] :");
            array[i]= scanner.nextInt();
        }
        return array;

    }

    public static int calculateAverage(int[] array, int n){
        int sum=0;
        int average;
        for (int i=0;i<n;i++){
            sum=sum+ array[i];
        }
        average=sum/n;
        System.out.println("The average of all numbers is: " + average);
        return average;
    }
}

