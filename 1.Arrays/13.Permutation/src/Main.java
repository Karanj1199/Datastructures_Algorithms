//Your are given two integer arrays. Write a program to check if they are permutation of each other.
//
//Example
//
//int[] array1 = {1,2,3,4,5};
//int[] array2 = {5,1,2,3,4};
//permutation(array1, array2)
//Output
//
//true

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,1,2,3,4};
        Exercise exercise = new Exercise();

        System.out.println(exercise.permutation(array1,array2));
    }
}