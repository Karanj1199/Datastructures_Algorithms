public class Exercise {

    public void sumOfDiagonal(int[][] array) {

        int sum=0;
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[0].length;j++) {
                if(i==j) {
                    sum += array[i][j];
                    System.out.println("The diagonal elements are: " + array[i][j]);
                }
            }
        }

        System.out.println("Sum of diagonal elements: " + sum);
    }
}
