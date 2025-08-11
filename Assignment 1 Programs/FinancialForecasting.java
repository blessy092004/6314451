public class FinancialForecasting {
    static void explainRecursion() {
        System.out.println("Recursion Concept");
        System.out.println("Recursion is when a function calls itself to solve smaller instances of the same problem.");
        System.out.println("It simplifies problems like factorial,Fibonacci,and in this case,financial forecasting.\n");
    }
    static double predictFutureValue(int years,double initialValue,double growthRate) {
        if (years==0) {
            return initialValue;
        }
        return predictFutureValue(years-1,initialValue,growthRate)*(1+growthRate);
    }
    static void analyzeComplexity() {
        System.out.println("\nAnalysis");
        System.out.println("Time Complexity: O(n) — because each recursive call reduces 'years' by 1.");
        System.out.println("Recursive calls can lead to stack overflow for very large 'n'.");
        System.out.println("Optimization: Use Iteration or Memoization to avoid redundant computation.");
    }
    public static void main(String[] args) {
        explainRecursion();
        double initialValue=10000; 
        double growthRate=0.05;    
        int years=5;
        System.out.println("Financial Forecast");
        double futureValue = predictFutureValue(years,initialValue,growthRate);
        System.out.printf("Initial Value: %.2f\n",initialValue);
        System.out.printf("Growth Rate: %.2f%% per year\n",growthRate*100);
        System.out.printf("Forecast after %d years: %.2f\n",years,futureValue);
        analyzeComplexity();
    }
}
