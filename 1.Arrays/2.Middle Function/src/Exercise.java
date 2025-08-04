public class Exercise {

    public void middle(int[] array) {
        int[] newArray = new int[array.length-2];
       for(int i=1;i<array.length-1;i++) {
           newArray[i-1] = array[i];
       }

        for (int j : newArray) {
            System.out.print(j + " ");
        }

    }
}
