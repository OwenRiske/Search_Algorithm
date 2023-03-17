package com.company;

public class sort {

    public static int[] intSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j]<array[j-1]){
                    array=swap(array,j,j-1);
                }

            }
        }
        return array;
    }

    public static String[] stringSort(String[] array, String toBeSearchedFor){
        String[] key= toBeSearchedFor.split(" ");
        int[] intArray=new int[array.length];

        for (int i = 0; i < array.length; i++) {
            String[] tempArray=array[i].split(" ");
            for (int j = 0; j < tempArray.length; j++) {
                for (int k = 0; k < key.length; k++) {
                    if(tempArray[j].equalsIgnoreCase(key[k])){
                        intArray[i]=intArray[i]+1;
                    }
                    else{
                        break;
                    }
                }
            }

        }
        displayArray(intArray);
        displayArray(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (intArray[j]<intArray[j-1]){
                    array=swap(array,j,j-1);
                    intArray=swap(intArray,j,j-1);
                }

            }
        }
        return array;


    }



    public static int[] swap(int[] array, int index1, int index2) {
        //preset variable
        int tempNum=array[index1];

        //set inputed variables as each other
        array[index1]=array[index2];
        array[index2]=tempNum;


        return array;
    }
    public static String[] swap(String[] array, int index1, int index2) {
        //preset variable
        String tempString=array[index1];

        //set inputed variables as each other
        array[index1]=array[index2];
        array[index2]=tempString;


        return array;
    }


    public static void displayArray(int[] array){
        //display array except last element
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+", ");
        }
        //display last element
        System.out.println(array[array.length-1]);
    }
    public static void displayArray(String[] array){
        //display array except last element
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+", ");
        }
        //display last element
        System.out.println(array[array.length-1]);
    }
}

