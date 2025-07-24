import java.util.Arrays;

public class Exercise {

    public void twoHighestScore(int[] array) {
           int firstHighest = Integer.MIN_VALUE;
           int secondHighest = Integer.MIN_VALUE;

           for(int i=0;i<array.length;i++) {
               int currentValue = array[i];

               if(currentValue > firstHighest) {
                   secondHighest = firstHighest;
                   firstHighest = currentValue;
               } else if(currentValue > secondHighest && currentValue < firstHighest) {
                   secondHighest = currentValue;
               }
           }

           int[] newArray = {firstHighest,secondHighest};
           for(int j: newArray) {
               System.out.print(j + " ");
           }

        }
    }

