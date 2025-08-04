public class Exercise {

public void maxProfit(int[] array) {
    int min = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int price: array) {
        if(price < min) {
            min = price;
        } else if(price - min > maxProfit) {
            maxProfit = price - min;
        }
    }

    System.out.println("Max-Profit:" + maxProfit);
}
}
