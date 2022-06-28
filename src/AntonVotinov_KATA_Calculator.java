import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String userInputtedString;
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Dear user, please write down the mathematical expression");
            userInputtedString = in.nextLine();

            int e = 0;
            int p = userInputtedString.length();
            char[] authorizedChars = {'1','2','3','4','5','6','7','8','9','0','+','-','*','/',' ','I','V','X','L','C','D','M'};
            for (int i = 0; i < userInputtedString.length(); i++) {
                char chars = userInputtedString.charAt(i);
                for (char authorizedChar : authorizedChars) {
                    if (authorizedChar == chars) {
                        e++;
                    }
                }
            }
            if (userInputtedString.length() < 3) {
                throw new IOException();
            }

                if ((0 <= e) && (e < p))
                    throw new IOException();
                else {
                    int e1 = 0;
                    char[] operands = {'+', '-', '/', '*'};
                    for (int i = 0; i < userInputtedString.length(); i++) {
                        char charInStr = userInputtedString.charAt(i);
                        for (char operand : operands) {
                            if (operand == charInStr) {
                                e1++;
                            }
                        }
                    }

                    if (e1 == 0) {
                        throw new IOException();
                    } else {
                        if (e1 > 1) {
                            throw new IOException();
                        } else {
                            String[] aAndB = userInputtedString.split("[+\\-*/]");
                            String stringBeforeOperand = aAndB[0];
                            int charsBeforeOperandLength = stringBeforeOperand.length();
                            String operand = String.valueOf(userInputtedString.charAt(charsBeforeOperandLength));
                            String a = aAndB[0].trim();
                            String b = aAndB[1].trim();
                            int aNum = 0;
                            int bNum = 0;
                            int aResult = 0;
                            String[] arrOfRoman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
                            String[] arrOfArabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
                            if (Arrays.asList(arrOfArabic).contains(a) && Arrays.asList(arrOfArabic).contains(b) ||
                                    Arrays.asList(arrOfRoman).contains(a) && Arrays.asList(arrOfRoman).contains(b)) {
                                if (a==null | b==null) {
                                    throw new IOException();
                                }
                                else {
                                    if (Arrays.asList(arrOfRoman).contains(a) && Arrays.asList(arrOfRoman).contains(b)) {
                                        switch (a) {
                                            case "I": aNum = 1; break;
                                            case "II": aNum = 2; break;
                                            case "III": aNum = 3; break;
                                            case "IV": aNum = 4; break;
                                            case "V": aNum = 5; break;
                                            case "VI": aNum = 6; break;
                                            case "VII": aNum = 7; break;
                                            case "VIII": aNum = 8; break;
                                            case "IX": aNum = 9; break;
                                            case "X": aNum = 10; break;
                                            default: throw new IOException();
                                        }
                                        switch (b) {
                                            case "I": bNum = 1; break;
                                            case "II": bNum = 2; break;
                                            case "III": bNum = 3; break;
                                            case "IV": bNum = 4; break;
                                            case "V": bNum = 5; break;
                                            case "VI": bNum = 6; break;
                                            case "VII": bNum = 7; break;
                                            case "VIII": bNum = 8; break;
                                            case "IX": bNum = 9; break;
                                            case "X": bNum = 10; break;
                                            default: throw new IOException();
                                        }
                                        switch (operand) {
                                            case "+": aResult = aNum + bNum; break;
                                            case "-": aResult = aNum - bNum; break;
                                            case "*": aResult = aNum * bNum; break;
                                            case "/": aResult = aNum / bNum; break;
                                            default: throw new IOException();
                                        }
                                        if (1 > aResult) {
                                            throw new IOException();
                                        } else {
                                            StringBuilder convertedToRoman = new StringBuilder();
                                            while (aResult >= 100) {convertedToRoman.append("C");aResult -= 100;}
                                            while (aResult >= 90) {convertedToRoman.append("XC");aResult -= 90;}
                                            while (aResult >= 50) {convertedToRoman.append("L");aResult -= 50;}
                                            while (aResult >= 40) {convertedToRoman.append("XL");aResult -= 40;}
                                            while (aResult >= 10) {convertedToRoman.append("X");aResult -= 10;}
                                            while (aResult >= 9) {convertedToRoman.append("IX");aResult -= 9;}
                                            while (aResult >= 5) {convertedToRoman.append("V");aResult -= 5;}
                                            while (aResult >= 4) {convertedToRoman.append("IV");aResult -= 4;}
                                            while (aResult >= 1) {convertedToRoman.append("I");aResult -= 1;}
                                            System.out.println("Result of mathematical expression: " + convertedToRoman + "\n");
                                        }
                                    } else {
                                        aNum = Integer.parseInt(a);
                                        bNum = Integer.parseInt(b);
                                        switch (operand) {
                                            case "+":aResult = aNum + bNum;break;
                                            case "-":aResult = aNum - bNum;break;
                                            case "*":aResult = aNum * bNum;break;
                                            case "/":aResult = aNum / bNum;break;
                                            default: throw new IOException();
                                        }
                                        System.out.println("Result of mathematical expression: " + aResult + "\n");
                                    }
                                }} else {
                                throw new IOException();
                            }
                        }
                    }
                }

        }
    }
}
