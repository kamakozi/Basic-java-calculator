package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        float number_1 = input.nextFloat();
        System.out.println("First number: " + number_1 +"\nEnter your second number: ");
        float number_2 = input.nextFloat();
        System.out.println("First number: " + number_1 + "\nSecond number: " + number_2 +"\n1.+\n2.-\n3.*\n4./\nEnter your operator:");
        int operator = input.nextInt();
            switch(operator){
                case 1:
                    plus(number_1,number_2);
                    break;
                case 2:
                    minus(number_1,number_2);
                    break;
                case 3:
                    multiple(number_1,number_2);
                    break;
                case 4:
                    divide(number_1,number_2);
                    break;
            }

    }


    public static float plus(float number_1,float number_2){
        float sum = number_1 + number_2;
        System.out.println(number_1 + " + " + number_2 + " = " + sum);
        return sum;
    }

    public static float minus(float number_1,float number_2){
        float sum = number_1 - number_2;
        System.out.println(number_1 + " - " + number_2 + " = " + sum);
        return sum;
    }

    public static float multiple(float number_1,float number_2){
        float sum = number_1 * number_2;
        System.out.println(number_1 + " * " + number_2 + " = " + sum);
        return sum;
    }

    public static float divide(float number_1,float number_2){
        float sum = number_1 / number_2;
        System.out.println(number_1 + " / " + number_2 + " = " + sum);
        return sum;
    }
}
