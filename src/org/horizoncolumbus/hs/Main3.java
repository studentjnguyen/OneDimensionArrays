package org.horizoncolumbus.hs;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please specify array size: ");
        String string = input.nextLine();
        int arraySize = Integer.parseInt(string);
        int[] numbers = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            numbers[i] = i + 1;
        }

        int sum = 0;
        for(int i = 0; i < arraySize; i++){
            sum += numbers[i];
        }

        System.out.println(sum);
        input.close();
    }
}
