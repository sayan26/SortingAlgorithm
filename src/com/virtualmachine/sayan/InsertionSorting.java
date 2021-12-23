package com.virtualmachine.sayan;

public class InsertionSorting {

    public static void insertionSort(){
        int[] intArray = {1,5,7,15,-22,-18,-34};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }
        for(int i=0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
