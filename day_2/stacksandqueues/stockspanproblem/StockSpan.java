package stacksandqueues.stockspanproblem;

public class StockSpan {
    private int[] prices;

    // Constructor to initialize prices array
    public StockSpan(int[] prices) {
        this.prices = prices;
    }

    // Method to calculate stock span for each day
    public int[] calculateSpan() {
        int n = prices.length;
        int[] span = new int[n];  // Store the span values
        Stack stack = new Stack(n);  // Stack to store indices

        // Loop to calculate span for each day
        for (int i = 0; i < n; i++) {
            // Pop elements smaller than current price
            while (!stack.isEmpty() && prices[stack.top()] <= prices[i]) {
                stack.pop();
            }

            // Calculate span based on stack state
            span[i] = (stack.isEmpty()) ? i + 1 : i - stack.top();
            stack.push(i);  // Push current index to stack
        }
        return span;  // Return the span array
    }
}
