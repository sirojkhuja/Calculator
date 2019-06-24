public class RomanCalculator{
    private int firstNumber;
    private int secondNumber;
    private char arithmeticOperation;


    public RomanCalculator(String firstNumber, String secondNumber, char arithmeticOperation){
        this.firstNumber = toArabic(firstNumber);
        this.secondNumber = toArabic(secondNumber);
        this.arithmeticOperation = arithmeticOperation;
        result();
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

    public void result() {
        if (arithmeticOperation=='*'){
            System.out.println("Output:\n" + toRoman(firstNumber * secondNumber));
        }
        if (arithmeticOperation=='/'){
            System.out.println("Output:\n" + toRoman(firstNumber / secondNumber));
        }
        if (arithmeticOperation=='+'){
            System.out.println("Output:\n" + toRoman(firstNumber + secondNumber));
        }
        if (arithmeticOperation=='-'){
            System.out.println("Output:\n" + toRoman(firstNumber - secondNumber));
        }
    }

    public String toRoman(int inputNumber){
        String outputNumber = "";
        if (inputNumber == 1)outputNumber = "I";
        if (inputNumber == 2)outputNumber = "II";
        if (inputNumber == 3)outputNumber = "III";
        if (inputNumber == 4)outputNumber = "IV";
        if (inputNumber == 5)outputNumber = "V";
        if (inputNumber == 6)outputNumber = "VI";
        if (inputNumber == 7)outputNumber = "VII";
        if (inputNumber == 8)outputNumber = "VIII";
        if (inputNumber == 9)outputNumber = "IX";
        if (inputNumber == 10)outputNumber = "X";
        if (inputNumber == 11)outputNumber = "XI";
        if (inputNumber == 12)outputNumber = "XII";
        if (inputNumber == 13)outputNumber = "XIII";
        if (inputNumber == 14)outputNumber = "XIV";
        if (inputNumber == 15)outputNumber = "XV";
        if (inputNumber == 16)outputNumber = "XVI";
        if (inputNumber == 17)outputNumber = "XVII";
        if (inputNumber == 18)outputNumber = "XVIII";
        if (inputNumber == 19)outputNumber = "XIX";
        if (inputNumber == 20)outputNumber = "XX";
        if (inputNumber == 21)outputNumber = "XXI";
        if (inputNumber == 22)outputNumber = "XXII";
        if (inputNumber == 23)outputNumber = "XXIII";
        if (inputNumber == 24)outputNumber = "XXIV";
        if (inputNumber == 25)outputNumber = "XXV";
        if (inputNumber == 26)outputNumber = "XXVI";
        if (inputNumber == 27)outputNumber = "XXVII";
        if (inputNumber == 28)outputNumber = "XXVIII";
        if (inputNumber == 29)outputNumber = "XXIX";
        if (inputNumber == 30)outputNumber = "XXX";
        if (inputNumber == 31)outputNumber = "XXXI";
        if (inputNumber == 32)outputNumber = "XXXII";
        if (inputNumber == 33)outputNumber = "XXXIII";
        if (inputNumber == 34)outputNumber = "XXXIV";
        if (inputNumber == 35)outputNumber = "XXXV";
        if (inputNumber == 36)outputNumber = "XXXVI";
        if (inputNumber == 37)outputNumber = "XXXVII";
        if (inputNumber == 38)outputNumber = "XXXVIII";
        if (inputNumber == 39)outputNumber = "XXXIX";
        if (inputNumber == 40)outputNumber = "XL";
        if (inputNumber == 41)outputNumber = "XLI";
        if (inputNumber == 42)outputNumber = "XLII";
        if (inputNumber == 43)outputNumber = "XLIII";
        if (inputNumber == 44)outputNumber = "XLIV";
        if (inputNumber == 45)outputNumber = "XLV";
        if (inputNumber == 46)outputNumber = "XLVI";
        if (inputNumber == 47)outputNumber = "XLVII";
        if (inputNumber == 48)outputNumber = "XLVIII";
        if (inputNumber == 49)outputNumber = "XLIX";
        if (inputNumber == 50)outputNumber = "L";
        if (inputNumber == 51)outputNumber = "LI";
        if (inputNumber == 52)outputNumber = "LII";
        if (inputNumber == 53)outputNumber = "LIII";
        if (inputNumber == 54)outputNumber = "LIV";
        if (inputNumber == 55)outputNumber = "LV";
        if (inputNumber == 56)outputNumber = "LVI";
        if (inputNumber == 57)outputNumber = "LVII";
        if (inputNumber == 58)outputNumber = "LVIII";
        if (inputNumber == 59)outputNumber = "LIX";
        if (inputNumber == 60)outputNumber = "LX";
        if (inputNumber == 61)outputNumber = "LXI";
        if (inputNumber == 62)outputNumber = "LXII";
        if (inputNumber == 63)outputNumber = "LXIII";
        if (inputNumber == 64)outputNumber = "LXIV";
        if (inputNumber == 65)outputNumber = "LXV";
        if (inputNumber == 66)outputNumber = "LXVI";
        if (inputNumber == 67)outputNumber = "LXVII";
        if (inputNumber == 68)outputNumber = "LXVIII";
        if (inputNumber == 69)outputNumber = "LXIX";
        if (inputNumber == 70)outputNumber = "LXX";
        if (inputNumber == 71)outputNumber = "LXXI";
        if (inputNumber == 72)outputNumber = "LXXII";
        if (inputNumber == 73)outputNumber = "LXXIII";
        if (inputNumber == 74)outputNumber = "LXXIV";
        if (inputNumber == 75)outputNumber = "LXXV";
        if (inputNumber == 76)outputNumber = "LXXVI";
        if (inputNumber == 77)outputNumber = "LXXVII";
        if (inputNumber == 78)outputNumber = "LXXVIII";
        if (inputNumber == 79)outputNumber = "LXXIX";
        if (inputNumber == 80)outputNumber = "LXXX";
        if (inputNumber == 81)outputNumber = "LXXXI";
        if (inputNumber == 82)outputNumber = "LXXXII";
        if (inputNumber == 83)outputNumber = "LXXXIII";
        if (inputNumber == 84)outputNumber = "LXXXIV";
        if (inputNumber == 85)outputNumber = "LXXXV";
        if (inputNumber == 86)outputNumber = "LXXXVI";
        if (inputNumber == 87)outputNumber = "LXXXVII";
        if (inputNumber == 88)outputNumber = "LXXXVIII";
        if (inputNumber == 89)outputNumber = "LXXXIX";
        if (inputNumber == 90)outputNumber = "XC";
        if (inputNumber == 91)outputNumber = "XCI";
        if (inputNumber == 92)outputNumber = "XCII";
        if (inputNumber == 93)outputNumber = "XCIII";
        if (inputNumber == 94)outputNumber = "XCIV";
        if (inputNumber == 95)outputNumber = "XCV";
        if (inputNumber == 96)outputNumber = "XCVI";
        if (inputNumber == 97)outputNumber = "XCVII";
        if (inputNumber == 98)outputNumber = "XCVIII";
        if (inputNumber == 99)outputNumber = "XCIX";
        if (inputNumber == 100)outputNumber = "C";
        if (inputNumber == -1)outputNumber = "-I";
        if (inputNumber == -2)outputNumber = "-II";
        if (inputNumber == -3)outputNumber = "-III";
        if (inputNumber == -4)outputNumber = "-IV";
        if (inputNumber == -5)outputNumber = "-V";
        if (inputNumber == -6)outputNumber = "-VI";
        if (inputNumber == -7)outputNumber = "-VII";
        if (inputNumber == -8)outputNumber = "-VIII";
        if (inputNumber == -9)outputNumber = "-IX";
        return outputNumber;
    }

}