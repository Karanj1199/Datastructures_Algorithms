
//Best Score
//Given an array, write a function to get first, second best scores from the array and return it in new array.
//
//Array may contain duplicates.
//
//Example
//
//        myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
//firstSecond(myArray) // {90, 87}


public class Main {
    public static void main(String[] args) {
        Exercise ex = new Exercise();

        int[] array = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        ex.twoHighestScore(array);

    }
}