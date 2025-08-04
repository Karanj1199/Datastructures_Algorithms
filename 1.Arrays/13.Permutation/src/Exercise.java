public class Exercise {

    public boolean permutation(int[] array1,int[] array2){
        boolean isPermutation;
        int count=0;

        for (int k : array1) {
            for (int i : array2) {
                if (k == i) {
                    count++;
                }
            }
        }
        isPermutation = count == array1.length;
        return isPermutation;
    }
}
