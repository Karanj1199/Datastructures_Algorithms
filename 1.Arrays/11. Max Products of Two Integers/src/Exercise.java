public class Exercise {
    public void maxProduct(int[] array) {
        int max = 0;
        for(int i=0;i<array.length-1;i++){
            for(int j=1;j<array.length;j++){
                if(array[i]*array[j] > max){
                    max = array[i]*array[j];
                }
            }
        }
        System.out.println(max);
    }
}
