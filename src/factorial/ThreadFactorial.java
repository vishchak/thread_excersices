package factorial;

import java.math.BigInteger;

public class ThreadFactorial implements Runnable {
    @Override
    public void run() {
        factorial(Thread.currentThread().getId());
    }

    public BigInteger factorial(long number) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
        return fact;
    }
}
