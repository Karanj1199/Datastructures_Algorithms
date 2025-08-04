public class Exercise {

    public int searchInArray(int[] intArray,int valueToSearch) {
        int position = 0;
        for(int i=0;i<intArray.length;i++) {
            if(intArray[i] == valueToSearch) {
                position = i+1;
                System.out.println(valueToSearch + " is present at " + position + " location");
            }
        }
        
        return position;
    }
}
