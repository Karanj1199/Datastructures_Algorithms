public class Exercise {

    public void removeDuplicates(int[] array) {

        int count = 1;
        int j = 1;

        for(int i=0;i<array.length-1;i++) {
            if(array[i] != array[j]) {
                count++;
            }
            j++;
        }

        System.out.println(count);
    }
}
