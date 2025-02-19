package academy.devdojo.maratonaJava.javacore.IntroduceMethods.test;

import academy.devdojo.maratonaJava.javacore.IntroduceMethods.domain.Calculator;

public class calculatortest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        boolean results = calculator.ehPrimo(6);
        System.out.println(results);


    }
}
