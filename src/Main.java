public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator("MyCalculator");

        int sum;
        sum = calc.add(7,7);

        int diff;
        diff = calc.subtract(10,7);

        System.out.println(sum);
        System.out.println(diff);
        calc.monthlyReset();
        calc.showLastResult();
        Calculator.showTotalCalculations();
    }
}
