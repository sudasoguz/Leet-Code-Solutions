package printfoobaralternately;

import java.util.concurrent.Semaphore;

class FooBar {
    private int n;
    private Semaphore empty;
    private Semaphore full;

    public FooBar(int n) {
        this.n = n;
        empty = new Semaphore(1);
        full = new Semaphore(0);
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            empty.acquire();
            printFoo.run();
            full.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            full.acquire();
            printBar.run();
            empty.release();
        }
    }
}