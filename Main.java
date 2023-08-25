import java.util.*;
class InputException extends Exception {
        InputException(String message) {
            super(message);
        }
    }
public class Main {         
    public static String calc(String input) {  
        return  calc(input);   
        }
public static void main(String[] args) throws InputException {
        try  (Scanner inputValue =new Scanner(System.in)) {
        System.out.println("Введите выражение, разделяя каждый символ пробелом. Вводите числа от 1 до 10");
        String input = inputValue.nextLine();
        String[] symb = input.split(" ");
        if (symb.length != 3) 
            throw new InputException("Неверный формат выражения");

        int num1 =0;
        int num2 = 0;
        try {
        num1 = Integer.parseInt(symb[0]);
        num2 = Integer.parseInt(symb[2]);
           } catch (Exception e) {
                  System.out.println("Вводите числа!");
                  System.exit(0);
            }
            if (0 < num1 && num1 <= 10 && 0< num2 && num2 <= 10) {}
                else {
                    throw new InputException("Вводите числа от 1 до 10!");
                }
                         
                
        String oper = symb[1];
        
        if (oper.equals("+")) {
            int result = num1 + num2;
            String resultStr = Integer.toString(result);
            System.out.println(resultStr);
        } else if (oper.equals("-")) {
            int result = num1 - num2;
            String resultStr = Integer.toString(result);
            System.out.println(resultStr);
        } else if (oper.equals("*")) {
            int result = num1*num2;
            String resultStr = Integer.toString(result);
            System.out.println(resultStr);
        } else if (oper.equals("/")) {
            int result = num1/num2;
            String resultStr = Integer.toString(result);
            System.out.println(resultStr);
        }
         } catch (InputException ms) {
         System.out.println(ms);
        }
       
        }
}

 