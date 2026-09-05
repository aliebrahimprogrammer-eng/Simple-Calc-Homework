public class Calculator {

    private static int totalCalculations = 0;
    protected int lastResult;
    public String calculatorName;

    public Calculator(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    public int add(int x, int y){
        lastResult = x + y;
        totalCalculations++;
        return lastResult;
    }

    public int subtract (int x, int y){
        lastResult = x - y;
        totalCalculations++;
        return lastResult;
    }

    private void resetCalculator(){
        lastResult=0;
    }

    public void monthlyReset(){
       resetCalculator();
    }

    public static void showTotalCalculations(){
        System.out.println("Total calculations: " + totalCalculations);
    }

    public void showLastResult(){
        int lastResult = 77;
        System.out.println("lastResult as local var = " + lastResult);
        System.out.println("lastResult as instance var = " + this.lastResult);
    }

}
