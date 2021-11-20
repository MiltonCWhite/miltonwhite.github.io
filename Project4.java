package com.CS102;

import java.util.Scanner;

public class Project4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index of the array: ");

        int [] array = getArray();

        try {
            System.out.println("The corresponding element value is: " + array[scanner.nextInt()]);

        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
    }


    public static int[] getArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) ;
        }
        return array;

    }

}
