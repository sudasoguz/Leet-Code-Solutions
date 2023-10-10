package printzeroevenodd;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

class ZeroEvenOdd {
    private int n;
    private boolean zeroPrinted;
    private int currentNumber;
    private Lock lock;
    private Condition condition;

    public ZeroEvenOdd(int n) {
        this.n = n;
        this.zeroPrinted = false;
        this.currentNumber = 1;
        lock = new ReentrantLock();
        condition = lock.newCondition();
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {

        while (currentNumber <= n) {
            lock.lock();
            try {
                while (zeroPrinted == true)
                    condition.await();

                if (currentNumber <= n) {
                    printNumber.accept(0);
                }
                zeroPrinted = true;
                condition.signalAll();
            } finally {
                lock.unlock();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {

        while (currentNumber <= n) {
            lock.lock();
            try {
                while (currentNumber % 2 == 1 || zeroPrinted == false)
                    condition.await();

                if (currentNumber <= n) {
                    printNumber.accept(currentNumber);
                }
                zeroPrinted = false;
                currentNumber++;
                condition.signalAll();
            } finally {
                lock.unlock();
            }

        }


    }

    public void odd(IntConsumer printNumber) throws InterruptedException {

        while (currentNumber <= n) {
            lock.lock();
            try {
                while (currentNumber % 2 == 0 || zeroPrinted == false)
                    condition.await();

                if (currentNumber <= n) {
                    printNumber.accept(currentNumber);
                }
                zeroPrinted = false;
                currentNumber++;
                condition.signalAll();
            } finally {
                lock.unlock();
            }

        }
    }

}