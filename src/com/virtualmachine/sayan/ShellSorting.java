package com.virtualmachine.sayan;

public class ShellSorting {

    public static void shellSort() {

        int[] intArray = {1, 5, 7, 15, -22, -18, -34};

        for(int gap = intArray.length/2; gap > 0; gap /=2){
            for(int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];
                int j = i;

                while(j >= gap && intArray[j-gap] > newElement){
                    intArray[j] = intArray[j-gap];
                    j -=gap;
                }
                intArray[j] = newElement;
            }

        }



        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


    }
}
