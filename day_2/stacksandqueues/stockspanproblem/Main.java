package stacksandqueues.stockspanproblem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Stock prices
        int[] stockPrices = {100, 80, 60, 70, 60, 75, 85};

        // Create StockSpan object and calculate span
        StockSpan stockSpan = new StockSpan(stockPrices);
        int[] result = stockSpan.calculateSpan();

        // Output the span values
        System.out.println("Stock span for each day: " + Arrays.toString(result));
    }
}
