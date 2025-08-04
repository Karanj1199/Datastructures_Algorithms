//IsUnique / Contains Duplicate - LeetCode 217
//Write a program to check if an array is unique or not.
//
//Example
//
//int[] intArray = {1,2,3,4,5,6};
//isUnique(intArray)

public class Main {
    public static void main(String[] args) {
        Exercise ex = new Exercise();
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {1,2,3,4,2,5,6};

        ex.isUnique(array1);
        ex.isUnique(array2);
    }
}