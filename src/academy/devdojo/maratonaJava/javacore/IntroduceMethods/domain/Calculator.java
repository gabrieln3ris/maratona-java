package academy.devdojo.maratonaJava.javacore.IntroduceMethods.domain;

public class Calculator {
    public void soma() {
        System.out.println(10 + 10);

    }

    public void mult (int num1, int num2 ){
        int x = num1 * num2;
        System.out.println(x);
    }
    public boolean ehPrimo (int num){
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;

    }

    public int [] multX2(int[] num){
        int [] results = new int[num.length];
        for (int i = 0; i < num.length; i++){
            results[i] = num[i] * 2;
        }
        return results;

    }
}

