public class Exercise {

    public void findMissingNumberInArray(int[] array) {

        // n(n+1)/2
        int sum = ((array.length+1) * (array.length+2)) / 2;

        int total = 0;
        for(int i: array) {
            total += i;
        }

        System.out.println("Missing number is: " + (sum-total));
    }
}
