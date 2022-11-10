package factorial;

public class Main {
    /**
     * Create threads that will calculate the factorial
     * a number equal to the number of this stream, and output the result to the screen.
     */
    public static void main(String[] args) {

        ThreadFactorial threadFactorial = new ThreadFactorial();
        Thread thread1 = new Thread(threadFactorial);
        Thread thread2 = new Thread(threadFactorial);
        Thread thread3 = new Thread(threadFactorial);
        Thread thread4 = new Thread(threadFactorial);
        Thread thread5 = new Thread(threadFactorial);
        Thread thread6 = new Thread(threadFactorial);
        Thread thread7 = new Thread(threadFactorial);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();


    }
}
