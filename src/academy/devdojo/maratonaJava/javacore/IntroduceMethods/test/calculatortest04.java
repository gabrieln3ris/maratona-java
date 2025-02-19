package academy.devdojo.maratonaJava.javacore.IntroduceMethods.test;

import academy.devdojo.maratonaJava.javacore.IntroduceMethods.domain.Calculator;

public class calculatortest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] array = {3,4,8,12,6};
        int[] arrayResults = calculator.multX2(array);
     for (int num :arrayResults){
         System.out.println(num + " ");
     }
    }
}
