 import java.io.IOException;
import java.util.*;
 public class Main {         
        public static String calc(String input) {
               
        return  calc(input);   
        }
 public static void main(String[] args) throws IOException {
        try  (Scanner inputValue =new Scanner(System.in)) {
        System.out.println("Введите выражение, разделяя каждый символ пробелом. Вводите числа от 1 до 10");
        String input = inputValue.nextLine();
        String[] symb = input.split(" ");
        int num1 =0;
        int num2 = 0;
        try {
        num1 = Integer.parseInt(symb[0]);
        num2 = Integer.parseInt(symb[2]);
           
            if (0 < num1 && num1 <= 10 && 0< num2 && num2 <= 10) {}
                else {
                    throw new IOException(input, null);
                    
                }
                          
                } catch (Exception e) {
                  throw new IOException(input, null);
                }
        String oper = symb[1];
        
        if (oper.equals("+")) {
            int result = num1 + num2;
            String resultStr = Integer.toString(result);
            System.out.println("Ваш ответ: "+resultStr);
        } else if (oper.equals("-")) {
            int result = num1 - num2;
            String resultStr = Integer.toString(result);
            System.out.println("Ваш ответ: "+resultStr);
        } else if (oper.equals("*")) {
            int result = num1*num2;
            String resultStr = Integer.toString(result);
            System.out.println("Ваш ответ: "+resultStr);
        } else if (oper.equals("/")) {
            int result = num1/num2;
            String resultStr = Integer.toString(result);
            System.out.println("Ваш ответ: "+resultStr);
        }
         } catch (Exception e) {
         
        }
       
        }
}

 