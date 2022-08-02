public class Calculator {

    private Boolean status;
    private int add;
    private int subtract;
    private int multiply;
    private double divide;


    public Calculator() {
        status = true;
    }
    public boolean getStatus(){
        return status;
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}
