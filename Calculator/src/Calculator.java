import java.util.Scanner;

public class Calculator {
    private String firstNumber;
    private String secondNumber;
    private char arithmeticOperation;
    private Scanner scanner;

    public Calculator(){
        scanner = new Scanner(System.in);
        firstNumber = "";
        secondNumber = "";
        input();
    }


    public void input(){
        int counter = 0;

        System.out.println("Input:");
        String inputValues = scanner.next();

        for (int i = 0; i < inputValues.length(); i++) {
            if (inputValues.charAt(i) == '*' || inputValues.charAt(i) == '/' || inputValues.charAt(i) == '+' || inputValues.charAt(i) == '-' ){
                counter++;
                if (counter > 1){
                    System.out.println("Error!");
                    return;
                }
                arithmeticOperation = inputValues.charAt(i);
                continue;
            }
            if (counter == 0){
                firstNumber+=inputValues.charAt(i);
            }else{
                secondNumber+=inputValues.charAt(i);
            }
        }

        if (secondNumber.isEmpty()){
            System.out.println("Error!");
            return;
        }

        if (isNumber(firstNumber) && isNumber(secondNumber)){
            new ArabicCalculator(firstNumber,secondNumber,arithmeticOperation);
        }else{
            if (isRomanNumber(firstNumber) && isRomanNumber(secondNumber)){
                if (toArabic(firstNumber)==0 || toArabic(secondNumber) == 0){
                    System.out.println("Error!");
                    return;
                }
                new RomanCalculator(firstNumber,secondNumber,arithmeticOperation);
            }else{
                System.out.println("Error!");
                return;
            }
        }
    }

    public int toArabic(String number){
        int result = 0;
        if (number.equals("I"))result = 1;
        if (number.equals("II"))result = 2;
        if (number.equals("III"))result = 3;
        if (number.equals("IV"))result = 4;
        if (number.equals("V"))result = 5;
        if (number.equals("VI"))result = 6;
        if (number.equals("VII"))result = 7;
        if (number.equals("VIII"))result = 8;
        if (number.equals("IX"))result = 9;
        if (number.equals("X"))result = 10;
        return result;
    }

    public boolean isNumber(String number){
        for (int i = 0; i < number.length(); i++) {
            boolean checker = false;
            for (int j = 48; j < 58; j++) {
                if (number.charAt(i)==j){
                    checker = true;
                }
            }
            if (!checker){
                return false;
            }
        }
        return true; 
    }
    
    public boolean isRomanNumber(String number){
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == 73 || number.charAt(i) == 86 || number.charAt(i) == 88){

            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}



