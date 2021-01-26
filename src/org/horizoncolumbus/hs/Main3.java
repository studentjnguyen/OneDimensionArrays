package org.horizoncolumbus.hs;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please specify array size: ");
        int arraySize = input.nextInt();
        int[] numbers = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            System.out.println("Enter Array[" + i + "]: ");
            int arrayInteger = input.nextInt();
            numbers[i] = arrayInteger;
        }

        int sum = 0;
        for(int i = 0; i < arraySize; i++){

            sum += numbers[i];
        }


        StringBuilder formula = new StringBuilder();
        for(int i = 0; i < arraySize; i++){
            if (numbers[i] == 5){
                formula.append(numbers[i]);
            }
            else {
                formula.append(numbers[i]).append(" + ");
            }
        }

        System.out.println(formula + " = " + sum);
        input.close();
    }
}
