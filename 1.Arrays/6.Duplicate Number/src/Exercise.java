import java.util.Arrays;

public class Exercise {


   public  void removeDuplicates(int[] array) {

       int[] temp = new int[array.length];
       // keeps track of current index of temp[] at which last value was inserted, so the next value can be inserted after incrementing it to next position
       int uniqueCount = 0;

       // i will loop through array
       for(int i=0;i<array.length;i++) {
           int cur = array[i];
           boolean isDuplicate = false;
           // j will be used to loop through temp[] to compare current value of array[] is already present in temp[]
           for(int j=0;j<temp.length;j++) {
               if(temp[j] == cur){
                   isDuplicate = true;
                   break;
               }
           }
           if(!isDuplicate) {
               temp[uniqueCount++] = cur;
           }
       }

       int[] result = new int[uniqueCount];
       for (int i = 0; i < uniqueCount; i++) {
           result[i] = temp[i];
       }

       for(int j: result) {
           System.out.print(j + " ");
       }

   }
}