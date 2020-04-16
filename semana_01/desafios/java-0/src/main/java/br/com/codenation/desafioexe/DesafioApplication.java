package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

    public static List<Integer> fibonacci() {

        List<Integer> fib_sequence = new ArrayList<Integer>();
        int maxNum = 350, previousNum = 0, nextNum = 1;

        while (previousNum <= maxNum) {
            fib_sequence.add(previousNum);

            int sum = previousNum + nextNum;
            previousNum = nextNum;
            nextNum = sum;
        }
        fib_sequence.add(previousNum);
        return fib_sequence;
    }

    public static Boolean isFibonacci(Integer a) {

        return fibonacci().contains(a);
    }
}