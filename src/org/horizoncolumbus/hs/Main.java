package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = new int[5];

        for(int i = 0; i < 5; i++){
            numbers[i] = i + 1;
        }

        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum += numbers[i];
        }

        StringBuilder formula = new StringBuilder();
        for(int i = 0; i < 5; i++){
            if (numbers[i] == 5){
                formula.append(numbers[i]);
            }
            else {
                formula.append(numbers[i]).append(" + ");
            }
        }

        System.out.println(formula + " = " + sum);
    }
}
