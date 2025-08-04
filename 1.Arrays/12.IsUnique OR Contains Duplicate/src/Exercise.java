public class Exercise {
    public void isUnique(int[] array) {

        boolean isUnique = true;

        for(int i=0;i<array.length;i++) {
            for(int j=i+1;j<array.length;j++) {
                if(array[i] == array[j]) {
                    isUnique = false;
                }
            }
        }
        if(isUnique){
            System.out.println("Array is unique");
        } else {
            System.out.println("Array is not unique");
        }

    }
}
