package fizzbuzzmultithread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

class FizzBuzz {
    private int n;
    private int i;
    private Lock lock;

    public FizzBuzz(int n) {
        this.n = n;
        this.i = 1;
        this.lock = new ReentrantLock();
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while (i <= n) {
            try {
                lock.lock();
                if (i <= n && (i % 3 == 0 && i % 5 != 0)) {
                    printFizz.run();
                    i++;
                }
            } finally {
                lock.unlock();
            }
        }

    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (i <= n) {
            try {
                lock.lock();
                if (i <= n && (i % 3 != 0 && i % 5 == 0)) {
                    printBuzz.run();
                    i++;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (i <= n) {
            try {
                lock.lock();
                if (i <= n && (i % 3 == 0 && i % 5 == 0)) {
                    printFizzBuzz.run();
                    i++;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while (i <= n) {
            try {
                lock.lock();
                if (i <= n && (i % 3 != 0 && i % 5 != 0)) {
                    printNumber.accept(i);
                    i++;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}