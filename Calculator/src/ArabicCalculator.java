public class ArabicCalculator{
    private int firstNumber;
    private int secondNumber;
    private char arithmeticOperation;

    public ArabicCalculator(String firstNumber, String secondNumber, char arithmeticOperation){
        this.firstNumber = Integer.parseInt(firstNumber);
        this.secondNumber = Integer.parseInt(secondNumber);
        this.arithmeticOperation = arithmeticOperation;
        result();
    }

    public void result() {
        if (arithmeticOperation=='*'){
            System.out.println("Output:\n" + (firstNumber * secondNumber));
        }
        if (arithmeticOperation=='/'){
            System.out.println("Output:\n" + (firstNumber / secondNumber));
        }
        if (arithmeticOperation=='+'){
            System.out.println("Output:\n" + (firstNumber + secondNumber));
        }
        if (arithmeticOperation=='-'){
            System.out.println("Output:\n" + (firstNumber - secondNumber));
        }
    }
}