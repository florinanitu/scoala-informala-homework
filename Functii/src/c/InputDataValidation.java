package c;

import java.util.Scanner;

public class InputDataValidation {

    public static void main(String[] args) {
        System.out.println("What time is it?");
        System.out.println("Please introduce the hour");
        Scanner sc=new Scanner(System.in);
        int hour=sc.nextInt();
        System.out.println("Please introduce the minutes");
        int min=sc.nextInt();
        validateData(hour,min);
    }

    public static void validateData(int hour, int minutes){
        if (hour>24 || hour==0)
            System.out.println("Incorrect time!");
        if (minutes>60)
            System.out.println("Incorrect time!");
        else
            System.out.println("The time is: "+ hour +":"+minutes +" now");
    }
}

